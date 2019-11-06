package com.ruoyi.project.system.data.mapper;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.framework.aspectj.lang.annotation.DataSource;
import com.ruoyi.framework.aspectj.lang.enums.DataSourceType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户表 数据层
 * 
 * @author ruoyi
 */
public interface DataViewMapper
{


    List<JSONObject> getDsTableInfos();

    @DataSource(DataSourceType.ZQ)
    List<JSONObject> getJCTableInfos();

    @DataSource(DataSourceType.HJ)
    List<JSONObject> getHJTableInfos();
    /**存在问题*/
    //@DataSource(DataSourceType.SLAVE)
    //List<JSONObject> getZLData(JSONObject tableInfo);

    @DataSource(DataSourceType.BZ)
    List<JSONObject> getBZData(JSONObject tableInfo);

    @DataSource(DataSourceType.ZQ)
    List<JSONObject> getZQData(JSONObject tableInfo);

    Long getQZTableData(JSONObject qz);

    @DataSource(DataSourceType.HJ)
    Long getHjTableData(JSONObject qz);

    List<JSONObject> getSourceName();

    long getDataByCity(List<JSONObject> optInfos);

    /**存在问题*/
    //@DataSource(DataSourceType.SLAVE)
    //JSONObject getDataByHJ(List<JSONObject> existTable);

    @DataSource(DataSourceType.BZ)
    JSONObject getDataByHJ(List<JSONObject> existTable);

    @DataSource(DataSourceType.ZQ)
    JSONObject getDataByJC(List<JSONObject> existTable);

    List<JSONObject> accountQzColumnsRequired();


    List<JSONObject> getSzTableInfos();

    List<JSONObject> getQzColumnsError();

    /**存在问题*/
    @DataSource(DataSourceType.BZ)
    List<JSONObject> getZlErrorData(@Param("hjTableName") String hjTableName, @Param("fdTableName") String fdTableName, @Param("fiTableName") String fiTableName);

    @DataSource(DataSourceType.BZ)
    List<JSONObject> getExistTablesInErrorDB();

    List<JSONObject> getDsGjsxTableInfos(String table_schema);

    List<JSONObject> getDsGjsxByCity(List<JSONObject> tableInfos);

    @DataSource(DataSourceType.HJ)
    List<JSONObject> getExistingItem();

    @DataSource(DataSourceType.HJ)
    List<JSONObject> getNotExistingItem();

    @DataSource(DataSourceType.HJ)
    List<JSONObject> getSzJgsxZyfgl();

    @DataSource(DataSourceType.HJ)
    List<JSONObject> getDsJgsxZyfgl();

}
