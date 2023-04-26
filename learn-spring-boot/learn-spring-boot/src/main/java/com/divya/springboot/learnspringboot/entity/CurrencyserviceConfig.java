package com.divya.springboot.learnspringboot.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyserviceConfig {

	private String url;
	private String uname;
	private String key;
	
	public CurrencyserviceConfig() {}
	public CurrencyserviceConfig(String url, String uname, String key) {
		super();
		this.url = url;
		this.uname = uname;
		this.key = key;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	@Override
	public String toString() {
		return "CurrencyserviceConfig [url=" + url + ", uname=" + uname + ", key=" + key + "]";
	}
	
	
}
