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
	
	@Value("${resignDate}")
	private String resigndate;
	
	@Value("${answer1")
	private String Answer1; 
	
	@Value("${answer2")
	private String Answer2; 
	
	@Value("${answer3")
	private String Answer3; 
	
	@Value("${answer4")
	private String Answer4;
	
	@Value("${gaji}")
	private String gaji;
	
	@Value("&{jabatan}")
	private String jabatan;
	
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
	public String getResignDate() {
		return resigndate;
	}
	public String getAnswer1() {
		return Answer1;
	}
	public String getAnswer2() {
		return Answer2;
	}
	public String getAnswer3() {
		return Answer3;
	}
	public String getAnswer4() {
		return Answer4;
	}
	public String getGaji() {
		 return gaji;
	}
	public String getJabatan() {
		return jabatan;
	}
	
	
}
