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
import com.juaracoding.magang.page.HomeMyTask;
import com.juaracoding.magang.page.LoginPage;
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
	private HomeMyTask homeMyTask;

	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		loginPage = new LoginPage();
		homeMyTask = new HomeMyTask();
		
		TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testCount].getTestName());
		Log.getLogData(Log.class.getName()); //log4j
		Log.startTest(tests[Utils.testCount].getTestName()); //log4j
		Utils.testCount++;
	}
	
	// Scenario login manager
//	1LoginPage.feature
	@Given("^User dapat mengisikan url alamat login sistem melalui url browser")
	public void user__dapat_mengisikan_url_alamat_login_sistem_melalui_url_browser() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		Log.info("INFO: Navigating to " + Constants.URL); //log4j
		extentTest.log(LogStatus.PASS, "Navigating to " + Constants.URL);
	}
	
	@When("^User mengisikan username dan password yang sudah di daftarkan")
	public void user_mengisikan_username_yang_sudah_di_daftarkan() {
		loginPage.goToLoggedIn(configurationProperties.getUserName(), configurationProperties.getPassword());
		extentTest.log(LogStatus.PASS, "User mengisikan username yang sudah di daftarkan");
	}

	@Then("^User dapat click login")
	public void user_dapat_click_login() {
		loginPage.goToLoginPage();
		extentTest.log(LogStatus.PASS, "User dapat click login");
	}
	
//	homeMyTask
//	HomePage.feature
	@Given("^User dapat click pengajuan cuti dan menampilkan pengajuan cuti di form data")
	public void User_dapat_click_pengajuan_cuti_dan_menampilkan_pengajuan_cuti_di_form_data() {
		homeMyTask.pengajuanCuti();
		extentTest.log(LogStatus.PASS,"User dapat click pengajuan cuti dan menampilkan pengajuan cuti di form data");
	}
	
//	1
	@When("^User click home dan kembali ke my task1")
	public void User_click_home_dan_kembali_ke_my_task1() {
		homeMyTask.backToHome();
		extentTest.log(LogStatus.PASS, "User click home dan kembali ke my task");
	}
	
	@When("^User dapat click persetujuan cuti dan menampilkan persetujuan cuti di form data")
	public void User_dapat_click_persetujuan_cuti_dan_menampilkan_persetujuan_cuti_di_form_data() {
		homeMyTask.approvalCuti();
		extentTest.log(LogStatus.PASS, "User dapat click persetujuan cuti dan menampilkan persetujuan cuti di form data");
	}
	
//	2
	@When("^User click home dan kembali ke my task2")
	public void User_click_home_dan_kembali_ke_my_task2() {
		homeMyTask.backToHome();
		extentTest.log(LogStatus.PASS, "User click home dan kembali ke my task");
	}
	
	@When("^User dapat click promotion dan menampilkan promotion di dalam form promotion")
	public void user_dapat_click_promotion_dan_menampilkan_promotion_di_dalam_form_promotion() {
		homeMyTask.Promotion();
		extentTest.log(LogStatus.PASS, "User dapat click promotion dan menampilkan promotion di dalam form promotion");
	}
	
//	3
	@When("^User click home dan kembali ke my task3")
	public void User_click_home_dan_kembali_ke_my_task3() {
		homeMyTask.backToHome();
		extentTest.log(LogStatus.PASS, "User click home dan kembali ke my task");
	}
	
	@When("^User dapat click approval invoice dan menampilkan approval invoice yang berada di form sami")
	public void User_dapat_click_approval_invoice_dan_menampilkan_approval_invoice_yang_berada_di_form_sami() { 
		homeMyTask.approvalInvoice();
		extentTest.log(LogStatus.PASS, "User dapat click approval invoice dan menampilkan approval invoice yang berada di form sami");
	}
	
//	4
	@When("^User click home dan kembali ke my task4")
	public void User_click_home_dan_kembali_ke_my_task4() {
		homeMyTask.backToHome();
		extentTest.log(LogStatus.PASS, "User click home dan kembali ke my task");
	}
	

	@When("^User dapat click request staff dan menampilkan pending yang berada di form request staff")
	public void User_dapat_click_request_staff_dan_menampilkan_pending_yang_berada_di_form_request_staff() {
		homeMyTask.requestStaff();
		extentTest.log(LogStatus.PASS, "User dapat click request staff dan menampilkan pending yang berada di form request staff");
	}
	
//	5
	@When("^User click home dan kembali ke my task5")
	public void User_click_home_dan_kembali_ke_my_task5() {
		homeMyTask.backToHome();
		extentTest.log(LogStatus.PASS, "User click home dan kembali ke my task");
	}
	
//	shortSuratPeringatan
	@When("^User dapat click surat peringatan dan menampilkan list letter yang berada di form surat peringatan")
	public void User_dapat_click_surat_peringatan_dan_menampilkan_list_letter_yang_berada_di_form_surat_peringatan() {
		homeMyTask.suratPeringatan();	
	}
	
//	6
	@Then("^User click home dan kembali ke my task6")
	public void User_click_home_dan_kembali_ke_my_task6() {
		homeMyTask.backToHome();
		extentTest.log(LogStatus.PASS, "User click home dan kembali ke my task");
	}
	
	// Posts
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
}
