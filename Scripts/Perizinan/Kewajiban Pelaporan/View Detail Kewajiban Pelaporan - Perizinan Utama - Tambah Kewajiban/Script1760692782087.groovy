import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/Login Positive'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Perizinan/Daftar Request Perizinan/Page_One Click Permiting/span_Perizinan'))

WebUI.click(findTestObject('Perizinan/Kewajiban Pelaporan/Page_One Click Permiting/a_Kewajiban-pelaporan'))

WebUI.verifyTextPresent('Kewajiban Pelaporan', false)

WebUI.setText(findTestObject('Perizinan/Kewajiban Pelaporan/Page_One Click Permiting/input_Cari_Data'), '23456')

WebUI.sendKeys(findTestObject('Perizinan/Kewajiban Pelaporan/Page_One Click Permiting/input_Cari_Data'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Perizinan/Kewajiban Pelaporan/Page_One Click Permiting/div_Detail-perizinan-Utama'))

WebUI.click(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan/Page_One Click Permiting/button_TambahKewajiban'))

WebUI.setText(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan/Page_One Click Permiting/input_Nama Kewajiban_pelaporan'), 
    'Kewajiban Testing')

WebUI.click(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan/Page_One Click Permiting/span_Periode-tambah-kewajiban-pelaporan'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan/Page_One Click Permiting/input_select-tambah-kewajiban-pelaporan'), 
    'Tahunan')

WebUI.sendKeys(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan/Page_One Click Permiting/input_select-tambah-kewajiban-pelaporan'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan/Page_One Click Permiting/span_Penanggung Jawab'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan/Page_One Click Permiting/input_select-tambah-kewajiban-pelaporan'), 
    'Legal')

WebUI.sendKeys(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan/Page_One Click Permiting/input_select-tambah-kewajiban-pelaporan'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan/Page_One Click Permiting/input_Tanggal Submit Dokumen'), 
    '31/10/2025')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan/Page_One Click Permiting/button_Simpan_Tambah-Kew_Pelaporan'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.closeBrowser()

