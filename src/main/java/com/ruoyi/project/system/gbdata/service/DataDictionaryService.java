package com.ruoyi.project.system.gbdata.service;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.ruoyi.project.system.gbdata.domain.DataDictionary;
import com.ruoyi.project.system.gbdata.mapper.impl.GbDataViewMapperImpl;
import com.ruoyi.project.system.gbdata.service.impl.RefreshSignKeyServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * Created by issuser on 2019/11/15.
 */
@Service
public class DataDictionaryService {
    private static final Logger logger = LoggerFactory.getLogger(DataDictionaryService.class);
    private static Map<String, DataDictionary> dataDictionaryMap = Maps.newHashMap();

    @Autowired
    GbDataViewMapperImpl gbDataViewMapper;

    @PostConstruct
    public void init(){
        setDataDictionaryMap();
    }

    public void setDataDictionaryMap(){
        List<DataDictionary> resultList = gbDataViewMapper.queryDataDictionary();
        for(DataDictionary dataDictionary : resultList){
            String key = dataDictionary.getDkey();

            if(StringUtils.isNotEmpty(key) && null != dataDictionary){
                dataDictionaryMap.put(key, dataDictionary);
            }
        }
    }

    public void updateDataDictionary(String key, String value, String updateTime){
        try {
            if(StringUtils.isNotEmpty(key) && dataDictionaryMap.containsKey(key) && StringUtils.isNotEmpty(value)){
                DataDictionary dataDictionary = dataDictionaryMap.get(key);
                dataDictionary.setDvalue(value);
                dataDictionary.setUpdateTime(updateTime);
                dataDictionaryMap.put(key, dataDictionary);
                gbDataViewMapper.updateDictionary(key, value, updateTime);
            }
        } catch (Exception e) {
            String errMsg = StringUtils.isNotEmpty(e.getMessage()) ? e.getMessage() : e.getCause().getMessage();
            StringBuilder errorInfo = new StringBuilder();
            errorInfo.append("Update data_dictionary failed with error: ")
                    .append(errMsg)
                    .append(". Updated key is: " )
                    .append(key)
                    .append(", value is: ")
                    .append(value)
                    .append(", date is: ")
                    .append(updateTime);

            logger.error(errorInfo.toString());
        }
    }

    public DataDictionary getDataDictionaryByKey(String key){
        return dataDictionaryMap.get(key);
    }
}
