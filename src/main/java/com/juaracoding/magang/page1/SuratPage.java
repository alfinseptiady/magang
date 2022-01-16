package com.juaracoding.magang.page1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.magang.driver.DriverSingleton;

public class SuratPage {
	private WebDriver driver;
	
	public SuratPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

//	surat peringatan 1
	// menu
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(12) > a > span")
	private WebElement btnMenuju1;

	//	tombol sidebar
	@FindBy(css="#sidebar > div > div  >  ul > li")
	private List<WebElement> btnPeringatan1;
	
	//	sub peringatan1
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li > a")
	private List<WebElement> btnSubPeringatan1;
	
	//	upload data
	@FindBy(css="#content > div.row > div > div > div.panel-body > a")
	private WebElement btnUpload1;
	
	//	choose file
	@FindBy(id="file")
	private WebElement clickFile;
	
	//	choose tipe
	@FindBy(id="tipe")
	private WebElement btnTipe;
	
	//	choose katagory
	@FindBy(id="template_name")
	private WebElement btnKatagori;
	
	//	button upload
	@FindBy(css="#content > div.row > div > div > div.panel-body > form > div:nth-child(2) > input")
	private WebElement btnUpload2;
	
//	surat peringatan2	
	// menu
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(12) > a > span")
	private WebElement btnMenuju2;
	//	tombol surat peringtan2
	@FindBy(css="#sidebar > div > div  >  ul > li")
	private List<WebElement> btnPeringatan2;
	//	sub surat template2 
	@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li > a")
	private List<WebElement> btnSubPeringatan2;
	//upload data2	
	@FindBy(css="#content > div.row > div > div > div.panel-body > a")
	private WebElement btnUpload3;
	//nama template
	@FindBy(name="nama_template")
	private WebElement txtNamaTemplate;
	//jumlah template
	@FindBy(name="jumlah_halaman")
	private WebElement txtJumlah;
	//browse file
	@FindBy(name="pdfsp")
	private WebElement btnBrowseFile;
	//upload
	@FindBy(css="#content > div.row > div > div > div.panel-body > form > div:nth-child(2) > input")
	private WebElement btnUpload4; 

//	Surat Peringatan 3
		// menu
		@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li:nth-child(12) > a > span")
		private WebElement btnMenuju3;
	
		@FindBy(css="#sidebar > div > div  >  ul > li")
		private List<WebElement> btnPeringatan3;
	
		@FindBy(css="#sidebar > div > div:nth-child(1) > ul:nth-child(2) > li.has-sub.expand > ul > li > a")
		private List<WebElement> btnSubPeringatan3;



	
//eksekusi surat peringatan1
	public void surat1() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", btnMenuju1);
		btnPeringatan1.get(18).click();
		btnSubPeringatan1.get(0).click();
	}
	public void upload1() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnUpload1.click();
	}
	
	public void file() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		clickFile.sendKeys("E:\\JC\\excel\\Latihan1.xlsx");
		
	}
	
	public void tipe(int selection) {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnTipe.click();
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
		
	}
	
	public void katagori(int selection) {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnKatagori.click();
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	
	}
	
	public void btnUpload1() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnUpload2.click();
	}
	
	
//	eksekusi surat peringatan2
	public void surat2() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", btnMenuju2);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnPeringatan2.get(18).click();
		btnSubPeringatan2.get(1).click();
	}
	public void upload2() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnUpload3.click();
	}
	public void inputNamaTemplate(String namaTemplate) {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		txtNamaTemplate.sendKeys(namaTemplate);
		
	}
	
	public void inputJumlah(String jumlah) {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		txtJumlah.sendKeys(jumlah);
		
	}
	public void browseFile() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnBrowseFile.sendKeys("E:\\JC\\excel\\suratlamaran.pdf");
		
	}	
	public void upload3() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnUpload4.click();
	}
	
//	ekseskusi surat peringata 3
	@SuppressWarnings("deprecation")
	public void surat3() {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(waitForelement));
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("li.has-sub"))).click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".sub-menu>li>a"))).click();
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].scrollIntoView(true);", btnMenuju3);
//		btnPeringatan3.get(18).click();		
//		btnSubPeringatan3.get(2).click();
	}

	

	
}
