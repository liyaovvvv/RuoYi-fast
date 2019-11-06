package com.ruoyi.project.system.data.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * 用户 业务层
 * 
 * @author ruoyi
 */
public interface IDataViewService
{

    List<JSONObject> accountQZ();

    JSONArray accountData();

    List<Map<String, Object>> getDsTableGroupData();

    List<Map<String, Object>> getJgTableGroupData();

    JSONArray getDsTableGroupColumns();

    JSONArray getJgswSzTableGroupColumns();

    JSONArray getJgswDsTableGroupColumns();

    JSONArray accountDataColumns();

    JSONArray accountQzColumnsRequired();

    List<Map<String, Object>> getSzTableGroupData();

    List<JSONObject> getQzColumnsError();

    List<JSONObject> getZlErrorData();

    List<JSONObject> accountSz();

    List<JSONObject> getQzCity();

    List<JSONObject> getDsGjsxByCity(String table_schema);

    List<JSONObject> compareQzAndHj();

    List<JSONObject> getExistingItem();

    List<JSONObject> getNotExistingItem();

    List<JSONObject> getSzJgsxZyfgl();

    List<JSONObject> getDsJgsxZyfgl();
}
