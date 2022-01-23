package com.juaracoding.magang.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.magang.driver.DriverSingleton;

public class ReimbursementPage {
private WebDriver driver;
	
	public ReimbursementPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	click reimbursement
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(8) > a")
	private WebElement sidereimb;
//	klaimAsuransi
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li:nth-child(1) > a")
	private WebElement klaimasuransi;
//	addclaim
	@FindBy(css="#content > div.col-md-6 > a")
	private WebElement addclaim;
//	tgl
	@FindBy(name="Requested_Date")
	private WebElement tanggalpengajuan;
//	inputtglpengajuan
	@FindBy(css="body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(2) > td:nth-child(4)")
	private WebElement inputtglpengajuan;
//	nomerkartu
	@FindBy(id="Card_Number")
	private WebElement nomerkartu;
//	namatanggung
	@FindBy(id="PIC")
	private WebElement namatanggung;
//	nilaiklaim
	@FindBy(id="rupiah")
	private WebElement nilaiklaim;
//	submit
	@FindBy(name="submit")
	private WebElement submit;
//	btnkwitansi
	@FindBy(css="#content > div:nth-child(7) > div > div > div.panel-body > form > div > table > tbody > tr > td:nth-child(1) > div > a > span")
	private WebElement btnkwintasi;
//	file
	@FindBy(id="file")
	private WebElement pilihfile;
//	kirim
	@FindBy(css="#modal_form > div > div > div.modal-footer > input")
	private WebElement kirim;
//	view
	@FindBy(css="#table_filter > label > input")
	private WebElement search;
//	close
	@FindBy(css="#modal_form_foto > div > div > div.modal-header > button")
	private WebElement close;
//	kirim
	@FindBy(css="#content > div:nth-child(8) > div:nth-child(2) > div > input")
	private WebElement kirim1;
//	kembali
	@FindBy(css="#content > div:nth-child(8) > div:nth-child(2) > div > a")
	private WebElement kembali;
//	.........................
//	KlaimKacaMata
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li:nth-child(2) > a")
	private WebElement klaimkacamata1;
//	addklaim
	@FindBy(css="#content > div.col-md-6 > a")
	private WebElement addklaim2;
//	tanggalpengajuan
	@FindBy(css="#tgl")
	private WebElement tanggalpengajuan2;
//	inputtanggalpengajuan
	@FindBy(css="body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(2) > td:nth-child(3)")
	private WebElement inputtanggalpengajuan2;
//	nomerkartu
	@FindBy(id="Card_Number")
	private WebElement nomerkartu2;
//	namatanggung
	@FindBy(id="PIC")
	private WebElement namatanggung2;
//	nilaiklaim
	@FindBy(id="rupiah")
	private WebElement nilaiklaim2;
//	submit
	@FindBy(name="submit")
	private WebElement submit2;
//	kirim2
	@FindBy(css="#content > div:nth-child(9) > div:nth-child(2) > div > div > input")
	private WebElement kirim2;
//	kembali2
	@FindBy(css="#content > div:nth-child(9) > div:nth-child(2) > div > div > a")
	private WebElement kembali2;
//	..............
//	approval klaim kaca mata
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li:nth-child(3) > a")
	private WebElement approval;
//	stardate
	@FindBy(id="tgl")
	private WebElement startdateapproval;
//	inputstartdateapproval
	@FindBy(css="body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(2) > td:nth-child(3)")
	private WebElement inputstartdateapproval;
//	enddateapproval
	@FindBy(id="tgl2")
	private WebElement enddateapproval;
//	inputdateapproval
	@FindBy(css="body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(2) > td:nth-child(3)")
	private WebElement inputenddateapproval;
//	reset
	@FindBy(css="#btn-reset")
	private WebElement reset12;
//	filter
	@FindBy(id="btn-filter")
	private WebElement btnfilter;
//	..............................
//	entertaiment
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li:nth-child(4) > a")
	private WebElement entertaiment;
//	addnew
	@FindBy(css="#content > div:nth-child(2) > div > div > a")
	private WebElement addnew;
//	divisi
	@FindBy(css="#division > option:nth-child(3)")
	private WebElement divisi;
//	nilaiklaim
	@FindBy(id="claim_value")
	private WebElement Nilaiklaim3;
//	submit
	@FindBy(css="#content > div.row > div > div > div.panel-body > form > div > button")
	private WebElement Submit3;
//	tempat
	@FindBy(id="place")
	private WebElement place;
//	alamat
	@FindBy(id="address")
	private WebElement alamat;
//	staffhadir
	@FindBy(id="staff")
	private WebElement Staff;
//	jumlahklaim
	@FindBy(id="claim_value")
	private WebElement jumlahklaim;
//	materi
	@FindBy(css="#materai > option:nth-child(2)")
	private WebElement materi;
//	.
//	nama
	@FindBy(id="relation_name")
	private WebElement nameRelasi;
//	jabatan
	@FindBy(id="relation_position")
	private WebElement jabatanrelasi;
//	namaperusahaanrelasi
	@FindBy(id="relation_company_name")
	private WebElement namaperusahaanrelasi;
//	staffyanghadir
	@FindBy(id="relation_staff")
	private WebElement staffyanghadirrelasi;
//	jika biaya pergaulan
//	jenis entertaiment
	@FindBy(css="#entertainment_type > option:nth-child(3)")
	private WebElement jenisentertaiment;
//	posisirelasiusaha
	@FindBy(css="#position_of_company_relation > option:nth-child(2)")
	private WebElement posisirelasiusaha;
//	jeniusaharelasicustomer
	@FindBy(css="#company_type > option:nth-child(2)")
	private WebElement jenisusaharelasicustomer;
//	tujuanEntertaiment
	@FindBy(css="#entertaiment_purpose > option:nth-child(3)")
	private WebElement tujuanentertaiment;
//	submitdetail
	@FindBy(id="btnSaveDetail")
	private WebElement submitDetail;
//	uploadkwintasi
	@FindBy(css="#content > div:nth-child(5) > div > div > div.panel-body > div.form-group.row > div:nth-child(1) > button")
	private WebElement upldkwintasi1;
//	pilihfile
	@FindBy(id="userfile")
	private WebElement pilihfile1;
//	upload
	@FindBy(id="btnUploadDocument")
	private WebElement btnUpload;
//	btnsubmitform
	@FindBy(id="btnSubmitForm")
	private WebElement btnSubmitF;
//	............. 	
//	entertaiment approval
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li:nth-child(5) > a")
	private WebElement entertaimentapproval;
//	startdate
	@FindBy(id="tgl")
	private WebElement startdateentertaimenapproval;
//	inputstartdateapproval
	@FindBy(css="body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(2) > td:nth-child(3)")
	private WebElement inputstartdateapproval1;
//	enddateapproval
	@FindBy(id="tgl2")
	private WebElement enddateapproval13;
//	inputenddateapproval
	@FindBy(css="body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(2) > td:nth-child(3)")
	private WebElement inputenddateapproval13;
	
	
	
	
	
//	eksekusi
	
	public void tunda() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void SideReimb() {
		sidereimb.click();
	}
	public void KlaimAsuransi() {
		klaimasuransi.click();
	}
	public void AddClaim() {
		addclaim.click();
	}
	public void TanggalPengajuan() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tanggalpengajuan.click();
	}
	public void InputTanggalPengajuan() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		inputtglpengajuan.click();
	}
	public void NomerKartu(String nokartu) {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		nomerkartu.sendKeys(nokartu);
	}
	public void NamaTanggung(String Namatanggung) {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		namatanggung.sendKeys(Namatanggung);
	}
	public void NilaiKlaim(String Nilaiklaim) {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		nilaiklaim.sendKeys(Nilaiklaim);
	}
	public void Submit() {
		submit.click();
	}
	public void uploadDokumen() {		
		btnkwintasi.click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		pilihfile.sendKeys("E:\\Foto\\index.PNG");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		kirim.click();
	}
	public void Views() {
		JavascriptExecutor Js1 = (JavascriptExecutor) driver;
		Js1.executeScript("window.scrollBy(0,10000)");
//		Actions action = new Actions(driver);
//		action.moveToElement(views).sendKeys(Keys.ENTER);
		search.click();
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	}
	public void Close() {
		close.click();
	}
	public void Kirim1() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		kirim1.click();
		JavascriptExecutor Js1 = (JavascriptExecutor) driver;
		Js1.executeScript("window.scrollBy(0,10000)");
	}
	public void Kembali() {
		kembali.click();
	}
//...............................
	public void KlaimKacaMata() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		SideReimb();
		klaimkacamata1.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		addklaim2.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tanggalpengajuan2.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		inputtanggalpengajuan2.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		nomerkartu2.sendKeys("126127452");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		namatanggung2.sendKeys("alfin");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		nilaiklaim2.sendKeys("80000");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		submit2.click();
		JavascriptExecutor Js1 = (JavascriptExecutor) driver;
		Js1.executeScript("window.scrollBy(0,10000)");
		uploadDokumen();
		Views();
		Close();
		Js1.executeScript("window.scrollBy(0,10000)");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		kirim2.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Js1.executeScript("window.scrollBy(0,10000)");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		kembali2.click();
		
	}
	public void Approval() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		SideReimb();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		approval.click();
	}
	public void StardEndapproval() {
		startdateapproval.click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		inputstartdateapproval.click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		enddateapproval.click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		inputenddateapproval.click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		reset12.click();
	
	}
	public void StardEndapproval1() {
		startdateapproval.click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		inputstartdateapproval.click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		enddateapproval.click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		inputenddateapproval.click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnfilter.click();

	}
	public void Entertaiment() {
		SideReimb();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		entertaiment.click();
	}
	public void AddNew() {
		addnew.click();
	}
	public void Devisi() {
		divisi.click();
	}
	public void NilaiKalim() {
		JavascriptExecutor Js1 = (JavascriptExecutor) driver;
		Js1.executeScript("window.scrollBy(0,10000)");
		Nilaiklaim3.sendKeys("500000");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Submit3.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		place.sendKeys("Jakarta Timur");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		alamat.sendKeys("Kp.Jembatan");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Staff.sendKeys("80");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		jumlahklaim.sendKeys("200000");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		materi.click();
	}
	public void RelasiUsaha() {
		nameRelasi.sendKeys("Alfin");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		jabatanrelasi.sendKeys("Boss");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		namaperusahaanrelasi.sendKeys("PD.ABBL");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		staffyanghadirrelasi.sendKeys("10");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		jenisentertaiment.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		posisirelasiusaha.click();
		tunda();
		jenisusaharelasicustomer.click();
		tunda();
		tujuanentertaiment.click();
		tunda();
		submitDetail.click();
		tunda();
		JavascriptExecutor Js1 = (JavascriptExecutor) driver;
		Js1.executeScript("window.scrollBy(0,750)");
		upldkwintasi1.click();
		tunda();
		pilihfile1.sendKeys("E:\\Foto\\index.PNG");
		tunda();
		btnUpload.click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.switchTo().alert().accept();
		tunda();
		btnSubmitF.click();
	}
	public void EntertaimentAproval() {
		tunda();
		SideReimb();
		tunda();
		entertaimentapproval.click();
		tunda();
		startdateentertaimenapproval.click();
		tunda();
		inputstartdateapproval1.click();
		tunda();
		enddateapproval13.click();
		tunda();
		inputenddateapproval13.click();
	}
	
}
