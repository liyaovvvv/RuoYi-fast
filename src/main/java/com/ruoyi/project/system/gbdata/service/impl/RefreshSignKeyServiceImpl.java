package com.ruoyi.project.system.gbdata.service;

import com.ruoyi.common.constant.GbDataConstants;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.gbdata.GenerateSign;
import com.ruoyi.common.utils.gbdata.GetAppKeyUtils;
import com.ruoyi.project.system.gbdata.domain.DataDictionary;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by issuser on 2019/11/14.
 */
@Service
public class RefreshSignKeyService {

    @Autowired
    DataDictionaryService dataDictionaryService;
    public void refreshSignKey(){
        String signKey = GetAppKeyUtils.getappkey(GbDataConstants.REFRESH_SECRET_URL, GbDataConstants.GJGXJHPT_SID_VAL,
                GbDataConstants.GJGXJHPT_RID_VAL, GbDataConstants.GJGXJHPT_APP_KEY);
        String nowDateTime = DateUtils.getTime();
        String currentMil = String.valueOf(System.currentTimeMillis());
        String signSecret = GenerateSign.createSign(GbDataConstants.GJGXJHPT_SID_VAL, GbDataConstants.GJGXJHPT_RID_VAL, currentMil, signKey);

        dataDictionaryService.updateDataDictionary(GbDataConstants.GJGXJHPT_SIGN, signKey, nowDateTime);
        dataDictionaryService.updateDataDictionary(GbDataConstants.GJGXJHPT_SIGN_SECRET, signSecret, nowDateTime);
        dataDictionaryService.updateDataDictionary(GbDataConstants.GJGXJHPT_RTIME, currentMil, nowDateTime);
    }

    /**
     * 获取最新的key
     * @return
     */
    public String getSignKey(){
        return getDataDictionaryByKey(GbDataConstants.GJGXJHPT_SIGN).getDvalue();
    }

    /**
     * 获取最新的请求数据用的密钥
     * @Seealso refreshSignKey()
     * @return
     */
    public String getSignSecret(){
        return getDataDictionaryByKey(GbDataConstants.GJGXJHPT_SIGN_SECRET).getDvalue();
    }

    /**
     * 获取和密钥配套的时间戳
     * @return
     */
    public String getGjgxjhptRtime(){
        return getDataDictionaryByKey(GbDataConstants.GJGXJHPT_RTIME).getDvalue();
    }
    /**
     * 获取国办数据下发起始日期
     * @return
     */
    public String getGbDataStartDate(){
        DataDictionary dataDictionary = getDataDictionaryByKey(GbDataConstants.GB_DATA_START_DATE);
        return dataDictionary.getDvalue();
    }

    /**
     * 获取最近一次拉取数据日期
     * @return
     */
    public String getGbDataLastPullDate(String tableId){
        String key = String.format(GbDataConstants.GB_DATA_UPDATE_DATE_FORMATTER, tableId);
        DataDictionary dataDictionary = getDataDictionaryByKey(key);
        return dataDictionary.getDvalue();
    }

    /**
     * 更新最后一次拉取数据的日期
     * @param tableId
     */
    public void updateDateLastPullDate(String tableId, String dateStr){
        String dictKey = String.format(GbDataConstants.GB_DATA_UPDATE_DATE_FORMATTER, tableId);
        if(StringUtils.isEmpty(dateStr)){
            dateStr = DateUtils.getDate();
        }
        String nowDateTime = DateUtils.getTime();
        dataDictionaryService.updateDataDictionary(dictKey, dateStr, nowDateTime);
    }

    public DataDictionary getDataDictionaryByKey(String key){
        return dataDictionaryService.getDataDictionaryByKey(key);
    }

    public void refreshDataDictionary(){
        dataDictionaryService.setDataDictionaryMap();
    }
}
