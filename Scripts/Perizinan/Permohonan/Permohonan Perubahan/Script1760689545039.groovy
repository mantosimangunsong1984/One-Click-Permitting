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

WebUI.click(findTestObject('Perizinan/Permohonan/Permohonan perubahan/Page_One Click Permitting/span_Perizinan'))

WebUI.click(findTestObject('Perizinan/Permohonan/Permohonan perubahan/Page_One Click Permitting/span_Permohonan'))

WebUI.click(findTestObject('Perizinan/Permohonan/Permohonan perubahan/Page_One Click Permitting/a_Perubahan'))

WebUI.click(findTestObject('Perizinan/Permohonan/Permohonan perubahan/Page_One Click Permitting/span_company'))

WebUI.setText(findTestObject('Perizinan/Permohonan/Permohonan perubahan/Page_One Click Permitting/input_company'), 'MMS Group Indonesia')

WebUI.sendKeys(findTestObject('Perizinan/Permohonan/Permohonan perubahan/Page_One Click Permitting/input_company'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Perizinan/Permohonan/Permohonan perubahan/Page_One Click Permitting/span_jenis-perizinan-yg-diajukan'))

WebUI.setText(findTestObject('Perizinan/Permohonan/Permohonan perubahan/Page_One Click Permitting/input_company'), '46900')

WebUI.sendKeys(findTestObject('Perizinan/Permohonan/Permohonan perubahan/Page_One Click Permitting/input_company'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Perizinan/Permohonan/Permohonan perubahan/Page_One Click Permitting/input__targetWaktu'), 
    '30/11/2027')

WebUI.setText(findTestObject('Perizinan/Permohonan/Permohonan perubahan/Page_One Click Permitting/textarea_deskripsi'), 
    'Hanya untuk keperluan testing saja')

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Perizinan/Permohonan/Permohonan perubahan/Page_One Click Permitting/i_Ajukan-Perubahan'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

