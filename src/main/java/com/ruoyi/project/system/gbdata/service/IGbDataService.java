package com.ruoyi.project.system.gbdata.service;

/**
 * Created by issuser on 2019/11/14.
 */
public interface IGbDataService {
    String getGbDataByHttp(String tableId, String testMod, String date);
    String manualAddData(String filePath, String tableId);
    void getGbdataByWs(String tableId);
}
