package com.ruoyi.project.system.gbdata.service;

import com.ruoyi.project.system.gbdata.domain.DataDictionary;

/**
 * Created by issuser on 2019/11/19.
 */
 public interface IRefreshSignKeyService {
     void refreshSignKey();
    /**
     * 获取最新的key
     * @return
     */
     String getSignKey();

    /**
     * 获取最新的请求数据用的密钥
     * @Seealso refreshSignKey()
     * @return
     */
     String getSignSecret();

    /**
     * 获取和密钥配套的时间戳
     * @return
     */
     String getGjgxjhptRtime();
    /**
     * 获取国办数据下发起始日期
     * @return
     */
     String getGbDataStartDate();

    /**
     * 获取最近一次拉取数据日期
     * @return
     */
     String getGbDataLastPullDate(String tableId);

    /**
     * 更新最后一次拉取数据的日期
     * @param tableId
     */
     void updateDateLastPullDate(String tableId, String dateStr);

     DataDictionary getDataDictionaryByKey(String key);
     void refreshDataDictionary();
}
