package com.ruoyi.project.system.recode.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.recode.domain.AccountRecode;
import com.ruoyi.project.system.recode.service.IAccountRecodeService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 统计数据存储Controller
 * 
 * @author ruoyi
 * @date 2019-09-21
 */
@Controller
@RequestMapping("/system/recode")
public class AccountRecodeController extends BaseController
{
    private String prefix = "system/recode";

    @Autowired
    private IAccountRecodeService accountRecodeService;

    @RequiresPermissions("system:recode:view")
    @GetMapping()
    public String recode()
    {
        return prefix + "/recode";
    }

    /**
     * 查询统计数据存储列表
     */
    @RequiresPermissions("system:recode:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AccountRecode accountRecode)
    {
        startPage();
        List<AccountRecode> list = accountRecodeService.selectAccountRecodeList(accountRecode);
        return getDataTable(list);
    }

    /**
     * 导出统计数据存储列表
     */
    @RequiresPermissions("system:recode:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AccountRecode accountRecode)
    {
        List<AccountRecode> list = accountRecodeService.selectAccountRecodeList(accountRecode);
        ExcelUtil<AccountRecode> util = new ExcelUtil<AccountRecode>(AccountRecode.class);
        return util.exportExcel(list, "recode");
    }

    /**
     * 新增统计数据存储
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存统计数据存储
     */
    @RequiresPermissions("system:recode:add")
    @Log(title = "统计数据存储", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(AccountRecode accountRecode)
    {
        return toAjax(accountRecodeService.insertAccountRecode(accountRecode));
    }

    /**
     * 修改统计数据存储
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        AccountRecode accountRecode = accountRecodeService.selectAccountRecodeById(id);
        mmap.put("accountRecode", accountRecode);
        return prefix + "/edit";
    }

    /**
     * 修改保存统计数据存储
     */
    @RequiresPermissions("system:recode:edit")
    @Log(title = "统计数据存储", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AccountRecode accountRecode)
    {
        return toAjax(accountRecodeService.updateAccountRecode(accountRecode));
    }

    /**
     * 删除统计数据存储
     */
    @RequiresPermissions("system:recode:remove")
    @Log(title = "统计数据存储", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(accountRecodeService.deleteAccountRecodeByIds(ids));
    }
}
