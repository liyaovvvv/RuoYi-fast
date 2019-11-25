package com.ruoyi.project.system.data.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.system.data.service.IDataViewService;
import com.ruoyi.project.system.recode.domain.AccountRecode;
import com.ruoyi.project.system.recode.service.IAccountRecodeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/data")
public class DataViewController extends BaseController {

    private String prefix = "system/data";

    @Resource
    private IDataViewService dataViewService;

    @Resource
    private IAccountRecodeService accountRecodeService;

    @GetMapping("/dataZlDetail")
    public String dataZlDetail()
    {
        return prefix + "/dataZlDetail";
    }

    @GetMapping("/index")
    public String index()
    {
        return prefix + "/dataIndex";
    }

    @GetMapping("/dataTableGroupJgsxSz")
    public String dataTableGroupJgsxSz()
    {
        return prefix + "/dataTableGroupJgsxSz";
    }

    @GetMapping("/dataTableGroupJgsxDs")
    public String dataTableGroupJgsxDs()
    {
        return prefix + "/dataTableGroupJgsxDs";
    }


    @GetMapping("/dataTableGroupJgsxSzZq")
    public String dataTableGroupJgsxSzZq()
    {
        return prefix + "/dataTableGroupJgsxSzZq";
    }

    @GetMapping("/dataTableGroupJgsxDsZq")
    public String dataTableGroupJgsxDsZq()
    {
        return prefix + "/dataTableGroupJgsxDsZq";
    }




    @GetMapping("/dataTableGroupDs")
    public String dataTableGroupDs()
    {
        return prefix + "/dataTableGroupDs";
    }


    @GetMapping("/dataTableGroupDsChange")
    public String dataTableGroupDsChange()
    {
        return prefix + "/dataTableGroupDsChange";
    }

    @GetMapping("/dataTableGroupSz")
    public String dataTableGroupSz()
    {
        return prefix + "/dataTableGroupSz";
    }

    @GetMapping("/dataTableGroupSzChange")
    public String dataTableGroupSzChange()
    {
        return prefix + "/dataTableGroupSzChange";
    }

    @GetMapping("/dataQzView")
    public String dataQzView()
    {
        return prefix + "/dataQzView";
    }

    @GetMapping("/dataSzView")
    public String dataSzView()
    {
        return prefix + "/dataSzView";
    }

    @GetMapping("/dataQzColumnsRequired")
    public String dataQzColumnsRequired()
    {
        return prefix + "/dataQzColumnsRequired";
    }

    @GetMapping("/dataQzColumnsError")
    public String dataQzColumnsError()
    {
        return prefix + "/dataQzColumnsError";
    }

    @GetMapping("/dataZlError")
    public String dataZlError()
    {
        return prefix + "/dataZlError";
    }

    @GetMapping("/dataJGSX")
    public String dataJGSX()
    {
        return prefix + "/dataJGSX";
    }

    @GetMapping("/dataQzAndHjView")
    public String dataQzAndHjView()
    {
        return prefix + "/dataQzAndHjView";
    }

    @GetMapping("/existingItemView")
    public String existingItemView()
    {
        return prefix + "/existingItemView";
    }

    @GetMapping("/notExistingItemView")
    public String notExistingItemView()
    {
        return prefix + "/notExistingItemView";
    }

    /**
     * 前置地市数据量统计
     * @param accountRecode
     * @return
     */
    @PostMapping("/accountQZ")
    @ResponseBody
    public TableDataInfo accountQZ(AccountRecode accountRecode)
    {
        //如果是查询历史数据
        if (accountRecode.getRemark().equals("history")){
            if (accountRecode.getCreateTime() == null){
                accountRecode.setCreateTime(new Date());
            }
            List<AccountRecode> recodes = accountRecodeService.selectAccountRecodeList(accountRecode);
            TableDataInfo tableDataInfo = new TableDataInfo();
            if (recodes != null && recodes.size() > 0){
                JSONArray list = JSONArray.parseArray(recodes.get(0).getData());
                tableDataInfo = getDataTable(list);
            }
            return tableDataInfo;
        }
        List<JSONObject> list = dataViewService.accountQZ();
        return getDataTable(list);
    }

    /**
     * 获取前置地市名称
     * @return
     */
    @PostMapping("/getQzCity")
    @ResponseBody
    public List<JSONObject> getQzCity()
    {
        List<JSONObject> list = dataViewService.getQzCity();
        return list;
    }

    /**
     * 前置省直数据量统计
     * @param accountRecode
     * @return
     */
    @PostMapping("/accountSz")
    @ResponseBody
    public TableDataInfo accountSz(AccountRecode accountRecode)
    {
        //如果是查询历史数据
        if (accountRecode.getRemark().equals("history")){
            if (accountRecode.getCreateTime() == null){
                accountRecode.setCreateTime(new Date());
            }
            List<AccountRecode> recodes = accountRecodeService.selectAccountRecodeList(accountRecode);
            TableDataInfo tableDataInfo = new TableDataInfo();
            if (recodes != null && recodes.size() > 0){
                JSONArray list = JSONArray.parseArray(recodes.get(0).getData());
                tableDataInfo = getDataTable(list);
            }
            return tableDataInfo;
        }
        List<JSONObject> list = dataViewService.accountSz();
        return getDataTable(list);
    }

    /**
     * 数据治理明细表头信息获取
     * @return
     */
    @GetMapping("/accountDataColumns")
    @ResponseBody
    public JSONArray accountDataColumns()
    {
        JSONArray array = dataViewService.accountDataColumns();
        return array;
    }

    /**
     * 分类统计表头信息获取
     * @return
     */
    @GetMapping("/getDsTableGroupColumns")
    @ResponseBody
    public JSONArray getDsTableGroupColumns()
    {
        JSONArray array = dataViewService.getDsTableGroupColumns();
        return array;
    }

    /**
     * 监管统计表头信息获取
     * @return
     */
    @GetMapping("/getJgswSzTableGroupColumns")
    @ResponseBody
    public JSONArray getJgswSzTableGroupColumns()
    {
        JSONArray array = dataViewService.getJgswSzTableGroupColumns();
        return array;
    }

    /**
     * 监管统计表头信息获取
     * @return
     */
    @GetMapping("/getJgswDsTableGroupColumns")
    @ResponseBody
    public JSONArray getJgswDsTableGroupColumns()
    {
        JSONArray array = dataViewService.getJgswDsTableGroupColumns();
        return array;
    }

    /**
     * 数据治理明细统计
     * @param accountRecode
     * @return
     */
    @PostMapping("/accountData")
    @ResponseBody
    public TableDataInfo accountData(AccountRecode accountRecode)
    {
        //如果是查询历史数据
        if (accountRecode.getRemark().equals("history")){
            if (accountRecode.getCreateTime() == null){
                accountRecode.setCreateTime(new Date());
            }
            List<AccountRecode> recodes = accountRecodeService.selectAccountRecodeList(accountRecode);
            TableDataInfo tableDataInfo = new TableDataInfo();
            if (recodes != null && recodes.size() > 0){
                JSONArray list = JSONArray.parseArray(recodes.get(0).getData());
                tableDataInfo = getDataTable(list);
            }
            return tableDataInfo;
        }
        JSONArray list = dataViewService.accountData();
        return getDataTable(list);
    }

    /**
     * 获取地市表分类统计
     * @param accountRecode
     * @return
     */
    @PostMapping("/getDsTableGroupData")
    @ResponseBody
    public TableDataInfo getDsTableGroupData(AccountRecode accountRecode)
    {
        //如果是查询历史数据
        if (accountRecode.getRemark().equals("history")){
            if (accountRecode.getCreateTime() == null){
                accountRecode.setCreateTime(new Date());
            }
            List<AccountRecode> recodes = accountRecodeService.selectAccountRecodeList(accountRecode);
            TableDataInfo tableDataInfo = new TableDataInfo();
            if (recodes != null && recodes.size() > 0){
                JSONArray list = JSONArray.parseArray(recodes.get(0).getData());
                tableDataInfo = getDataTable(list);
            }
            return tableDataInfo;
        }
        List<Map<String, Object>> list = dataViewService.getDsTableGroupData();
        return getDataTable(list);
    }

    /**
     * 获取地市表分类当日变化统计
     * @param accountRecode
     * @return
     */
    @PostMapping("/getDsTableGroupDataChange")
    @ResponseBody
    public TableDataInfo getDsTableGroupDataChange(AccountRecode accountRecode)
    {
            List<AccountRecode> recodes = accountRecodeService.selectAccountRecodeListChangeDs(accountRecode);
            TableDataInfo tableDataInfo = new TableDataInfo();
            if (recodes != null && recodes.size() == 2){
                JSONArray listLast = JSONArray.parseArray(recodes.get(0).getData());
                JSONArray listSecond = JSONArray.parseArray(recodes.get(1).getData());
                JSONArray arrayChange =new JSONArray();
                for(int i=0;i<listLast.size();i++){
                    JSONObject list1 = listLast.getJSONObject(i);
                    JSONObject list2 = listSecond.getJSONObject(i);
                    JSONObject jsonObject = new JSONObject();
                    Iterator<String> s = list1.keySet().iterator();
                    while (s.hasNext()) {
                      String  key = s.next();
                      int tempChange =0;
                      if( !key.contains("city")  ) {
                          tempChange = Integer.valueOf(list1.get(key).toString()) - Integer.valueOf(list2.get(key).toString());
                          System.out.println(tempChange);
                          jsonObject.put(key,tempChange);
                      }else{
                          jsonObject.put(key,list1.get(key));
                      }

                    }
                    arrayChange.add(jsonObject);
                }
                tableDataInfo = getDataTable(arrayChange);
            }
            return tableDataInfo;

    }


    /**
     * 获取省直表分类统计
     * @param accountRecode
     * @return
     */
    @PostMapping("/getSzTableGroupDataChange")
    @ResponseBody
    public TableDataInfo getSzTableGroupDataChange(AccountRecode accountRecode)
    {
        List<AccountRecode> recodes = accountRecodeService.selectAccountRecodeListChangeSz(accountRecode);
        TableDataInfo tableDataInfo = new TableDataInfo();
        if (recodes != null && recodes.size() == 2){
            JSONArray listLast = JSONArray.parseArray(recodes.get(0).getData());
            JSONArray listSecond = JSONArray.parseArray(recodes.get(1).getData());
            JSONArray arrayChange =new JSONArray();
            for(int i=0;i<listLast.size();i++){
                JSONObject list1 = listLast.getJSONObject(i);
                JSONObject list2 = listSecond.getJSONObject(i);
                JSONObject jsonObject = new JSONObject();
                Iterator<String> s = list1.keySet().iterator();
                while (s.hasNext()) {
                    String  key = s.next();
                    int tempChange =0;
                    if( !key.contains("city")  ) {
                        tempChange = Integer.valueOf(list1.get(key).toString()) - Integer.valueOf(list2.get(key).toString());
                        System.out.println(tempChange);
                        jsonObject.put(key,tempChange);
                    }else{
                        jsonObject.put(key,list1.get(key));
                    }

                }
                arrayChange.add(jsonObject);
            }
            tableDataInfo = getDataTable(arrayChange);
        }
        return tableDataInfo;
    }


    /**
     * 获取 监管事项覆盖率（标准库） 上报及时率
     * @param accountRecode
     * @return
     */
    @PostMapping("/getJgsxSzTableGroupData")
    @ResponseBody
    public TableDataInfo getJgsxSzTableGroupData(AccountRecode accountRecode)
    {
        //如果是查询历史数据
/*        if (accountRecode.getRemark().equals("history")){
            if (accountRecode.getCreateTime() == null){
                accountRecode.setCreateTime(new Date());
            }
            List<AccountRecode> recodes = accountRecodeService.selectAccountRecodeList(accountRecode);
            TableDataInfo tableDataInfo = new TableDataInfo();
            if (recodes != null && recodes.size() > 0){
                JSONArray list = JSONArray.parseArray(recodes.get(0).getData());
                tableDataInfo = getDataTable(list);
            }
            return tableDataInfo;
        }*/
        List<JSONObject> list = dataViewService.getSzJgsxZyfgl();
        return getDataTable(list);
    }

    /**
     * 获取 监管事项覆盖率（标准库） 上报及时率
     * @param accountRecode
     * @return
     */
    @PostMapping("/getJgsxDsTableGroupData")
    @ResponseBody
    public TableDataInfo getJgsxDsTableGroupData(AccountRecode accountRecode)
    {
        //如果是查询历史数据
/*        if (accountRecode.getRemark().equals("history")){
            if (accountRecode.getCreateTime() == null){
                accountRecode.setCreateTime(new Date());
            }
            List<AccountRecode> recodes = accountRecodeService.selectAccountRecodeList(accountRecode);
            TableDataInfo tableDataInfo = new TableDataInfo();
            if (recodes != null && recodes.size() > 0){
                JSONArray list = JSONArray.parseArray(recodes.get(0).getData());
                tableDataInfo = getDataTable(list);
            }
            return tableDataInfo;
        }*/
        List<JSONObject> list = dataViewService.getDsJgsxZyfgl();
        return getDataTable(list);
    }


    /**
     * 获取 监管事项覆盖率（正确库） 上报及时率
     * @param accountRecode
     * @return
     */
    @PostMapping("/getJgsxSzTableGroupDataZq")
    @ResponseBody
    public TableDataInfo getJgsxSzTableGroupDataZq(AccountRecode accountRecode)
    {
        //如果是查询历史数据
/*        if (accountRecode.getRemark().equals("history")){
            if (accountRecode.getCreateTime() == null){
                accountRecode.setCreateTime(new Date());
            }
            List<AccountRecode> recodes = accountRecodeService.selectAccountRecodeList(accountRecode);
            TableDataInfo tableDataInfo = new TableDataInfo();
            if (recodes != null && recodes.size() > 0){
                JSONArray list = JSONArray.parseArray(recodes.get(0).getData());
                tableDataInfo = getDataTable(list);
            }
            return tableDataInfo;
        }*/
        List<JSONObject> list = dataViewService.getSzJgsxZyfglZq();
        return getDataTable(list);
    }

    /**
     * 获取 监管事项覆盖率（正确库） 上报及时率
     * @param accountRecode
     * @return
     */
    @PostMapping("/getJgsxDsTableGroupDataZq")
    @ResponseBody
    public TableDataInfo getJgsxDsTableGroupDataZq(AccountRecode accountRecode)
    {
        //如果是查询历史数据
/*        if (accountRecode.getRemark().equals("history")){
            if (accountRecode.getCreateTime() == null){
                accountRecode.setCreateTime(new Date());
            }
            List<AccountRecode> recodes = accountRecodeService.selectAccountRecodeList(accountRecode);
            TableDataInfo tableDataInfo = new TableDataInfo();
            if (recodes != null && recodes.size() > 0){
                JSONArray list = JSONArray.parseArray(recodes.get(0).getData());
                tableDataInfo = getDataTable(list);
            }
            return tableDataInfo;
        }*/
        List<JSONObject> list = dataViewService.getDsJgsxZyfglZq();
        return getDataTable(list);
    }


    /**
     * 获取省直表分类统计
     * @param accountRecode
     * @return
     */
    @PostMapping("/getSzTableGroupData")
    @ResponseBody
    public TableDataInfo getSzTableGroupData(AccountRecode accountRecode)
    {
        //如果是查询历史数据
        if (accountRecode.getRemark().equals("history")){
            if (accountRecode.getCreateTime() == null){
                accountRecode.setCreateTime(new Date());
            }
            List<AccountRecode> recodes = accountRecodeService.selectAccountRecodeList(accountRecode);
            TableDataInfo tableDataInfo = new TableDataInfo();
            if (recodes != null && recodes.size() > 0){
                JSONArray list = JSONArray.parseArray(recodes.get(0).getData());
                tableDataInfo = getDataTable(list);
            }
            return tableDataInfo;
        }
        List<Map<String, Object>> list = dataViewService.getSzTableGroupData();
        return getDataTable(list);
    }

    /**
     * 前置库缺少必需字段统计
     * @return
     */
    @PostMapping("/accountQzColumnsRequired")
    @ResponseBody
    public TableDataInfo accountQzColumnsRequired()
    {
        JSONArray list = dataViewService.accountQzColumnsRequired();
        return getDataTable(list);
    }

    /**
     * 前置库不符合字段统计
     * @return
     */
    @PostMapping("/getQzColumnsError")
    @ResponseBody
    public TableDataInfo getQzColumnsError()
    {
        List<JSONObject> list = dataViewService.getQzColumnsError();
        return getDataTable(list);
    }

    /**
     * 错误数据统计
     * @return
     */
    @PostMapping("/getZlErrorData")
    @ResponseBody
    public TableDataInfo getZlErrorData(AccountRecode accountRecode)
    {
        //如果是查询历史数据
        if (accountRecode.getRemark().equals("history")){
            if (accountRecode.getCreateTime() == null){
                accountRecode.setCreateTime(new Date());
            }
            List<AccountRecode> recodes = accountRecodeService.selectAccountRecodeList(accountRecode);
            TableDataInfo tableDataInfo = new TableDataInfo();
            if (recodes != null && recodes.size() > 0){
                JSONArray list = JSONArray.parseArray(recodes.get(0).getData());
                tableDataInfo = getDataTable(list);
            }
            return tableDataInfo;
        }
        List<JSONObject> list = dataViewService.getZlErrorData();
        return getDataTable(list);
    }

    /**
     * \地市监管数据统计
     * @return
     */
    @GetMapping("/getDsGjsxByCity")
    @ResponseBody
    public List<JSONObject> getDsGjsxByCity(@RequestParam("table_schema") String table_schema)
    {
        List<JSONObject> list = dataViewService.getDsGjsxByCity(table_schema);
        //return getDataTable(list);
        return list;
    }

    /**
     * \地市汇集数据对比
     * @return
     */
    @PostMapping("/compareQzAndHj")
    @ResponseBody
    public TableDataInfo compareQzAndHj()
    {
        List<JSONObject> list = dataViewService.compareQzAndHj();
        return getDataTable(list);
    }

    /**
     * \已存在事项统计
     * @return
     */
    @PostMapping("/getExistingItem")
    @ResponseBody
    public TableDataInfo getExistingItem()
    {
        List<JSONObject> list = dataViewService.getExistingItem();
        return getDataTable(list);
    }

    /**
     * \缺少事项统计
     * @return
     */
    @PostMapping("/getNotExistingItem")
    @ResponseBody
    public TableDataInfo getNotExistingItem()
    {
        List<JSONObject> list = dataViewService.getNotExistingItem();
        return getDataTable(list);
    }



}
