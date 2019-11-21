package com.ruoyi.common.constant;

/**
 * Created by issuser on 2019/11/14.
 */
public class GbDataConstants {
    /**请求国办数据服务请求头参数key**/
    public static final String GJGXJHPT_SID  = "gjgxjhpt_sid";
    public static final String GJGXJHPT_RID  = "gjgxjhpt_rid";
    public static final String GJGXJHPT_RTIME = "gjgxjhpt_rtime";
    public static final String GJGXJHPT_SIGN = "gjgxjhpt_sign";
    public static final String GJGXJHPT_SIGN_SECRET = "gjgxjhpt_sign_secret";
    public static final String GB_DATA_START_DATE = "gb_data_start_date";
    public static final String GB_DATA_UPDATE_DATE_FORMATTER = "gb_data_update_date_t%s";
    public static final String CD_SOURCE = "cd_source";
    public static final String SUBMITTED_DATE = "submitted_date";
    public static final String TABLE_ID = "table_id";


    /**请求国办数据服务请求头参数值**/
    public static final String GJGXJHPT_SID_VAL = "s_111000000000143498_5734";
    public static final String GJGXJHPT_RID_VAL  = "430364c1-8475-442c-a398-f6b0d07fbb8d@94ce9736bca0440dbd72d526e9a5885d";
//  public static final String GJGXJHPT_RTIME_VAL = "gjgxjhpt_rtime";
    public static final String CD_SOURCE_VAL = "420000";
    public static final String PROVNICE_AREA_NUMBER = CD_SOURCE_VAL;
    /**进入监管系统的cd_source为固定值000001**/
    public static final String CD_SOURCE_JG = "000001";

    /**数字签名**/
    public static final String GJGXJHPT_APP_KEY  = "0596b9e45a17df8cb3b99c8acd702992";

    /**refresh secret key url**/
    public static final String REFRESH_SECRET_URL = "http://59.255.105.32:8181/sysapi/auth/refreshappsecret";

    /**http url**/
    public static final String HTTP_PROXY_URL = "http://59.255.105.32:8181/httpproxy";

    /**web service wsdl url**/
    public static final String WEB_SERVICE_URL = "http://59.255.105.32:8181/wsproxy?wsdl";
}
