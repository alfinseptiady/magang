package com.juaracoding.magang.page.cuti;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.magang.driver.DriverSingleton;

public class CutiPage {

	private WebDriver driver;
	
	public CutiPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
// menu
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(12) > a > span")
	private WebElement btnMenuju;

//	tombol cuti
	@FindBy(css="#sidebar > div > div  >  ul > li")
	private List<WebElement> btnCuti;
	
//	sub cuti
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li > a")
	private List<WebElement> btnSubcuti1;
	
	public void cuti() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", btnMenuju);
		btnCuti.get(14).click();
		btnSubcuti1.get(0).click();
	}

}
