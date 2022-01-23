package com.juaracoding.magang.page;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.magang.driver.DriverSingleton;

public class RequestStaffPage {
private WebDriver driver;
	
	public RequestStaffPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	requestStaff
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(12) > a")
	private WebElement siderequeststaff;
//	pending
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li.active > a")
	private WebElement pending;
//	input data
	@FindBy(css="#content > div > div > div > div.panel-body > div.col.row.d-flex.justify-content-between.pr-0.mr-0 > div.row.mt-auto > a")
	private WebElement inputdata13;
//	tujuan request staff
	@FindBy(css="#content > form > div:nth-child(1) > div > div > div.panel-body > div:nth-child(1) > div > select > option:nth-child(2)")
	private WebElement tujuanrequeststaff;
//	Unit request spaff
	@FindBy(name="Position_Request")
	private WebElement unitrequeststaff;
//	jumlahorang request staff
	@FindBy(name="Total_Request")
	private WebElement jumlahorangrequeststaff;
//	mulaikerja request staff
	@FindBy(css="#content > form > div:nth-child(1) > div > div > div.panel-body > div:nth-child(6) > div > input")
	private WebElement mulaikerjarequeststaff;
//	inputmulaikerjarequeststaff
	@FindBy(css="body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-top > div.datepicker-days > table > tbody > tr:nth-child(2) > td:nth-child(4)")
	private WebElement inputmulaikerjarequeststaff;
//	lokasikerja
	@FindBy(css="#content > form > div:nth-child(1) > div > div > div.panel-body > div:nth-child(7) > div > select > option:nth-child(3)")
	private WebElement lokasikerjarequeststaff;
//	deskripsi pekerjaan
	@FindBy(name="Job_Desc")
	private WebElement deskripsipekerjaan;
//	masa percobaan
	@FindBy(name="Probation_Period")
	private WebElement masapercobaan;
//	golonganjabatan
	@FindBy(css="#content > form > div:nth-child(3) > div > div > div.panel-body > div:nth-child(2) > div > select > option:nth-child(5)")
	private WebElement golonganjabatan;
//	gaji
	@FindBy(name="Salary")
	private WebElement gajirequeststaff;
//	asuransi
	@FindBy(name="cbInsurance[]")
	private WebElement asuransi;
//	.......
//	tunjangan jabatan
	@FindBy(name="Positional_Allowance")
	private WebElement tunjanganjabatan15;
//	tunjangan trasnfortasi
	@FindBy(name="Transportation_Allowance")
	private WebElement tunjangantrasnfortasi15;
//	tunjangan komunikasi
	@FindBy(name="Communication_Allowance")
	private WebElement tunjangankomunikasi15;
//	notes
	@FindBy(name="Note_Request")
	private WebElement	notes15;
//	submit
	@FindBy(css="#content > form > button")
	private WebElement submit15;
//	edit
	@FindBy(css="#dataTable_filter > label > input")
	private WebElement edit;
//	.......
//	tracking
	@FindBy(xpath="//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[12]/ul/li[2]/a")
	private WebElement tracking;
//	.
//	form
	@FindBy(id="fField")
	private WebElement clickform;
//	inputform
	@FindBy(css="body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-top > div.datepicker-days > table > tbody > tr:nth-child(3) > td:nth-child(2)")
	private WebElement inputform;
//	pemisah
	@FindBy(css="#dataTable_filter > label > input")
	private WebElement misah;
//	....
//	to
	@FindBy(id="tField")
	private WebElement clickTo;
//	inputTo
	@FindBy(css="body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-top > div.datepicker-days > table > tbody > tr:nth-child(3) > td:nth-child(2)")
	private WebElement InputTo;
//	.....
//	surat peringatan
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(13) > a")
	private WebElement suratperingatan;
//	list letter
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li > a")
	private WebElement listletter;
//	logout
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(15) > a")
	private WebElement logout;
	
	
//	eksekusi
	public void tunda() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) { 
			// TODO: handle exception
		}
	}
	public void SideRequestStaff() {
		siderequeststaff.click();
	}
	public void Pending() {
		pending.click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		inputdata13.click();
		tunda();
		tujuanrequeststaff.click();
		tunda();
		unitrequeststaff.sendKeys("Mananger");
		tunda();
		jumlahorangrequeststaff.sendKeys("20");
		tunda();
		mulaikerjarequeststaff.click();
		tunda();
		inputmulaikerjarequeststaff.click();
		tunda();
		lokasikerjarequeststaff.click();
		tunda();
		deskripsipekerjaan.click();
		deskripsipekerjaan.sendKeys("asdasdasd");
		tunda();
		JavascriptExecutor Js1 = (JavascriptExecutor) driver;
		Js1.executeScript("window.scrollBy(0,10000)");
		masapercobaan.sendKeys("2");
		golonganjabatan.click();
		tunda();
		gajirequeststaff.sendKeys("500000");
		tunda();
		asuransi.click();
		tunjanganjabatan15.sendKeys("123123");
		tunda();
		tunjangantrasnfortasi15.sendKeys("123123");
		tunda();
		tunjangankomunikasi15.sendKeys("123123");
		tunda();
		notes15.sendKeys("asdasdqwdxasd");
		tunda();
		submit15.click();
		tunda();
		edit.click();
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		tunda();
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		tunda();
		Js1.executeScript("window.scrollBy(0,10000)");
		
		}
		public void Tracking() {
			
			JavascriptExecutor Js1 = (JavascriptExecutor) driver;
			Js1.executeScript("arguments[0].scrollIntoView(true);", siderequeststaff);
			tunda();
			tunda();
			tracking.click();

	}
		public void SuratPeringatan() {
			JavascriptExecutor Js1 = (JavascriptExecutor) driver;
			Js1.executeScript("arguments[0].scrollIntoView(true);", siderequeststaff);
			tunda();
			suratperingatan.click();
			tunda();
			listletter.click();
		}
		public void Logout() {
			JavascriptExecutor Js1 = (JavascriptExecutor) driver;
			Js1.executeScript("arguments[0].scrollIntoView(true);", siderequeststaff);
			tunda();
			logout.click();
		}
}
