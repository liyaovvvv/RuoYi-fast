package com.ruoyi.project.system.gbdata.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.system.gbdata.service.IGbDataService;
import com.ruoyi.project.system.gbdata.service.impl.RefreshSignKeyServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by issuser on 2019/11/14.
 */
@Controller
@RequestMapping(value = "/data/gbdata")
public class GbDataController extends BaseController{
    private final String prefix = "system/gbdata/";
    @Autowired
    IGbDataService gbDataService;

    @Autowired
    RefreshSignKeyServiceImpl refreshSignKeyServiceImpl;

    @RequestMapping(value = "/jgxwcheckaction")
    @ResponseBody
    public String requestJgxwCheckAction(@RequestParam(value = "tableId") String tableId,
                                         @RequestParam(value = "testMod") String testMode,
                                         @RequestParam(value = "date") String date){
        if(StringUtils.isEmpty(tableId)){
            tableId = "1";
        }
        /**
         *  test mod:
         *      1 -- 开启
         *      0 -- 关闭
         *  开启时返回响应到页面
         *  关闭时正常入库
         */
        if(StringUtils.isEmpty(testMode)){
            testMode = "0";
        }
        return gbDataService.getGbDataByHttp(tableId, testMode, date);
    }

    @RequestMapping(value = "/refreshsecretkey")
    @ResponseBody
    public void refreshSecretKey(){
        refreshSignKeyServiceImpl.refreshSignKey();
    }

    @RequestMapping(value = "/refreshDataDictionary")
    @ResponseBody
    public void refreshDataDictionary(){
        refreshSignKeyServiceImpl.refreshDataDictionary();
    }

    @RequestMapping(value = "/addDataManual")
    @ResponseBody
    public AjaxResult addDataManual(@RequestParam(value = "jsonVal") String jsonValue, @RequestParam(value = "tableId") String tableId){
        String response = gbDataService.manualAddData(jsonValue, tableId);
        return AjaxResult.success(response);
    }

    @RequestMapping(value = "/action")
    public String actionTest(){
        return prefix + "action";
    }

    @RequestMapping(value = "/add")
    public String addTest(){
        return prefix + "add";
    }

    @RequestMapping(value = "/edit")
    public String editTest(){
        return prefix + "edit";
    }
}
