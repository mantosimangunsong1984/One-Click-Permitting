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

WebUI.click(findTestObject('Perizinan/Permohonan/Permohonan Baru/Page_One Click Permiting/span_peizinan'))

WebUI.click(findTestObject('Perizinan/Permohonan/Permohonan Baru/Page_One Click Permiting/span_Permohonan'))

WebUI.click(findTestObject('Perizinan/Permohonan/Permohonan Baru/Page_One Click Permiting/a_Permohonan_Baru'))

WebUI.click(findTestObject('Perizinan/Permohonan/Permohonan Baru/Page_One Click Permiting/span_Pilih-Company'))

WebUI.setText(findTestObject('Perizinan/Permohonan/Permohonan Baru/Page_One Click Permiting/input__select2-search_company'), 
    'MHU Coal')

WebUI.sendKeys(findTestObject('Perizinan/Permohonan/Permohonan Baru/Page_One Click Permiting/input__select2-search_company'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Perizinan/Permohonan/Permohonan Baru/Page_One Click Permiting/span_select2-Jenis-perizinan-yang-diajukan'))

WebUI.setText(findTestObject('Perizinan/Permohonan/Permohonan Baru/Page_One Click Permiting/input_select-perizinan-yg-diajukan'), 
    'Perizinan Usaha')

WebUI.sendKeys(findTestObject('Perizinan/Permohonan/Permohonan Baru/Page_One Click Permiting/input_select-perizinan-yg-diajukan'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Perizinan/Permohonan/Permohonan Baru/Page_One Click Permiting/input_target-waktu-izin-terbit'), 
    '30/11/2025')

WebUI.setText(findTestObject('Perizinan/Permohonan/Permohonan Baru/Page_One Click Permiting/textarea_Deskripsi'), 'Hanya untuk keperluan testing saja')

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Perizinan/Permohonan/Permohonan Baru/Page_One Click Permiting/button_Ajukan-permohonan'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.closeBrowser()

