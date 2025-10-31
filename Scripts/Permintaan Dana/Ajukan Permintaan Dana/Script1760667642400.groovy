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

WebUI.verifyTextPresent('Permintaan Dana', false)

WebUI.click(findTestObject('Permintaan Dana/Ajukan Permintaan Dana/Page_One Click Permiting/button_Ajukan-permintaan-dana'))

WebUI.click(findTestObject('Permintaan Dana/Ajukan Permintaan Dana/Page_One Click Permiting/span_Entitas'))

WebUI.setText(findTestObject('Permintaan Dana/Ajukan Permintaan Dana/Page_One Click Permiting/input_Entitas'), 'MHU Coal')

WebUI.sendKeys(findTestObject('Permintaan Dana/Ajukan Permintaan Dana/Page_One Click Permiting/input_Entitas'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Permintaan Dana/Ajukan Permintaan Dana/Page_One Click Permiting/span_Izin'))

WebUI.setText(findTestObject('Permintaan Dana/Ajukan Permintaan Dana/Page_One Click Permiting/input_Izin'), 'P2025100012')

WebUI.sendKeys(findTestObject('Permintaan Dana/Ajukan Permintaan Dana/Page_One Click Permiting/input_Izin'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Permintaan Dana/Ajukan Permintaan Dana/Page_One Click Permiting/input_Kode-Billing'), 'TEST0002XXX')

WebUI.setText(findTestObject('Permintaan Dana/Ajukan Permintaan Dana/Page_One Click Permiting/input_Nama-Billing'), 'Testing Pembayaran 2')

WebUI.setText(findTestObject('Permintaan Dana/Ajukan Permintaan Dana/Page_One Click Permiting/input_Nominal'), '7000000')

WebUI.setText(findTestObject('Permintaan Dana/Ajukan Permintaan Dana/Page_One Click Permiting/input_TanggalJatuhTempo'), 
    '30/12/2025')

WebUI.setText(findTestObject('Permintaan Dana/Ajukan Permintaan Dana/Page_One Click Permiting/input_Upload-BuktiKodeBilling'), 
    'C:\\\\Users\\\\manto.manto\\\\Downloads\\\\MekanismeCheckinCheckOut.docx')

WebUI.setText(findTestObject('Permintaan Dana/Ajukan Permintaan Dana/Page_One Click Permiting/input_nama-dok-pendukung'), 
    'Dok Testing Pendukung')

WebUI.setText(findTestObject('Permintaan Dana/Ajukan Permintaan Dana/Page_One Click Permiting/input_Upload-Dok-pendukung'), 
    'C:\\\\Users\\\\manto.manto\\\\Downloads\\\\MekanismeCheckinCheckOut.docx')

WebUI.setText(findTestObject('Permintaan Dana/Ajukan Permintaan Dana/Page_One Click Permiting/textarea_Keterangan'), 'Untuk kebutuhan testing saja')

WebUI.click(findTestObject('Permintaan Dana/Ajukan Permintaan Dana/Page_One Click Permiting/button_KIRIM'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

