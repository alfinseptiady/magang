package com.juaracoding.magang.utils;

public enum TestCases {

	T1("Testing login hrd"),
	T2("Testing Surat Peringatan"),
	T3("Testing logout hrd");
	
	private String testName;	

	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
