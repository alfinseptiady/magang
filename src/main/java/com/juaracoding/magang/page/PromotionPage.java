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
	@FindBy(css="#Current_Positional_Allowance")
	private WebElement tunjanganjabatan;
//	tunjangankumunikasi
	@FindBy(css="#Current_Communication_Allowance")
	private WebElement tunjangankomunikasi;
//	tunjangantransfortasi
	@FindBy(css="#Current_Transportation_Allowance")
	private WebElement tunjangantrasnportasi;
//	tanngal efektif
	@FindBy(id="Effective_Date")
	private WebElement tanggalefektif;
//	devisi
	@FindBy(css="#Promotion_Division > option:nth-child(2)")
	private WebElement devisi;
//	level
	@FindBy(css="#Promotion_Level > option:nth-child(2)")
	private WebElement level;
//	status
	@FindBy(css="#Promotion_Employee_Type > option:nth-child(3)")
	private WebElement status;
//	Unit
	@FindBy(css="#Promotion_Unit > option:nth-child(2)")
	private WebElement unit;
//	jabatan
	@FindBy(css="#Promotion_Position > option:nth-child(2)")
	private WebElement jabatan;
//	form penilaian
//	1
	@FindBy(css="#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(2) > td:nth-child(3) > input[type=radio]")
	private WebElement nilai1;
//	2
	@FindBy(css="#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(3) > td:nth-child(3) > input[type=radio]")
	private WebElement nilai2;
//	3
	@FindBy(css="#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(4) > td:nth-child(3) > input[type=radio]")
	private WebElement nilai3;
//	4
	@FindBy(css="#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(5) > td:nth-child(3) > input[type=radio]")
	private WebElement nilai4;
//	5
	@FindBy(css="#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(6) > td:nth-child(3) > input[type=radio]")
	private WebElement nilai5;
//	6
	@FindBy(css="#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(7) > td:nth-child(3) > input[type=radio]")
	private WebElement nilai6;
//	7
	@FindBy(css="#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(8) > td:nth-child(3) > input[type=radio]")
	private WebElement nilai7;
//	8
	@FindBy(css="#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(9) > td:nth-child(3) > input[type=radio]")
	private WebElement nilai8;
//	9
	@FindBy(css="#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(10) > td:nth-child(3) > input[type=radio]")
	private WebElement nilai9;
//	10
	@FindBy(css="#content > form > div:nth-child(11) > div > div > div.panel-body > table > tbody > tr:nth-child(11) > td:nth-child(3) > input[type=radio]")
	private WebElement nilai10;
//	aspek kebelihan karyawan
//	1
	@FindBy(id="Aspect1")
	private WebElement aspek1;
//	2
	@FindBy(id="Aspect2")
	private WebElement aspek2;
//	3
	@FindBy(id="Aspect3")
	private WebElement aspek3;
//	ulasanatasan
	@FindBy(css="#Aspect4 > option:nth-child(2)")
	private WebElement ulasanatasan;
//	vaksin
	@FindBy(css="#div_comment > div > div > div.panel-body > div > div > div > div > div:nth-child(1) > select > option:nth-child(2)")
	private WebElement vaksin;
//	vaksinNote
	@FindBy(id="Requested_Comment")
	private WebElement vaksinnote;
//	send
	@FindBy(css="#content > form > input.btn.btn-lg.btn-block.btn-primary")
	private WebElement send;
//	clickstartdate
	@FindBy(id="tgl")
	private WebElement startdate1;
//	inputstardate
	@FindBy(css="body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(2) > td:nth-child(2)")
	private WebElement inputstartdate1;
//	clickenddate
	@FindBy(id="tgl2")
	private WebElement enddata1;
//	inputenddate
	@FindBy(css="body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(2) > td:nth-child(2)")
	private WebElement inputenddata1;
//	reset
	@FindBy(id="btn-reset")
	private WebElement btnreset;
//	clickstartdate
	@FindBy(id="tgl")
	private WebElement startdate2;
//	inputstardate
	@FindBy(css="body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(2) > td:nth-child(2)")
	private WebElement inputstartdate2;
//	clickenddate
	@FindBy(id="tgl2")
	private WebElement enddata2;
//	inputenddate
	@FindBy(css="body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(2) > td:nth-child(2)")
	private WebElement inputenddata2;
//	filter
	@FindBy(id="btn-filter")
	private WebElement btnFilter;



	
	
	
	
	
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
	public void GajiPokok(String pokok) {
		gajipokok.sendKeys(pokok);
	}
	public void TunjanganJabatan(String jabatan) {
		tunjanganjabatan.clear();
		tunjanganjabatan.sendKeys(jabatan);
	}
	public void TunjanganKomunikasi(String komunikasi) {
		tunjangankomunikasi.clear();
		tunjangankomunikasi.sendKeys(komunikasi);
	}
	public void TunjanganTransportasi(String transportasi) {
		tunjangantrasnportasi.clear();
		tunjangantrasnportasi.sendKeys(transportasi);
	}
	public void TanggalEfektif(String tglefektif) {
		tanggalefektif.sendKeys("tglefektif" + Keys.ENTER);
	}
	public void Devisi() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
//		List<Keys> lstSequence = new ArrayList<Keys>();
//		for (int i = 0; i < selection; i++) {
//			 lstSequence.add(Keys.DOWN);
//		}
//		lstSequence.add(Keys.ENTER);
//		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
//		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
		devisi.click();
	}
	public void Level() {
		level.click();
	}
	public void Status() {
		status.click();
	}
	public void Unit() {
		unit.click();
	}
	public void jabatan() {
		jabatan.click();
	}
	public void FromNilai() {
		nilai1.click();
		nilai2.click();
		nilai3.click();
		nilai4.click();
		nilai5.click();
		nilai6.click();
		nilai7.click();
		nilai8.click();
		nilai9.click();
		nilai10.click();
		
	}
	public void AspekKaryawan1(String asp1) {
		aspek1.sendKeys(asp1);
	}
	public void AspekKaryawan2(String asp2) {
		aspek2.sendKeys(asp2);
	}
	public void AspekKaryawan3(String asp3) {
		aspek3.sendKeys(asp3);
	}
	public void UlasanAtasan() {
		ulasanatasan.click();
		
	}
	public void Vaksin() {
		vaksin.click();
	}
	public void VaksinNote(String vaksinNote) {
		vaksinnote.sendKeys(vaksinNote);
	}
	public void Send() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		send.click();
	}
	public void StartDate1() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		startdate1.click();
	}
	public void InputDate1() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		inputstartdate1.click();
	}
	public void EndDate1() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		enddata1.click();
	}
	public void InputEndDate1() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		inputenddata1.click();
	}
	public void BtnReset() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnreset.click();
	}
//	.....
	public void StartDate2() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		startdate2.click();
	}
	public void InputDate2() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		inputstartdate2.click();
	}
	public void EndDate2() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		enddata2.click();
	}
	public void InputEndDate2() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		inputenddata2.click();
	}
//	..........
	public void BtnFilter() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnFilter.click();
	}


}
