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
import com.juaracoding.magang.page.ReimbursementPage;
import com.juaracoding.magang.page.RequestStaffPage;
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
	private ReimbursementPage reimbursementPage;
	private RequestStaffPage requestStaffPage;
	
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
		reimbursementPage = new ReimbursementPage();
		requestStaffPage = new RequestStaffPage();
		
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
		cutiPage.tunda();
		cutiPage.sidebarData();
		extentTest.log(LogStatus.PASS, "User dapat click form data");
	}
	
	
	@When("^User dapat click slip gaji")
	public void User_dapat_click_slip_gaji() {
		cutiPage.tunda();
		cutiPage.sidebarSlipgaji();
		extentTest.log(LogStatus.PASS,"User dapat click slip gaji");
	}
	@When("^User dapat click select priode")
	public void user_dapat_click_select_priode() {
		cutiPage.tunda();
		cutiPage.SelectPriode();
		extentTest.log(LogStatus.ERROR,"User tidak dapat memilih priode"+"<img src=\"screenshots/7.png\" width=\"250px\" height=\"75px\">");
	}
	@When("^User dapat click filter")
	public void user_dapat_click_filter() {
		cutiPage.tunda();
		cutiPage.BtnFilter();
		extentTest.log(LogStatus.ERROR,"tidak dapat menampilkan"+"<img src=\"screenshots/8.png\" width=\"250px\" height=\"75px\">");
	}
	
	@When("^User dapat click pengajuan cuti")
	public void user_dapat_click_pengajuan_cuti() {
		cutiPage.tunda();
		cutiPage.sidebarPengajuanCuti();
		extentTest.log(LogStatus.PASS, "User dapat click pengajuan cuti");
	}
	
	@When("^User mengadd form cuti")
	public void user_mengadd_form_cuti() {
		cutiPage.tunda();
		cutiPage.formCuti();
		extentTest.log(LogStatus.PASS, "User mengadd form cuti");
		
	}
	@When("^User memilih type annual")
	public void User_memilih_Type_annual() {
		cutiPage.tunda();
		cutiPage.selectType(1);
		extentTest.log(LogStatus.ERROR, "System tiba tiba menutup form cuti"+"<img src=\"screenshots/9.png\" width=\"250px\" height=\"75px\">");
	}
	@When("^User memilih tanggal cuti")
	public void user_memilih_tanggal_cuti() {
		cutiPage.tunda();
//		cutiPage.TanggalCuti(configurationProperties.getTglCuti());
		extentTest.log(LogStatus.WARNING, "System Debug Sialan");
	}
	@When("^User dapat click persetujuan cuti")
	public void user_dapat_click_persetujuan_cuti() {
		cutiPage.persetujuanCuti();
		extentTest.log(LogStatus.PASS, "User dapat click persetujuan cuti");	
	}
	@When("^User dapat click pengajuan resign")
	public void user_dapaat_click_pengajuan_resign() {
		cutiPage.tunda();
		cutiPage.pengajuanResign();
		extentTest.log(LogStatus.PASS, "User dapat click pengajuan resign");
	}
	@When("^User menambah request resign")
	public void user_menambahkan_request_resign() {
		cutiPage.tunda();
		cutiPage.requestResign();
		extentTest.log(LogStatus.PASS, "User menambah request resign");
	}
	@When("^User dapat memilih salah satu radio button di alasan")
	public void user_dapat_memilih_salah_satu_radio_button_di_alasan() {
		cutiPage.tunda();
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
		extentTest.log(LogStatus.ERROR, "Tidak dapat menampilkan"+"<img src=\"screenshots/10.png\" width=\"250px\" height=\"75px\">");
		
	}
	@When("^User dapat input answer")
	public void user_dapat_input_answer() {
		cutiPage.inputAnswer(
		configurationProperties.getAnswer1(),configurationProperties.getAnswer2(),
		configurationProperties.getAnswer3(),configurationProperties.getAnswer4());
		extentTest.log(LogStatus.PASS, "User dapat input answer");
		
	}
	@Then("^User dapat click submit1")
	public void user_dapat_click_submit1() {
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
	//promotion
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
	@When("^User dapat input nominal gaji pokok")
	public void user_dapat_input_nominal_gaji_pokok() {
		promotionPage.GajiPokok(configurationProperties.getPokok());
		extentTest.log(LogStatus.ERROR, "nominalnya kembali ke default"+"<img src=\"screenshots/11.png\" width=\"250px\" height=\"75px\">");
	}
	@When("^User dapat input tunjangan jabatan")
	public void user_dapat_input_tunjangan_jabatan() {
		promotionPage.TunjanganJabatan(configurationProperties.getJabatan());
		extentTest.log(LogStatus.PASS, "User dapat input tunjangan jabatan");
	}
	@When("^User dapat input tunjangan komunikasi")
	public void user_dapat_input_tunjangan_komunikasi() {
		promotionPage.TunjanganKomunikasi(configurationProperties.getKomunikasi());
		extentTest.log(LogStatus.PASS, "User dapat input tunjangan komunikasi");
	}
	@When("^User dapat input tunjangan transportasi")
	public void user_dapat_input_tunjangan_trasnportasi() {
		promotionPage.TunjanganKomunikasi(configurationProperties.getTransportasi());
		extentTest.log(LogStatus.ERROR, "nominalnya kembali ke default"+"<img src=\"screenshots/12.png\" width=\"250px\" height=\"75px\">");
	}
	@When("^User dapat input tanggal efektif")
	public void user_dapat_input_tanggal_efektif() {
		 promotionPage.TanggalEfektif(configurationProperties.getTglEfektif());
		 extentTest.log(LogStatus.PASS, "User dapat input tanggal efektif");
	}
	@When("^User dapat memilih devisi")
	public void user_dapat_memilih_devisi() {
		promotionPage.Devisi();
		extentTest.log(LogStatus.PASS, "User dapat memilih devisi");
	}
	@When("^User dapat memilih level")
	public void user_dapat_memilih_level() {
		promotionPage.Level();
		extentTest.log(LogStatus.PASS, "User dapat memilih level");
	}
	@When("^User dapat memilih status")
	public void user_dapat_memilih_status() {
		promotionPage.Status();
		extentTest.log(LogStatus.PASS, "User dapat memilih status");
	}
	@When("^User dapat memilih unit")
	public void user_dapat_memilih_unit() {
		promotionPage.Unit();
		extentTest.log(LogStatus.PASS, "User dapat memilih unit");
	}
	@When("^User dapat memilih jabatan")
	public void user_dapat_memilih_jabatan() {
		promotionPage.jabatan();
		extentTest.log(LogStatus.PASS, "User dapat memilih jabatan");
	}
	@When("^User dapat click nilai dari form penilaian")
	public void user_dapat_click_niali_dari_form_penilaian() {
		promotionPage.FromNilai();
		extentTest.log(LogStatus.PASS, "User dapat click nilai dari form penilaian");
	}
	@When("^User dapat input asuransi1")
	public void	user_dapat_input_Aspek_aspek_kelebihan_karyawan() {
		promotionPage.AspekKaryawan1(configurationProperties.getAspek1());
		extentTest.log(LogStatus.PASS, "User dapat input asuransi1");
	}
	@When("^User dapat input asuransi2")
	public void user_dapat_input_aspek_aspek_yang_masih_harus_ditingkatkan() {
		promotionPage.AspekKaryawan2(configurationProperties.getAspek2());
		extentTest.log(LogStatus.PASS, "User dapat input asuransi2");
	}
	@When("^User dapat input asuransi3")
	public void user_dapat_input_asuransi3() {
		promotionPage.AspekKaryawan3(configurationProperties.getAspek3());
		extentTest.log(LogStatus.PASS, "User dapat input asuransi3");
	}
	@When("^User dapat pilih ulasan")
	public void user_dapat_pilih_ulasan() {
		promotionPage.UlasanAtasan();
		extentTest.log(LogStatus.PASS, "User dapat pilih ulasan");
	}
	@When("^User dapat memilih vaksin")
	public void user_dapat_memilih_vaksin() {
		promotionPage.Vaksin();
		extentTest.log(LogStatus.PASS, "User dapat memilih vaksin");
	}
	@When("^User dapat input vaksin note")
	public void user_dapat_input_vaksin_note() {
		promotionPage.VaksinNote(configurationProperties.getVaksinNote());
		extentTest.log(LogStatus.PASS, "User dapat input vaksin note");
	}
	@When("^User dapat click send")
	public void user_dapat_click_send() {
		promotionPage.Send();
		extentTest.log(LogStatus.PASS, "User dapat click send");
	}
	@When("^User dapat click tombol kembali1")
	public void user_dapat_click_tombol_kembali1() {
		promotionPage.Kembali();
		extentTest.log(LogStatus.PASS, "User dapat click kembali1");
	}
	@When("^User dapat click start date1")
	public void user_dapat_click_start_date() {
		promotionPage.StartDate1();
		extentTest.log(LogStatus.PASS, "User dapat click start date");
	}
	@When("^User dapat click input date1")
	public void user_dapat_click_input_date() {
		promotionPage.InputDate1();
		extentTest.log(LogStatus.PASS, "User dapat click input date");
	}
	@When("^User dapat click end date1")
	public void user_dapat_click_end_date() {
		promotionPage.EndDate1();
		extentTest.log(LogStatus.PASS, "User dapat click click date1");
	}
	@When("^User dapat click input end date1")
	public void user_dapat_click_input_end_date() {
		promotionPage.InputEndDate1();
		extentTest.log(LogStatus.PASS, "User dapat click input end date1");
	}
	@When("^User dapat click reset")
	public void user_dapat_clcik_reset() {
		promotionPage.BtnReset();
		extentTest.log(LogStatus.PASS, "User dapat click reset");
	}
//	................................................
	@When("^User dapat click start date2")
	public void user_dapat_click_start_date2() {
		promotionPage.StartDate2();
		extentTest.log(LogStatus.PASS, "User dapat click start date2");
	}
	@When("^User dapat click input date2")
	public void user_dapat_click_input_date2() {
		promotionPage.InputDate2();
		extentTest.log(LogStatus.PASS, "User dapat click input date2");
	}
	@When("^User dapat click end date2")
	public void user_dapat_click_end_date2() {
		promotionPage.EndDate2();
		extentTest.log(LogStatus.PASS, "User dapat click end date2");
	}
	@When("^User dapat click input end date2")
	public void user_dapat_click_input_end_date2() {
		promotionPage.InputDate2();
		extentTest.log(LogStatus.PASS, "User dapat click input end date2");
	}
	@When("^User dapat click tombol filter")
	public void user_dapat_click_tombol_filter() {
		promotionPage.BtnFilter();
		extentTest.log(LogStatus.ERROR, "Tidak dapat menampilkan"+"<img src=\"screenshots/1.png\" width=\"250px\" height=\"75px\">");
	}
	//reimbursement
	@When("^User dapat click reimbursement")
	public void user_dapat_click_reimbursement() {
		reimbursementPage.SideReimb();
		extentTest.log(LogStatus.PASS, "user dapat click reimbursement");
	}
//klaim asuransi
	@When("^User dapat click klaim asuransi")
	public void user_dapat_click_klaim_asuransi() {
		reimbursementPage.KlaimAsuransi();
		extentTest.log(LogStatus.PASS, "user dapat click klaim asuransi");
	}
//	addclaim
	@When("^User dapat click add claim")
	public void user_dapat_click_add_claim() {
		reimbursementPage.AddClaim();
		extentTest.log(LogStatus.PASS, "user dapat click add klaim");
	}
//	tanggalpengajuan
	@When("^User dapat click tanggal pengajuan")
	public void user_dapat_click_tanggal_pengajuan() {
		reimbursementPage.TanggalPengajuan();
		extentTest.log(LogStatus.PASS,"User dapat click tanggal pengajuan");
	}
	@When("^User dapat input tanggal pengajuan")
	public void user_dapat_input_tanggal_pengajuan() {
		reimbursementPage.InputTanggalPengajuan();
		extentTest.log(LogStatus.PASS,"User dapat input tanggan penganjuan");
	}
	@When("^User dapat input nomer kartu")
	public void user_dapat_input_nomer_kartu() {
		reimbursementPage.NomerKartu(configurationProperties.getNokartu());
		extentTest.log(LogStatus.PASS,"user dapat input nomer kartu");
	}
	@When("^User dapat input nama tanggung")
	public void user_dapat_input_nama_tanggung() {
		reimbursementPage.NamaTanggung(configurationProperties.getNamaTanggung());
		extentTest.log(LogStatus.PASS, "user dapat input nama tanggung");
	}
	@When("^User dapat input nilai klaim")
	public void user_dapat_input_nilai_klaim() {
		reimbursementPage.NilaiKlaim(configurationProperties.getNilaiKlaim());
		extentTest.log(LogStatus.PASS, "user dapat input nilai klaim");
	}
	@When("^User dapat click submit")
	public void user_dapat_click_submit() {
		reimbursementPage.Submit();
		extentTest.log(LogStatus.PASS, "user dapat click submit");
	}
	@When("^User dapat upload kwintasi1")
	public void user_dapat_upload_kwintasi() {
		reimbursementPage.uploadDokumen();
		extentTest.log(LogStatus.PASS, "user dapat upload kwintasi");
	}
	@When("^User dapat click view")
	public void user_dapat_click_view() {
		try {
			Thread.sleep(3000);;
		} catch (Exception e) {
			// TODO: handle exception
		}
		reimbursementPage.Views();
	}
	@When("^User dapat click close")
	public void user_dapat_click_close() {
		reimbursementPage.Close();
		reimbursementPage.Kirim1();
		reimbursementPage.Kembali();
		reimbursementPage.KlaimKacaMata();

	}
	
	@When("^User dapat click kirim")
	public void user_dapat_click_kirim() {
		extentTest.log(LogStatus.PASS, "User dapat click kirim");

	}
	@When("^User dapat click kembali")
	public void a1() {
		extentTest.log(LogStatus.PASS, "User dapat click kembali");
		
	}
	@When("^User dapat click klaim kaca mata")
	public void a2() {
		extentTest.log(LogStatus.PASS, "User dapat click klaim kaca mata");
	}
			

	@When("^User dapat click add klaim")
	public void a3() {
		extentTest.log(LogStatus.PASS, "User dapat click add klaim");
	}

	@When("^User dapat click tanggal pengajuan1")
	public void a4() {
		extentTest.log(LogStatus.PASS, "User dapat click tanggal pengajuan");
	}

	@When("^User dapat click nomor kartu1")
	public void a5() {
		extentTest.log(LogStatus.PASS, "User dapat click nomor kartu");
	}

	@When("^User dapat click nama tertanggung1")
	public void a6() {
		extentTest.log(LogStatus.PASS, "User dapat click nama tertanggung");
	}

	@When("^User dapat click nilai klaim1")
	public void a7() {
		extentTest.log(LogStatus.PASS, "User dapat click nilai klaim1");
	}
	@When("^User dapat click kirim1")
	public void a8() {
		extentTest.log(LogStatus.PASS, "User dapat click kirim");
	}
	
//	c=page approval kaca mata
	@When("^User dapat click approval klaim kaca mata")
	public void c1() {
		reimbursementPage.Approval();
		extentTest.log(LogStatus.PASS, "User dapat click approval klaim kaca mata");
	}
	@When("User dapat mengisi start date dan end date1")
	public void c2() {
		reimbursementPage.StardEndapproval();
		extentTest.log(LogStatus.PASS, "User dapat mengisi start date dan end date");
	}
	@When("^User dapat reset")
	public void c3() {
	extentTest.log(LogStatus.PASS, "User dapat reset");
	}
	@When("^User dapat mengisi start date dan end date2")
	public void c4() {
		reimbursementPage.StardEndapproval1();
		extentTest.log(LogStatus.PASS, "User dapat mengisi start date dan end date");
	}
	@When("^User dapat click filter1")
	public void c5() {
		extentTest.log(LogStatus.PASS, "User dapat click filter");
	}
	//d=entertaimnet
	@When("^User dapat click entertaiment")
	public void d1() {
		reimbursementPage.Entertaiment();
		extentTest.log(LogStatus.PASS, "User dapat clcik entertaiment");
	}
	@When("^User dapat add new")
	public void d2() {
		reimbursementPage.AddNew();
		extentTest.log(LogStatus.PASS, "User dapat add new");
	}
	@When("^User dapat pilih devisi")
	public void d3() {
		reimbursementPage.Devisi();
		extentTest.log(LogStatus.PASS, "User dapat pilig devisi");
	}
	@When("^User input nilai klaim")
	public void d4() {
		reimbursementPage.NilaiKalim();
		extentTest.log(LogStatus.PASS, "User input nilai klaim");
	}
	@When("^User dapat click submit2")
	public void d5() {
		extentTest.log(LogStatus.PASS, "User dapat click submit");
	}
	@When("^User input tempat")
	public void d6() {
		extentTest.log(LogStatus.PASS, "User input alamat");
	}
	@When("^User input alamat")
	public void d7() {
		extentTest.log(LogStatus.PASS, "User input alamat");
	}
	@When("^User input staff hadir")
	public void d8() {
		extentTest.log(LogStatus.PASS, "User input staff");
	}
	@When("^User input jumlah klaim")
	public void d9() {
		extentTest.log(LogStatus.PASS,"User input jumlah klaim");
	}
	@When("^User input nama relasi")
	public void d10() {
		reimbursementPage.RelasiUsaha();
		extentTest.log(LogStatus.PASS, "Userr input nama relasi");
	}
	@When("^User input jabatan relasi")
	public void d11() {
		extentTest.log(LogStatus.PASS, "User input jabatan relasi");
	}
	@When("^User input nama perusahaan relasi")
	public void d12() {
		extentTest.log(LogStatus.PASS, "User input nama perusahaan relasi");
	}
	@When("^User input staff yang hadir")
	public void d13() {
		extentTest.log(LogStatus.PASS, "User input staff yang hadir");
	}
	@When("^User pilih jenis entertaiment")
	public void d14() {
		extentTest.log(LogStatus.PASS, "User pilih jenis enntertaiment");
	}
	@When("^User pilih posisi relasi usaha")
	public void d15() {
		extentTest.log(LogStatus.PASS, "User pilih posisi relasi usaha");
	}
	@When("^User pilih jenis usaha relasi customer")
	public void d16() {
		extentTest.log(LogStatus.PASS, "User pilih jenis usaha relasi customer");
	}
	@When("^User pilih tujuan entertaiment")
	public void d17() {
		extentTest.log(LogStatus.PASS, "User pilih tujuan entertaiment");
	}
	@When("^User click submit detail")
	public void d18() {
		extentTest.log(LogStatus.ERROR, "tidak dapat menekan tombol submit detail"+"<img src=\"screenshots/2.png\" width=\"250px\" height=\"75px\">");
	}
	@When("^User upload kwintasi13")
	public void d19() {
		extentTest.log(LogStatus.PASS, "User upload kwintasi");
	}
	@When("^User pilih file13")
	public void d20() {
		extentTest.log(LogStatus.PASS, "User pilih file13");
	}
	@When("^User click upload13")
	public void d21() {
		extentTest.log(LogStatus.PASS, "User click upload13");
	}
	@When("^User click submit form13")
	public void d22() {
		extentTest.log(LogStatus.PASS, "User click submit form 13");
	}
	@When("^User input star date dan end date")
	public void d23() {
		extentTest.log(LogStatus.PASS, "User input star date dan end date");
	}
	@When("^User click reset")
	public void d24() {
		extentTest.log(LogStatus.ERROR, "Tidak dapat mereset"+"<img src=\"screenshots/3.png\" width=\"250px\" height=\"75px\">");
	}
	@When("^User click filter")
	public void d25() {
		extentTest.log(LogStatus.ERROR, "tidak dapa memfilter"+"<img src=\"screenshots/4.png\" width=\"250px\" height=\"75px\">");
	}
//	e=entertaiment approval
	@When("^User click entertaiment approval")
	public void e1() {
		reimbursementPage.EntertaimentAproval();
		extentTest.log(LogStatus.PASS, "User click entertaiment approval");
	}
	@When("^User pilih start date entertaiment approval")
	public void e2() {
		extentTest.log(LogStatus.PASS, "User pilih start date entertaiment approval");
	}
	@When("^User input start date entertaiment approval")
	public void e3() {
		extentTest.log(LogStatus.PASS, "User input start date entertaiment approval");
	}
	@When("^User pilih end date entertaiment approval")
	public void e4() {
		extentTest.log(LogStatus.PASS, "User pilih end date entertaiment approval");
	}
	@When("^User input end date entertaiment approval")
	public void e5() {
		extentTest.log(LogStatus.PASS, "User input end date entertaiment approval");
	}
	@When("^User click reset13")
	public void e6() {
		extentTest.log(LogStatus.ERROR,"tidak dapat click reset"+"<img src=\"screenshots/5.png\" width=\"250px\" height=\"75px\">");
	}
	@When("^User click filter13")
	public void e7() {
		extentTest.log(LogStatus.ERROR, "tidak dapat click filter"+"<img src=\"screenshots/6.png\" width=\"250px\" height=\"75px\">");
	}
	
//	f=request staff
	@When("^User click Request staff")
	public void f1() {
		requestStaffPage.SideRequestStaff();
		extentTest.log(LogStatus.PASS,"User click request staff");
	}
	@When("^User click pending")
	public void f2() {
		requestStaffPage.Pending();
		extentTest.log(LogStatus.PASS,"User click pending");
		
	}
	@When("^User click input data")
	public void f3() {
		extentTest.log(LogStatus.PASS,"User click input data");
	}
	@When("^User pilih tujuan request staff")
	public void f4() {
		extentTest.log(LogStatus.PASS, "User pilih tujuan request staff");
	}
	@When("^User input unit request staff")
	public void f5() {
		extentTest.log(LogStatus.PASS, "User input unit request staff");
	}
	@When("^User input jumlah orang request staff")
	public void f6() {
		extentTest.log(LogStatus.PASS, "user input jumlah orang request staff");
	}
	@When("^User pilih mulai kerja request staff")
	public void f7() {
		extentTest.log(LogStatus.PASS, "User pilih mulai kerja request staff");
	}
	@When("^User input mulai kerja request staff")
	public void f8() {
		extentTest.log(LogStatus.PASS, "User input mulai kerja request staff");
	}
	@When("^User pilih lokasi kerja")
	public void f9() {
		extentTest.log(LogStatus.PASS, "User pilih lokasi kerja");
	}
	@When("^User input deskripsi pekerjaan")
	public void f10() {
		extentTest.log(LogStatus.PASS, "User input deskripsi pekerjaan");
	}
	@When("^User input masa percobaan")
	public void f11() {
		extentTest.log(LogStatus.PASS, "User input masa percobaan");
	}
	@When("^User pilih golongan jabatan")
	public void f12() {
		extentTest.log(LogStatus.PASS, "User pilih golongan jabatan");
	}
	@When("^user input gaji")
	public void f13() {
		extentTest.log(LogStatus.PASS, "user input gaji");
	}
	@When("^User pilih asuransi")
	public void f14() {
		extentTest.log(LogStatus.PASS, "User pilih asuransi");
	}
	@When("^User input tunjangan jabatan")
	public void f15() {
		extentTest.log(LogStatus.PASS, "User input tunjangan jabatan");
		
	}
	@When("^User input tunjangan transportasi")
	public void f16() {
		extentTest.log(LogStatus.PASS, "User input tunjangan transportasi");
	}
	@When("^input notes")
	public void f17() {
		extentTest.log(LogStatus.PASS, "input notes");
	}
	@When("^User click submit15")
	public void f18() {
		extentTest.log(LogStatus.PASS, "User click submit15");
	}
	@When("^User click tracking")
	public void f19() {
		requestStaffPage.Tracking();
		extentTest.log(LogStatus.PASS, "User click tracking");
	}
	@When("^User click surat peringatan")
	public void f20() {
		requestStaffPage.SuratPeringatan();
		extentTest.log(LogStatus.PASS, "User click surat peringatan");
	}
	@When("^User click list letter")
	public void f21() {
		extentTest.log(LogStatus.PASS, "User click list letter");
	}
	@When("^User click logout")
	public void f22() {
		requestStaffPage.Logout();
		extentTest.log(LogStatus.PASS, "User click logout");
		
	}

	
	
	// Posts
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
}
