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

WebUI.click(findTestObject('Perizinan/Informasi Umum/Page_One Click Permiting/a_Informasi-umum'))

WebUI.verifyTextPresent('Informasi Umum', false)

WebUI.click(findTestObject('Perizinan/Informasi Umum/sorting/Page_One Click Permiting/th_sorting_nama-entitas'))

WebUI.click(findTestObject('Perizinan/Informasi Umum/sorting/Page_One Click Permiting/th_sorting_nama-entitas'))

WebUI.click(findTestObject('Perizinan/Informasi Umum/sorting/Page_One Click Permiting/th_sorting_nama-perizinan'))

WebUI.click(findTestObject('Perizinan/Informasi Umum/sorting/Page_One Click Permiting/th_sorting_nama-perizinan'))

WebUI.click(findTestObject('Perizinan/Informasi Umum/sorting/Page_One Click Permiting/th_sorting_nomor-Perizinan'))

WebUI.click(findTestObject('Perizinan/Informasi Umum/sorting/Page_One Click Permiting/th_sorting_nomor-Perizinan'))

WebUI.click(findTestObject('Perizinan/Informasi Umum/sorting/Page_One Click Permiting/th_sorting_tanggal-penerbit'))

WebUI.click(findTestObject('Perizinan/Informasi Umum/sorting/Page_One Click Permiting/th_sorting_tanggal-penerbit'))

WebUI.click(findTestObject('Perizinan/Informasi Umum/sorting/Page_One Click Permiting/th_sorting_masa-berlaku'))

WebUI.click(findTestObject('Perizinan/Informasi Umum/sorting/Page_One Click Permiting/th_sorting_masa-berlaku'))

WebUI.click(findTestObject('Perizinan/Informasi Umum/sorting/Page_One Click Permiting/th_sorting_instansi-penerbit'))

WebUI.click(findTestObject('Perizinan/Informasi Umum/sorting/Page_One Click Permiting/th_sorting_instansi-penerbit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

