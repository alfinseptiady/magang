package com.juaracoding.magang.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.magang.driver.DriverSingleton;

public class Cuti {

private WebDriver driver;
	
	public Cuti() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > a")
	private WebElement sidebarcuti;
	
	public void sidebarcuti() {
		sidebarcuti.click();
	}
}

