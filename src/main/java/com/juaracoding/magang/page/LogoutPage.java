package com.juaracoding.magang.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.magang.driver.DriverSingleton;

public class LogoutPage {
	
private WebDriver driver;
	
	public LogoutPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	// LogOut
	@FindBy(css="#header > ul > li > a")
	private List<WebElement> btnClickIcon;
	
//	btnLogout
	@FindBy(css="#header > ul > li.dropdown.navbar-user.show > div > a")
	private WebElement btnLogout;
	
//	LogOut
	public void iconLogout() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".dropdown-toggle"))).click();
//		btnClickIcon.get(2).click();
	}
	public void btnLogout(int selection) {
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector(""))).click();
		
	btnLogout.click();
	}
}
