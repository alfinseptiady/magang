Feature: HRIS Surat peringatan

	Scenario: Testing Surat peringatan
		Given User can scroll down in sidebar
		Then User can click Surat peringatan and upload surat peringatan
		
		When User can upload data1
		When User can choose file
		When User can choose tipe
		When User can choose katagori
		Then User can click upload1 
		
		Given User can scroll down in sidebar2
		Then User can click Surat peringatan and setup template surat
		
		Given User can click upload data2
		When User can input nama template
		When User can input jumlah halaman
		When User can choose browse file
		Then User can click upload2
		
		Given User can scroll down in sidebar3
		When User can click surat peringatan and request surat
		