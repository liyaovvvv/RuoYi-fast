package com.ruoyi.common.utils;

import java.io.Serializable;

public class SecretHeaders implements Serializable{
	private static final long serialVersionUID = 3512790766107756249L;
	private String code;
	private String message;
	private SecretDatas data;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public SecretDatas getData() {
		return data;
	}
	public void setData(SecretDatas data) {
		this.data = data;
	}
}
