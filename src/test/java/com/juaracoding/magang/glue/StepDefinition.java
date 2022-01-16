package com.juaracoding.magang.glue;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.magang.config.AutomationFrameworkConfiguration;
import com.juaracoding.magang.driver.DriverSingleton;
import com.juaracoding.magang.page.LoginPage;
import com.juaracoding.magang.page.LogoutPage;
import com.juaracoding.magang.page1.SuratPage;
//import com.juaracoding.magang.page.cuti.CutiPage;
//import com.juaracoding.magang.page.cuti.PeringatanPage;
import com.juaracoding.magang.utils.ConfigurationProperties;
import com.juaracoding.magang.utils.Constants;
import com.juaracoding.magang.utils.Log;
import com.juaracoding.magang.utils.TestCases;
import com.juaracoding.magang.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {

	private WebDriver driver;
	private LoginPage loginPage;
//	private AddPriode addPriode;
//	private CutiPage cutiPage;
	private SuratPage suratPage;
	private LogoutPage logoutPage;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		loginPage = new LoginPage();
//		cutiPage = new CutiPage();
		suratPage = new SuratPage();
		logoutPage = new LogoutPage();
		
		TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testCount].getTestName());
		Log.getLogData(Log.class.getName()); //log4j
		Log.startTest(tests[Utils.testCount].getTestName()); //log4j
		Utils.testCount++;
	}
	
	// Scenario login hrd
	@Given("^User go to the Website")
	public void user_go_to_the_Website() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		Log.info("INFO: Navigating to " + Constants.URL); //log4j
		extentTest.log(LogStatus.PASS, "Navigating to " + Constants.URL);
	}
	
	@When("^User input username and password and login")
	public void user_input_username_and_password_and_login() {
		loginPage.goToLoggedIn(configurationProperties.getUserName(), configurationProperties.getPassword());
		extentTest.log(LogStatus.PASS, "User input username password and click Login");
	}
	@Then("^User can login to the Website")
	public void user_can_login_to_the_website() {
		 loginPage.goToLoginPage();
		 extentTest.log(LogStatus.PASS, "User can login to the Website");
	}
	
// surat1
	@Given("^User can scroll down in sidebar")
	public void user_can_scroll_down_in_sidebar() {
	//	cutiPage.cuti();
		suratPage.surat1();
		extentTest.log(LogStatus.PASS, "user can scroll down in sidebar");
	}
	
	@Then("^User can click Surat peringatan and upload surat peringatan")
	public void user_can_click_surat_peringatan_and_upload_surat_peringatan() {
	//	cutiPage.cuti();
		suratPage.surat1();
		extentTest.log(LogStatus.PASS, "User can click Surat peringatan and upload surat peringatan");
	}
	
	@When("^User can upload data1")
	public void user_can_upload_data() {
		suratPage.upload1();
		extentTest.log(LogStatus.PASS, "User can upload data");
	}
	@When("^User can choose file")
	public void user_can_choose_file() {
		suratPage.file();
		extentTest.log(LogStatus.PASS,"User can choose file");	
	}
	@When("^User can choose tipe")
	public void user_can_choose_tipe() {
		suratPage.tipe(2);
		extentTest.log(LogStatus.PASS,"User can choose tipe");
	}
	@When("^User can choose katagori")
	public void user_can_choose_katagori() {
		suratPage.katagori(1);
		extentTest.log(LogStatus.PASS,"User can choose katagori");
	}
	@Then("^User can click upload1")
	public void user_can_click_upload1() {
		suratPage.btnUpload1();
		extentTest.log(LogStatus.PASS,"User can click upload1");
	}
//	surat peringatan2
	@Given("^User can scroll down in sidebar2")
	public void user_can_scroll_down_in_sidebar2() {
		suratPage.surat2();
		extentTest.log(LogStatus.PASS, "User can scroll down in sidebar2");
	}
	@Then("^User can click Surat peringatan and setup template surat")
	public void user_can_click_surat_peringatan_and_setup_template_surat() {
		suratPage.surat2();
		extentTest.log(LogStatus.PASS, "User can click Surat peringatan and setup template surat");
	}
	@Given("^User can click upload data2")
	public void user_can_click_upload_data2() {
		suratPage.upload2();
		extentTest.log(LogStatus.PASS, "User can click upload data2");
	}
	@When("^User can input nama template")
	public void user_can_input_nama_template() {
		suratPage.inputNamaTemplate(configurationProperties.getNamaTemplate());
		extentTest.log(LogStatus.PASS, "User can input nama template");
	}
	@When("^User can input jumlah halaman")
	public void user_can_input_jumlah_halaman() {
		suratPage.inputJumlah(configurationProperties.getJumlah());
		extentTest.log(LogStatus.PASS, "User can input jumlah halaman");
	}
	@When("^User can choose browse file")
	public void user_can_choose_browse_file() {
		suratPage.browseFile();
		extentTest.log(LogStatus.PASS,"User can choose browse file");
	}
	@Then("^User can click upload2")
	public void user_can_click_upload2() {
		suratPage.upload3();
		extentTest.log(LogStatus.PASS, "User can click upload2");
	}
//	surat peringatan3
	@Given("^User can scroll down in sidebar3")
	public void user_can_scroll_down_in_sidebar3() {
		suratPage.surat3();
		extentTest.log(LogStatus.PASS, "User can scroll down in sidebar3");
	}
	
	@When("^User can click surat peringatan and request surat")
	public void user_can_click_surat_peringatan_and_request_surat() {
		suratPage.surat3();
		extentTest.log(LogStatus.PASS, "User can click surat peringatan and requset surat");
	}

	
	
	
	
	
//	@When("^User can click action")
//	public void user_can_click_action() {
//		 addPriode.btnAction();
//		 extentTest.log(LogStatus.PASS, "User can click action");
//	}
//	
//	@When("^User create new")
//	public void user_create_new() {
//		 addPriode.btnCreate();
//		 extentTest.log(LogStatus.PASS, "User can click action");
//	}
//	
//	@When("^User click zoom out")
//	public void user_click_zoom_out() {
//		addPriode.btnZoomOut();
//		extentTest.log(LogStatus.PASS, "User click zoom out");
//	}
//	
//	@When("^User click number list")
//	public void user_click_number_list() {
//		 addPriode.btnNumber();
//		 extentTest.log(LogStatus.PASS, "User can click action");
//	}
//	
//	@When("^User click set holiday")
//	public void user_click_set_holiday() {
//		 addPriode.setHoliday();
//		 extentTest.log(LogStatus.PASS, "User click set holiday");
//	}
	
	// Posts
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
}
