package com.ruoyi.project.system.gbdata.mapper.impl;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.project.system.gbdata.domain.*;
import com.ruoyi.project.system.gbdata.mapper.GbDataViewMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by issuser on 2019/11/15.
 */
@Service
public class GbDataViewMapperImpl {
    @Resource
    private GbDataViewMapper gbDataViewMapper;

    public List<DataDictionary> queryDataDictionary(){
        List<DataDictionary> resultList = gbDataViewMapper.getDataDictionary();
        return resultList;
    }

    public List<ImplementOrgCode> queryImplementOrgCode(){
        List<ImplementOrgCode> resultList = gbDataViewMapper.getImplementOrgCode();
        return resultList;
    }

    public void updateDictionary(String key, String value, String updateTime) throws Exception{
        gbDataViewMapper.updateDataDictionary(key, value, updateTime);
    }

    public void insertJgJgxwCheckAction(JgJgxwCheckAction jgJgxwCheckAction) throws Exception{
        gbDataViewMapper.insertJgJgxwCheckAction(jgJgxwCheckAction);
    }

    public void insertJgxwOtherAction(JgJgxwOtherAction jgJgxwOtherAction) throws Exception{
        gbDataViewMapper.insertJgJgxwOtherAction(jgJgxwOtherAction);
    }

    public void insertJgxwPunishAction(JgJgxwPunishAction jgJgxwPunishAction) throws Exception{
        gbDataViewMapper.insertJgJgxwPunishAction(jgJgxwPunishAction);
    }

    public void insertJgxwForceAction(JgJgxwForceAction jgJgxwForceAction) throws Exception{
        gbDataViewMapper.insertJgJgxwForceAction(jgJgxwForceAction);
    }

    public List<ErrorRecord> queryErrorRecord(){
        List<ErrorRecord> errorRecordList = gbDataViewMapper.selectErrorRecordList(null);
        return errorRecordList;
    }

    public void insertErrorRecord(ErrorRecord errorRecord) throws Exception{
        gbDataViewMapper.insertErrorRecord(errorRecord);
    }
}
