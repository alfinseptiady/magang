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
	
	@Value("${tglcuti}")
	private String tglcuti;
	
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
	
	@Value("${pokok}")
	private String pokok;
	
	@Value("${jabatan}")
	private String jabatan;
	
	@Value("${komunikasi}")
	private String komunikasi;
	
	@Value("${transportasi}")
	private String transportasi;
	
	@Value("${tglefektif}")
	private String tglefektif;
	
	@Value("${asp1}")
	private String asp1;
	
	@Value("${asp2}")
	private String asp2;
	
	@Value("${asp3}")
	private String asp3;
	
	@Value("${vaksinnote}")
	private String vaksinnote;
	
	@Value("${nokartu}")
	private String nokartu;
	
	@Value("${Namatanggung}")
	private String Namatanggung;
	
	@Value("${Nilaiklaim}")
	private String Nilaiklaim;
	
	
	
	
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
	public String getTglCuti() {
		return tglcuti;
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
	public String getPokok() {
		 return pokok;
	}
	public String getJabatan() {
		return jabatan;
	}
	public String getKomunikasi() {
		return komunikasi;
	}
	public String getTransportasi() {
		return transportasi;
	}
	public String getTglEfektif() {
		return tglefektif;
	}
	public String getAspek1() {
		return asp1;
	}
	public String getAspek2() {
		return asp2;
	}
	public String getAspek3() {
		return asp3;
	}
	public String getVaksinNote() {
		return vaksinnote;
	}
	public String getNokartu() {
		return nokartu;
			
	}
	public String getNamaTanggung() {
		return Namatanggung;
	}
	public String getNilaiKlaim() {
		return Nilaiklaim;
	}
	
	
}
