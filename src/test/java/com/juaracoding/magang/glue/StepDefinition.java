package com.juaracoding.magang.glue;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import javax.security.auth.callback.ConfirmationCallback;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.magang.config.AutomationFrameworkConfiguration;
import com.juaracoding.magang.driver.DriverSingleton;
import com.juaracoding.magang.page.CutiPage;
import com.juaracoding.magang.page.HomeMyTask;
import com.juaracoding.magang.page.LoginPage;
import com.juaracoding.magang.page.PromotionPage;
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
	private CutiPage cutiPage;
	private PromotionPage promotionPage;
	
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		loginPage = new LoginPage();
		homeMyTask = new HomeMyTask();
		cutiPage = new CutiPage();
		promotionPage = new PromotionPage();
		
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
	
	@Given("^User dapat click form data")
	public void User_dapat_click_form_data() {
		cutiPage.sidebarData();
		extentTest.log(LogStatus.PASS, "User dapat click form data");
	}
	
	@When("^User dapat click slip gaji")
	public void User_dapat_click_slip_gaji() {
		cutiPage.sidebarSlipgaji();
		extentTest.log(LogStatus.PASS,"User dapat click slip gaji");
	}
	
	@When("^User dapat click pengajuan cuti")
	public void user_dapat_click_pengajuan_cuti() {
		cutiPage.sidebarPengajuanCuti();
		extentTest.log(LogStatus.PASS, "User dapat click pengajuan cuti");
	}
	
	@When("^User mengadd form cuti")
	public void user_mengadd_form_cuti() {
		cutiPage.formCuti();
		extentTest.log(LogStatus.PASS, "User mengadd form cuti");
		
	}
	@When("^User memilih type annual")
	public void User_memilih_Type_annual() {
		cutiPage.selectType(1);
		extentTest.log(LogStatus.ERROR, "System tiba tiba menutup form cuti");
	}
	@When("^User dapat click persetujuan cuti")
	public void user_dapat_click_persetujuan_cuti() {
		cutiPage.persetujuanCuti();
		extentTest.log(LogStatus.PASS, "User dapat click persetujuan cuti");	
	}
	@When("^User dapat click pengajuan resign")
	public void user_dapaat_click_pengajuan_resign() {
		cutiPage.pengajuanResign();
		extentTest.log(LogStatus.PASS, "User dapat click pengajuan resign");
	}
	@When("^User menambah request resign")
	public void user_menambahkan_request_resign() {
		cutiPage.requestResign();
		extentTest.log(LogStatus.PASS, "User menambah request resign");
	}
	@When("^User dapat memilih salah satu radio button di alasan")
	public void user_dapat_memilih_salah_satu_radio_button_di_alasan() {
		cutiPage.alasanBtn();
		extentTest.log(LogStatus.PASS, "User dapat memilih salah satu radio button di alasan");
	}
	@When("^User dapat menginput tanggal resign")
	public void user_dapat_menginput_tanggal_resign() {
	cutiPage.resignDate(configurationProperties.getResignDate());
	extentTest.log(LogStatus.PASS, "User dapat menginput tanggal resign");
	}
	@When("^User dapat memilih salah satu yang ada di field bersedia rekrut kembali")
	public void user_dapat_memilih_salah_satu_yang_ada_di_field_bersedia_rekrut_kembali() {
		cutiPage.listRekrutKembali(2);
		extentTest.log(LogStatus.ERROR, "Tidak dapat menampilkan");
		
	}
	@When("^User dapat input answer")
	public void user_dapat_input_answer() {
		cutiPage.inputAnswer(
		configurationProperties.getAnswer1(),configurationProperties.getAnswer2(),
		configurationProperties.getAnswer3(),configurationProperties.getAnswer4());
		extentTest.log(LogStatus.PASS, "User dapat input answer");
		
	}
	@Then("^User dapat click submit")
	public void user_dapat_click_submit() {
		cutiPage.btnSubmit();
		extentTest.log(LogStatus.PASS, "User dapat click submit dan data berhasil di kirim");
	}
	@Given("^User dapat click form data1")
	public void user_dapat_click_form_data1() {
		cutiPage.sidebarData1();
		extentTest.log(LogStatus.PASS, "User dapat click form data1");
	}
	@When("^User dapat click survey")
	public void user_dapat_click_survey() {
		cutiPage.btnSurvey();
		extentTest.log(LogStatus.PASS, "User dapat click survey");
	}
	@When("^User dapat click tanda tangan digital")
	public void user_dapat_click_tanda_tangan_digital() {
		cutiPage.btnTandaTanganDigital();
		extentTest.log(LogStatus.PASS,"User dapat click tanda tangan digital");
	}
	@When("^User dapat menulis tanda tangannya")
	public void user_dapat_menulis_tanda_tangannya() {
		cutiPage.PenTandaTangan();
		extentTest.log(LogStatus.PASS, "user dapat menulis tanda tangannya");
	}
	@When("^User dapat hapus tanda tangan")
	public void user_dapat_hapus_tanda_tangan() {
		cutiPage.HapusTTD();
		extentTest.log(LogStatus.PASS, "User dapat hapus tanda tagana");
	}
	@When("^User dapat menulis tanda tangannya1")
	public void user_dapat_menulis_tanda_tangannya1() {
		cutiPage.PenTandaTangan();
		extentTest.log(LogStatus.PASS, "User dapat menulis tanda tangannya1");
	}
	@When("^User dapat save tanda tangan")
	public void user_dapat_menulis_tanda_tangan() {
		cutiPage.SaveTTD();
		extentTest.log(LogStatus.PASS, "User dapat save tanda tangan");
	}
//	promotion
	@When("^User dapat click form promotion")
	public void user_dapat_click_form_promotion() {
		promotionPage.Promotion();
		extentTest.log(LogStatus.PASS, "User dapat click form promotion");
	}
//	subPromotion
	@When("^User dapat click sub promotion")
	public void user_dapat_click_sub_promotion() {
		promotionPage.subPromotion();
		extentTest.log(LogStatus.PASS, "User dapat click sub promotion");
	}
//	addDataPromotion
	@When("^User dapat click add data promotion")
	public void user_dapat_click_data_promotion() {
		promotionPage.addDataPromotion();
		extentTest.log(LogStatus.PASS, "User dapat click add data promotion");
	}
//	kembali
	@When("^User dapat click tombol kembali")
	public void user_dapat_click_tombol_kembali() {
		promotionPage.Kembali();
		extentTest.log(LogStatus.PASS, "User dapat click tombol kembali");
	}
//	addDataPromotion1
	@When("^User dapat click add data promotion1")
	public void user_dapat_click_form_promotion1() {
		promotionPage.addDataPromotion();
		extentTest.log(LogStatus.PASS, "User dapat click form promotion1");
	}
	@When ("^User dapat click salah satu dari tujuan promosi")
	public void user_dapat_click_salah_satu_dari_tujuan_promosi() {
		promotionPage.TujuanPromosi();
		extentTest.log(LogStatus.PASS, "User dapat click salah satu dari tujuan promosi");
	}
	@When("^User dapat click dan memilih nik yang di pilih")
	public void user_dapat_click_dan_memilih_nik_yang_di_pilih() {
		promotionPage.SelectNik(1);
		extentTest.log(LogStatus.PASS, "User dapat click dan memilih nik yang di pilih");
	}
	@When("^User dapat input nominal gaji")
	public void user_dapat_input_nominal_gaji() {
		promotionPage.GajiPokok(configurationProperties.getGaji());
		extentTest.log(LogStatus.ERROR, "tiba saja berubah kembali ke defaultnya");
	}
	@When("^User dapat input tunjangan jabatan")
	public void user_dapat_input_tunjangan_jabatan() {
		promotionPage.TunjanganJabatan(configurationProperties.getJabatan());
		extentTest.log(LogStatus.ERROR, "setelah di input berubah lagi ke defaultnya");
	}
	
	// Posts
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
}
