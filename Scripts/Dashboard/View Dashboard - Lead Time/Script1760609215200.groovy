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

WebUI.verifyTextPresent('Dashboard', false)

WebUI.scrollToElement(findTestObject('Dashboard 2/Page_One Click Permitting/h6_LEAD TIME  PENGURUSAN IZIN'), 3)

WebUI.click(findTestObject('Dashboard 2/Page_One Click Permitting/h6_LEAD TIME  PENGURUSAN IZIN'))

WebUI.click(findTestObject('Dashboard 2/Page_One Click Permitting/btn_Detail-Lead-Time-Pengurusan-Izin_btn-close'))

WebUI.click(findTestObject('Dashboard 2/Page_One Click Permitting/h6_LEAD TIME  PENGUMPULAN DOKUMEN'))

WebUI.click(findTestObject('Dashboard 2/Page_One Click Permitting/btn_Detail-Lead-Time-PengumpulanDokumen_btn-close'))

WebUI.click(findTestObject('Dashboard 2/Page_One Click Permitting/h6_LEAD TIME  PEMBAYARAN'))

WebUI.click(findTestObject('Dashboard 2/Page_One Click Permitting/btn_Detail-Lead-Time -Pembayaran_btn-close'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

