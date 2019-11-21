package com.cloud.icenter.countryserviceproxy.utils;
/**
 * http请求调用
 *
 * @author issuser
 */

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HttpClientUtil {
    private static CloseableHttpClient httpClient = HttpClients.createDefault();
    private static final Logger log = LoggerFactory.getLogger(HttpClientUtil.class);

    /**
     * 带参数的post请求
     *
     * @param url
     * @param headerMap
     * @return
     * @throws Exception
     */
    public static String doPost(String url, Map<String, String> headerMap, String json) {
        // 声明httpPost请求
        HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader(HTTP.CONTENT_TYPE, "application/json");
        // 加入header信息
        if (headerMap != null) {
            for (Map.Entry<String, String> entry : headerMap.entrySet()) {
                httpPost.addHeader(entry.getKey(), entry.getValue());
            }
        }
        StringEntity bodyParams = new StringEntity(json, "UTF-8");
        bodyParams.setContentType("text/json");
        bodyParams.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
        // 把表单放到post里
        httpPost.setEntity(bodyParams);
        // 发起请求
        CloseableHttpResponse response = null;
        String result;
        try {
            response = httpClient.execute(httpPost);
            result = EntityUtils.toString(response.getEntity(), "UTF-8");
        } catch (IOException e) {
            result = e.getMessage();
        } finally {
            closeResponse(response);
        }
        return result;
    }

    public static String doPostsWSDL(String url, String soapRequestData) {
        String content = "";
        // 声明httpPost请求
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Content-type", "application/soap+xml; charset=utf-8");
        StringEntity bodyParams = new StringEntity(soapRequestData, "UTF-8");
        httpPost.setEntity(bodyParams);
        // 发起请求
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpPost);
            content = EntityUtils.toString(response.getEntity(), "UTF-8");
        } catch (ClientProtocolException e) {
            content = "http request error http ClientProtocolException";
            log.error(e.getMessage());
        } catch (IOException e) {
            content = "http request error http IOException";
            log.error(e.getMessage());
        } finally {
            closeResponse(response);
        }
        return content;
    }

    /**
     * 带参数的post请求
     *
     * @param url
     * @param headerMap
     * @return
     * @throws Exception
     */
    public static String doPostNew(String url, Map<String, String> headerMap, String json) {
        // 声明httpPost请求
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Content-type", "application/json; charset=utf-8");
        // 加入header信息
        if (headerMap != null) {
            for (Map.Entry<String, String> entry : headerMap.entrySet()) {
                httpPost.addHeader(entry.getKey(), entry.getValue().toString());
            }
        }
        StringEntity bodyParams = new StringEntity(json, "UTF-8");
        // 把表单放到post里
        httpPost.setEntity(bodyParams);
        // 发起请求
        CloseableHttpResponse response = null;
        String result;
        try {
            response = httpClient.execute(httpPost);
            result = EntityUtils.toString(response.getEntity(), "UTF-8");
        } catch (IOException e) {
            result = e.getMessage();
        } finally {
            closeResponse(response);
        }
        return result;
    }

    public static void closeResponse(CloseableHttpResponse response) {
        if (null != response) {
            try {
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String doGetNew(String url, Map<String, String> map, Map<String, String> header) {
        URIBuilder uriBuilder;
        String result = "";
        CloseableHttpResponse response = null;
        try {
            uriBuilder = new URIBuilder(url);
            if (map != null) {
                // 遍历map,拼接请求参数
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    uriBuilder.setParameter(entry.getKey(), entry.getValue());
                }
            }
            // 声明 http get 请求
            HttpGet httpGet = new HttpGet(uriBuilder.build().toString());
            Set<String> keys = header.keySet();
            Iterator<String> keyIt = keys.iterator();
            while (keyIt.hasNext()) {
                String key = keyIt.next();
                httpGet.addHeader(key, header.get(key));
            }
            // 发起请求
            response = httpClient.execute(httpGet);
            result = EntityUtils.toString(response.getEntity(), "UTF-8");
        } catch (Exception e) {
            result = e.getMessage();
        } finally {
            closeResponse(response);
        }
        return result;
    }
}

