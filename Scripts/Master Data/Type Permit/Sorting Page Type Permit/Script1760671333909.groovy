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

WebUI.click(findTestObject('Master Data/Category Permit/Page_One Click Permiting/Page_One Click Permiting/span_Master-Data'))

WebUI.click(findTestObject('Master Data/Type Permit/Page_One Click Permiting/a_Type-Permit'))

WebUI.click(findTestObject('Master Data/Type Permit/Sorting/Page_One Click Permiting/th_sorting_type-permit-name'))

WebUI.click(findTestObject('Master Data/Type Permit/Sorting/Page_One Click Permiting/th_sorting_type-permit-name'))

WebUI.click(findTestObject('Master Data/Type Permit/Sorting/Page_One Click Permiting/th_sorting-TypePermit-Desc'))

WebUI.click(findTestObject('Master Data/Type Permit/Sorting/Page_One Click Permiting/th_sorting-TypePermit-Desc'))

WebUI.click(findTestObject('Master Data/Type Permit/Sorting/Page_One Click Permiting/th_sorting_category-permit'))

WebUI.click(findTestObject('Master Data/Type Permit/Sorting/Page_One Click Permiting/th_sorting_category-permit'))

WebUI.click(findTestObject('Master Data/Type Permit/Sorting/Page_One Click Permiting/th_sorting-KBLI'))

WebUI.click(findTestObject('Master Data/Type Permit/Sorting/Page_One Click Permiting/th_sorting-KBLI'))

WebUI.click(findTestObject('Master Data/Type Permit/Sorting/Page_One Click Permiting/th_sorting-status'))

WebUI.click(findTestObject('Master Data/Type Permit/Sorting/Page_One Click Permiting/th_sorting-status'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

