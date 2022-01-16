package com.juaracoding.magang.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.txt")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${myusername}")
	private String userName;
	
	@Value("${password}")
	private String password;

	@Value("${namaTemplate}")
	private String namaTemplate;
	
	@Value("${jumlahHalaman}")
	private String jumlahHalaman;
	
//	
	

	public String getBrowser() {
		return browser;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	
	public String getNamaTemplate() {
		return namaTemplate;
	}
	
	public String getJumlah() {
		return jumlahHalaman;
	}
	
	
	
}
