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

WebUI.click(findTestObject('Perizinan/Permohonan/Permohonan Baru 2/Page_One Click Permitting/a_Baru'))

WebUI.click(findTestObject('Perizinan/Permohonan/Permohonan Baru 2/Page_One Click Permitting/b_Pilih-Company_Perm-Baru'))

WebUI.setText(findTestObject('Perizinan/Permohonan/Permohonan Baru 2/Page_One Click Permitting/input_Pilih-Company_Perm-Baru'), 
    'MMS')

WebUI.sendKeys(findTestObject('Perizinan/Permohonan/Permohonan Baru 2/Page_One Click Permitting/input_Pilih-Company_Perm-Baru'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Perizinan/Permohonan/Permohonan Baru 2/Page_One Click Permitting/b_JenisPerizinanYgDiajukan-Perm-Baru'))

WebUI.setText(findTestObject('Perizinan/Permohonan/Permohonan Baru 2/Page_One Click Permitting/input_Pilih-Company_Perm-Baru'), 
    '46900')

WebUI.sendKeys(findTestObject('Perizinan/Permohonan/Permohonan Baru 2/Page_One Click Permitting/input_Pilih-Company_Perm-Baru'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Perizinan/Permohonan/Permohonan Baru 2/Page_One Click Permitting/input_permittargettime'), 
    '30/11/2026')

WebUI.setText(findTestObject('Perizinan/Permohonan/Permohonan Baru 2/Page_One Click Permitting/textarea_permitdesc'), 'Hanya untuk keperluan testing 123')

WebUI.takeFullPageScreenshot()

not_run: WebUI.click(findTestObject('Perizinan/Permohonan/Permohonan Baru 2/Page_One Click Permitting/i_Ajukan-Permohonan'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.closeBrowser()

