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

WebUI.click(findTestObject('Perizinan/Daftar Request Perizinan/Page_One Click Permiting/a_Daftar-request-perizinan'))

WebUI.setText(findTestObject('Perizinan/Daftar Request Perizinan/Page_One Click Permiting/input_Cari-data_form'), 'P2025120004')

WebUI.sendKeys(findTestObject('Perizinan/Daftar Request Perizinan/Page_One Click Permiting/input_Cari-data_form'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Perizinan/Daftar Request Perizinan/Page_One Click Permiting/div_Tindak-Lanjut'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Perizinan/Daftar Request Perizinan/Edit Request Perizinan 2/Page_One Click Permitting/i_Edit_Request-Perizinan'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Perizinan/Daftar Request Perizinan/Edit Request Perizinan 2/Page_One Click Permitting/b_Jenis-Perizinan'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Perizinan/Daftar Request Perizinan/Edit Request Perizinan 2/Page_One Click Permitting/input_jenis-perizinan'), 
    '02100')

WebUI.sendKeys(findTestObject('Perizinan/Daftar Request Perizinan/Edit Request Perizinan 2/Page_One Click Permitting/input_jenis-perizinan'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Perizinan/Daftar Request Perizinan/Edit Request Perizinan 2/Page_One Click Permitting/input_Target Waktu Perizinan'), 
    '01/12/2026')

WebUI.click(findTestObject('Perizinan/Daftar Request Perizinan/Edit Request Perizinan 2/Page_One Click Permitting/Set_Critical'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Perizinan/Daftar Request Perizinan/Edit Request Perizinan 2/Page_One Click Permitting/i_Simpan_Edit'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

