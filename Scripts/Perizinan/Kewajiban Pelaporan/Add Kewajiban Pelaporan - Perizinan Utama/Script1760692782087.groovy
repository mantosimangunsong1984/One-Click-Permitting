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

WebUI.click(findTestObject('Perizinan/Kewajiban Pelaporan/Page_One Click Permitting/i_Detail_Perizinan-Utama'))

WebUI.delay(3)

WebUI.click(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan 2/Page_One Click Permitting/i_Tambah Kewajiban'))

WebUI.setText(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan 2/Page_One Click Permitting/input_Nama Kewajiban'), 
    'Testing Kewajiban Pelaporan - 2')

WebUI.click(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan 2/Page_One Click Permitting/span_Periode'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan 2/Page_One Click Permitting/input_periode'), 
    'Tahunan')

WebUI.sendKeys(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan 2/Page_One Click Permitting/input_periode'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan 2/Page_One Click Permitting/span_penanggung-jawab'))

WebUI.setText(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan 2/Page_One Click Permitting/input_periode'), 
    'Permitting Section Head')

WebUI.sendKeys(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan 2/Page_One Click Permitting/input_periode'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan 2/Page_One Click Permitting/input_Tanggal Submit Dokumen'), 
    '26/02/2026')

WebUI.click(findTestObject('Perizinan/Kewajiban Pelaporan/Tambah Kewajiban Pelaporan 2/Page_One Click Permitting/i_Simpan_Add Kewajiban Pelaporan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.closeBrowser()

