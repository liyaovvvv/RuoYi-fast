package com.ruoyi.common.utils.gbdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruoyi.common.constant.GbDataConstants;
import com.ruoyi.common.utils.http.HttpClientUtil;
import com.ruoyi.project.system.gbdata.service.impl.RefreshSignKeyServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class GetAppKeyUtils {
    @Autowired
    private RefreshSignKeyServiceImpl refreshSignKeyServiceImpl;
    // 获取密钥
    public static String getappkey(String url, String gjgxjhpt_sid, String gjgxjhpt_rid, String gjgxjhpt_appkey) {
        String result = "";
        String gjgxjhpt_rtime = String.valueOf(System.currentTimeMillis());
        // 加密转换 sign APPKey
        String sign = GenerateSign.createSign(gjgxjhpt_sid, gjgxjhpt_rid, gjgxjhpt_rtime, gjgxjhpt_appkey);
        log.info(sign);
        Map<String, String> headerMap = new HashMap<>();
        headerMap.put(GbDataConstants.GJGXJHPT_SID, gjgxjhpt_sid);
        headerMap.put(GbDataConstants.GJGXJHPT_RID, gjgxjhpt_rid);
        headerMap.put(GbDataConstants.GJGXJHPT_RTIME, gjgxjhpt_rtime);
        headerMap.put(GbDataConstants.GJGXJHPT_SIGN, sign);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(headerMap);
            String str = HttpClientUtil.doPostNew(url, null, json);
            String secret;
            SecretHeaders secretHeader = mapper.readValue(str, SecretHeaders.class);
            if (secretHeader != null) {
                SecretDatas secretData = secretHeader.getData();
                //获取调用接口的密钥
                secret = secretData.getSecret();
                //对密钥要进行解密,使用appkey(应用授权码)解密
//                result = GenerateSign.AESEncode("111111", "abc");
                result = GenerateSign.AESDncode(gjgxjhpt_appkey, secret);
            }
        } catch (Exception e) {
            log.info(e.getMessage());
        }
        log.info("更新后的密钥----------->" + result);
        return result;
    }

    public static Map<String, String> getHeaderMap(String sid, String rid, String signSecret, String jgxfTime) {
        Map<String, String> headerMap = new HashMap<>();
        //String gjgxjhpt_rtime = String.valueOf(System.currentTimeMillis()); // "1543823040994";//
        // 加密转换 sign APPKey
        log.info("gjgxjhpt_sid----------->" + sid);
        log.info("gjgxjhpt_rid----------->" + rid);
        log.info("gjgxjhpt_rtime--------->" + jgxfTime);

        /**修改为从data_dictionary表中取sign**/
        //log.info("gjgxjhpt_appsecret-------->" + secretKey);
        //String sign = GenerateSign.createSign(sid, rid, gjgxjhpt_rtime, secretKey);
        log.info("gjgxjhpt_sign_key-------->" + signSecret);

        headerMap.put(GbDataConstants.GJGXJHPT_SID, sid);
        headerMap.put(GbDataConstants.GJGXJHPT_RID, rid);
        headerMap.put(GbDataConstants.GJGXJHPT_RTIME, jgxfTime);
        headerMap.put(GbDataConstants.GJGXJHPT_SIGN, signSecret);
        //接口身份验证 后期可能会修改
        //headerMap.put("Authorization", "Basic Z3hzZDAxOjY2NjY2Ng==");
        return headerMap;
    }
}
