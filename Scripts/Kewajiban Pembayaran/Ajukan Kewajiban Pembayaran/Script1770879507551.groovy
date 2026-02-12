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

WebUI.click(findTestObject('Kewajiban Pembayaran/Page_One Click Permitting/button_Ajukan Kewajiban Pembayaran'))

WebUI.click(findTestObject('Kewajiban Pembayaran/Page_One Click Permitting/b_Entitas'))

WebUI.setText(findTestObject('Kewajiban Pembayaran/Page_One Click Permitting/input_search_entitas'), 'MMS')

WebUI.sendKeys(findTestObject('Kewajiban Pembayaran/Page_One Click Permitting/input_search_entitas'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Kewajiban Pembayaran/Page_One Click Permitting/b_Izin'))

WebUI.setText(findTestObject('Kewajiban Pembayaran/Page_One Click Permitting/input_search_entitas'), 'P2025120002')

WebUI.sendKeys(findTestObject('Kewajiban Pembayaran/Page_One Click Permitting/input_search_entitas'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Kewajiban Pembayaran/Page_One Click Permitting/input_Kode Billing_permitfundscodebilling'), 
    'TEST0002XXX')

WebUI.setText(findTestObject('Kewajiban Pembayaran/Page_One Click Permitting/input_Nama Billing_permitfundsnamebilling'), 
    'Testing Pembayaran 2')

WebUI.setText(findTestObject('Kewajiban Pembayaran/Page_One Click Permitting/input_Nominal_permitfundstotal'), '7000000')

WebUI.setText(findTestObject('Kewajiban Pembayaran/Page_One Click Permitting/input_Tanggal Jatuh Tempo'), '30/12/2025')

WebUI.setText(findTestObject('Kewajiban Pembayaran/Page_One Click Permitting/input_Bukti Kode Billing'), 'C:\\\\Users\\\\manto.manto\\\\Downloads\\\\Absensi SIT LMS.docx')

WebUI.setText(findTestObject('Kewajiban Pembayaran/Page_One Click Permitting/input_(Opsional)_nama_dokumen'), 'Dok Testing Pendukung')

WebUI.setText(findTestObject('Kewajiban Pembayaran/Page_One Click Permitting/input_(Opsional)_file_dokumen'), 'C:\\\\Users\\\\manto.manto\\\\Downloads\\\\Absensi SIT LMS.docx')

WebUI.setText(findTestObject('Kewajiban Pembayaran/Page_One Click Permitting/textarea_Keterangan_permitfundsdesc'), 'Untuk kebutuhan testing saja')

WebUI.click(findTestObject('Kewajiban Pembayaran/Page_One Click Permitting/button_Kirim'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

