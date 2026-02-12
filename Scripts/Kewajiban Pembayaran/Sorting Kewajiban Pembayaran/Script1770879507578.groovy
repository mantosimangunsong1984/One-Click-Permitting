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

WebUI.click(findTestObject('Permintaan Dana/Page_One Click Permiting/span_permintaan-dana'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting_no-tiket'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting_no-tiket'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting-entitas'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting-entitas'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting-Jenis-perizinan'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting-Jenis-perizinan'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting_kode-billing'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting_kode-billing'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting_Nama-Billing'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting_Nama-Billing'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting_Nominal'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting_Nominal'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting_tanggal-permintaan'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting_tanggal-permintaan'))

WebUI.scrollToElement(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting_tanggal-bayar'), 
    3)

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting_tanggal-bayar'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting_tanggal-bayar'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting_status'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting_status'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting_aksi'))

WebUI.click(findTestObject('Permintaan Dana/Sorting Data/Page_One Click Permiting/th_sorting_aksi'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

