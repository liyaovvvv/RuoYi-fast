package com.ruoyi.project.system.opt.controller;

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
import com.ruoyi.project.system.opt.domain.TableDataOpt;
import com.ruoyi.project.system.opt.service.ITableDataOptService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 合表配置Controller
 * 
 * @author ruoyi
 * @date 2019-09-20
 */
@Controller
@RequestMapping("/system/opt")
public class TableDataOptController extends BaseController
{
    private String prefix = "system/opt";

    @Autowired
    private ITableDataOptService tableDataOptService;

    @RequiresPermissions("system:opt:view")
    @GetMapping()
    public String opt()
    {
        return prefix + "/opt";
    }

    /**
     * 查询合表配置列表
     */
    @RequiresPermissions("system:opt:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TableDataOpt tableDataOpt)
    {
        startPage();
        List<TableDataOpt> list = tableDataOptService.selectTableDataOptList(tableDataOpt);
        return getDataTable(list);
    }

    /**
     * 导出合表配置列表
     */
    @RequiresPermissions("system:opt:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TableDataOpt tableDataOpt)
    {
        List<TableDataOpt> list = tableDataOptService.selectTableDataOptList(tableDataOpt);
        ExcelUtil<TableDataOpt> util = new ExcelUtil<TableDataOpt>(TableDataOpt.class);
        return util.exportExcel(list, "opt");
    }

    /**
     * 新增合表配置
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存合表配置
     */
    @RequiresPermissions("system:opt:add")
    @Log(title = "合表配置", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TableDataOpt tableDataOpt)
    {
        return toAjax(tableDataOptService.insertTableDataOpt(tableDataOpt));
    }

    /**
     * 修改合表配置
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TableDataOpt tableDataOpt = tableDataOptService.selectTableDataOptById(id);
        mmap.put("tableDataOpt", tableDataOpt);
        return prefix + "/edit";
    }

    /**
     * 修改保存合表配置
     */
    @RequiresPermissions("system:opt:edit")
    @Log(title = "合表配置", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TableDataOpt tableDataOpt)
    {
        return toAjax(tableDataOptService.updateTableDataOpt(tableDataOpt));
    }

    /**
     * 删除合表配置
     */
    @RequiresPermissions("system:opt:remove")
    @Log(title = "合表配置", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tableDataOptService.deleteTableDataOptByIds(ids));
    }
}
