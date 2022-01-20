package com.juaracoding.magang.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.magang.driver.DriverSingleton;

public class PromotionPage {
private WebDriver driver;
	
	public PromotionPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	promotion
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(7) > a")
	private WebElement btnpromotion;
//	subpromotion
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li:nth-child(1) > a")
	private WebElement btnsubpromotion;
//	addDataPromotion
	@FindBy(css="#content > div.col-md-6 > a")
	private WebElement btnadddatapromotion;
//	kembali
	@FindBy(css="#content > div > a")
	private WebElement btnkembali;
//	clickTUgasPromosi
	@FindBy(id="cb_promotion_0")
	private WebElement tujuanpromosi;
	
//	idendtitaskaryawan
//	nik
	@FindBy(css="#nik > option:nth-child(2)")
	private WebElement selectnik;
//	gaji pokok
	@FindBy(name="Current_Salary")
	private WebElement gajipokok;
//	tunjanganJabatan
	@FindBy(name="Current_Positional_Allowance")
	private WebElement tunjanganjabatan;
	
	
	
//	eksekusinya
	public void Promotion() {
		btnpromotion.click();
	}
	public void subPromotion() {
		btnsubpromotion.click();
	}
	public void addDataPromotion() {
		btnadddatapromotion.click();
	}
	public void Kembali() {
		btnkembali.click();
	}
	public void TujuanPromosi() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tujuanpromosi.click();
	}
	public void SelectNik(int selection) {
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
		selectnik.click();
	}
	public void GajiPokok(String gaji) {
		gajipokok.sendKeys(gaji);
	}
	public void TunjanganJabatan(String jabatan) {
		tunjanganjabatan.sendKeys(jabatan);
	}
	
	

}
