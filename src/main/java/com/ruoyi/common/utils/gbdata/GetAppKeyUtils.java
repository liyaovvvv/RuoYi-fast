package com.ruoyi.common.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruoyi.common.utils.http.HttpClientUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class GetAppKeyUtils {
    // 获取密钥
    public static String getappkey(String url, String gjgxjhpt_sid, String gjgxjhpt_rid, String gjgxjhpt_appkey) {
        String result = "";
        String gjgxjhpt_rtime = String.valueOf(System.currentTimeMillis());
        // 加密转换 sign APPKey
        String sign = GenerateSign.createSign(gjgxjhpt_sid, gjgxjhpt_rid, gjgxjhpt_rtime, gjgxjhpt_appkey);
        log.info(sign);
        Map<String, String> headerMap = new HashMap<>();
        headerMap.put("gjgxjhpt_sid", gjgxjhpt_sid);
        headerMap.put("gjgxjhpt_rid", gjgxjhpt_rid);
        headerMap.put("gjgxjhpt_rtime", gjgxjhpt_rtime);
        headerMap.put("gjgxjhpt_sign", sign);
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

}
