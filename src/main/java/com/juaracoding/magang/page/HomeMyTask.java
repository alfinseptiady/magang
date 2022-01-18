package com.juaracoding.magang.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.magang.driver.DriverSingleton;

public class HomeMyTask {
private WebDriver driver;
	
	public HomeMyTask() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	elemetnya
//	1HomeMyTask
//	pengajuan cuti
	@FindBy(css="#content > div > div > div > div.widget-list.rounded.mb-4 > a:nth-child(1)")
	private WebElement shortPengajuanCuti;
	
//	backtohome
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a")
	private WebElement btnHome;
	
//	2approvalcuti
	@FindBy(css="#content > div > div > div > div.widget-list.rounded.mb-4 > a:nth-child(2)")
	private WebElement shortApprovalCuti;
	
//	3promotion
	@FindBy(css="#content > div > div > div > div.widget-list.rounded.mb-4 > a:nth-child(3)")
	private WebElement shortPromotion;
	
//	4approvalInvoice
	@FindBy(css="#content > div > div > div > div.widget-list.rounded.mb-4 > a:nth-child(4)")
	private WebElement shortApprovalInvoice;
	
//	5requestStaff
	@FindBy(css="#content > div > div > div > div.widget-list.rounded.mb-4 > a:nth-child(5)")
	private WebElement shortRequestStaff;
	
//	6suratperingatan
	@FindBy(css="#content > div > div > div > div.widget-list.rounded.mb-4 > a:nth-child(6)")
	private WebElement shortSuratPeringatan;
	
	
//	eksekusinya
//	1
	public void pengajuanCuti(){
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		shortPengajuanCuti.click();
	}
	
//	home
	public void backToHome() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnHome.click();
	}
	
//	2
	public void approvalCuti() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		shortApprovalCuti.click();
	}
	
//	3
	public void Promotion() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		shortPromotion.click();
	}
	
//	4
	public void approvalInvoice() {
		 try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		 shortApprovalCuti.click();
	}
	
//	5
	public void requestStaff() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		shortRequestStaff.click();
	}
	
//	6
	public void suratPeringatan() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		shortSuratPeringatan.click();
	}
	
	
}
