package com.ruoyi.common.utils.gbdata;

import java.io.Serializable;

public class SecretDatas implements Serializable{
	private static final long serialVersionUID = -5870983387947391207L;
	private String secret;
	private String secretEndTime;
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public String getSecretEndTime() {
		return secretEndTime;
	}
	public void setSecretEndTime(String secretEndTime) {
		this.secretEndTime = secretEndTime;
	}
}
