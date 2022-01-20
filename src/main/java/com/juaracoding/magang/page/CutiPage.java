package com.juaracoding.magang.page;

import java.util.ArrayList;
import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.magang.driver.DriverSingleton;
import com.juaracoding.magang.utils.ConfigurationProperties;

public class CutiPage {

private WebDriver driver;
	
	public CutiPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	data
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(3)")
	private WebElement sidebardata;
//	slipgaji
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li:nth-child(2)> a")
	private WebElement sidebarslipgaji;
//	pengajuancuti
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(3) > ul > li:nth-child(3) > a")
	private WebElement sidebarpengajuancuti;
//	form cuti
	@FindBy(id="toggleForm")
	private WebElement formcuti;
//	type annual
	@FindBy(css="#type > option:nth-child(2)")
	private WebElement selecttype;
//	persetujuan cuti
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(3) > ul > li:nth-child(4) > a")
	private WebElement persetujuancuti;
//	pengajuan resign
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(3) > ul > li:nth-child(5) > a")
	private WebElement pengajuanresign;
//	requset resign
	@FindBy(css="#content > div.col-lg-12 > h1 > a")
	private WebElement requsetresign;
//	Alasan
	@FindBy(css="#content > div:nth-child(3) > div > form > div:nth-child(2) > div.panel-body > div > div:nth-child(1) > div > div > div:nth-child(1) > label")
	private WebElement alasanbtn;
//	tanggal resign
	@FindBy(name="resign_date")
	private WebElement resigndate;
//	bersedia rekrut kembali
	@FindBy(css="#content > div:nth-child(3) > div > form > div:nth-child(2) > div.panel-body > div > div:nth-child(2) > div:nth-child(2) > select > option:nth-child(2)")
	private WebElement listrekrutkembali;
//	Questionarire
//	1
	@FindBy(css="#content > div:nth-child(3) > div > form > div:nth-child(3) > div.panel-body > div > div > div:nth-child(1) > textarea")
	private WebElement Answer1;
//	2
	@FindBy(css="#content > div:nth-child(3) > div > form > div:nth-child(3) > div.panel-body > div > div > div:nth-child(2) > textarea")
	private WebElement Answer2;
//	3
	@FindBy(css="#content > div:nth-child(3) > div > form > div:nth-child(3) > div.panel-body > div > div > div:nth-child(3) > textarea")
	private WebElement Answer3;
//	4
	@FindBy(css="#content > div:nth-child(3) > div > form > div:nth-child(3) > div.panel-body > div > div > div:nth-child(4) > textarea")
	private WebElement Answer4;
//	submit
	@FindBy(css="#content > div:nth-child(3) > div > form > div.box-footer > button")
	private WebElement btnsubmit;
//	data1
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(3)")
	private WebElement sidebardata1;
//	survey
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li:nth-child(6) > a")
	private WebElement btnsurvey;
//	tanda tangan digital
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(3) > ul > li:nth-child(7) > a")
	private WebElement 	btntandatangandigital;
//	setup tanda tangan
	@FindBy(id="signature")
	private WebElement pentandatangan;
//	hapus
	@FindBy(css="#signature-pad > div.m-signature-pad--footer > div.right > button")
	private WebElement btnhapusttd;
//	save
	@FindBy(id="btnSave")
	private WebElement btnsavettd;
	
	
	
	
//	eksekusi
	public void sidebarData() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		sidebardata.click();
	}
	public void sidebarSlipgaji() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		sidebarslipgaji.click();
	}
	public void sidebarPengajuanCuti() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		sidebarpengajuancuti.click();
	}
	public void formCuti() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;	
		jse.executeScript("window.scrollBy(0,1000)");
	
		formcuti.click();
		
	}
	public void selectType(int selection) {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
		selecttype.click();
	}
	public void persetujuanCuti() {
		persetujuancuti.click();
	}
	public void pengajuanResign() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		pengajuanresign.click();
	}
	public void requestResign() {
		requsetresign.click();
	}
	public void alasanBtn() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;	
		jse.executeScript("window.scrollBy(0,300)");
		alasanbtn.click();
	}
	public void resignDate(String date) {
		resigndate.sendKeys(date);
	}
	public void listRekrutKembali(int selection) {
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		listrekrutkembali.click();
	}
	public void inputAnswer(String answersatu, String answerdua, String answertiga, String answerempat) {
		Answer1.sendKeys(answersatu);
		Answer2.sendKeys(answerdua);
		Answer3.sendKeys(answertiga);
		Answer4.sendKeys(answerempat);
		
	}
	public void btnSubmit() {
		btnsubmit.click();
	}
	public void sidebarData1() {
		sidebardata1.click();
	}
	public void btnSurvey() {
		btnsurvey.click();
	}
	public void btnTandaTanganDigital() {
		btntandatangandigital.click();
	}
	public void PenTandaTangan() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		JavascriptExecutor jse = (JavascriptExecutor)driver;	
		jse.executeScript("window.scrollBy(0,300)");
		Actions actions = new Actions(driver).click(pentandatangan)
		.moveToElement(pentandatangan, 3, 3).clickAndHold(pentandatangan)
		.moveByOffset(50, 50).moveByOffset(-50, 50)
		.moveByOffset(-50, -50).moveByOffset(3, 3).release();
		
		actions.perform();
	}
	public void HapusTTD() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnhapusttd.click();
	}
	public void SaveTTD() {
		btnsavettd.click();
		driver.switchTo().alert().accept();
	
			
	}
	
	
	
}

