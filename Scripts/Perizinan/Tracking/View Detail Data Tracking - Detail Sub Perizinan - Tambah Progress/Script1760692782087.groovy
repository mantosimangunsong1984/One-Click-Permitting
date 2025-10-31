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

WebUI.click(findTestObject('Perizinan/Tracking/Page_One Click Permiting/a_Tracking'))

WebUI.verifyTextPresent('Tracking', false)

WebUI.click(findTestObject('Perizinan/Tracking/Page_One Click Permiting/a_Detail_PerizinanSedangDiproses'))

WebUI.click(findTestObject('Perizinan/Tracking/Page_One Click Permiting/a_View-Detail-Sub-Perizinan'))

WebUI.click(findTestObject('Perizinan/Tracking/Tambah Progress/Page_One Click Permiting/button_Tambah-Progress'))

WebUI.selectOptionByLabel(findTestObject('Perizinan/Tracking/Tambah Progress/Page_One Click Permiting/select_Status_tambah-progress-perizinan'), 
    'Evaluasi', false)

WebUI.setText(findTestObject('Perizinan/Tracking/Tambah Progress/Page_One Click Permiting/textarea_Keterangan'), 'Testing Data Sub Menu Tracking')

WebUI.setText(findTestObject('Perizinan/Tracking/Tambah Progress/Page_One Click Permiting/input_Tanggal'), '31/12/2025')

WebUI.setText(findTestObject('Perizinan/Tracking/Tambah Progress/Page_One Click Permiting/input_File_tambah-progress-perizinan'), 
    'C:\\\\Users\\\\manto.manto\\\\Downloads\\\\MekanismeCheckinCheckOut.docx')

WebUI.click(findTestObject('Perizinan/Tracking/Tambah Progress/Page_One Click Permiting/button_Simpan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

