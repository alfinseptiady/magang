package com.juaracoding.magang.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.magang.driver.DriverSingleton;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
		
//	input username
	@FindBy(name = "username")
	private WebElement txtUsername;
	
//	input password
	@FindBy(name = "password")
	private WebElement txtPassword;
	
//	tombol login
	@FindBy(css = "#page-container > div > div.right-content > div.login-content > form > div.login-buttons > button")
	private WebElement btnLogin;
	
	
	public void goToLoginPage() {
		btnLogin.click();
	}
	
	public void goToLoggedIn(String username, String password) {	
		
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(password);
		
	}

	public Object getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}


}
