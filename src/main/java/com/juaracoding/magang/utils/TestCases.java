package com.juaracoding.magang.utils;

public enum TestCases {

	T1("Testing login survisor"),
	T2("Testing home page"),
	T3("Testing Pengajuan Cuti"),
	T4("Testing Promotion");
	
	
	private String testName;	

	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
	public String get() {
		return testName;
	}
	
}
