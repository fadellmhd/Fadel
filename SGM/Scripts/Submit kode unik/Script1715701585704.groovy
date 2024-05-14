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

WebUI.openBrowser('https://generasi.eydendigital.co.id/klub-generasi-maju/submit-kode-unik')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('Submit kode unik/X'))

WebUI.click(findTestObject('Submit kode unik/Button cookie SAYA SETUJU'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Submit kode unik/Input No. Handphone'), '085784018007')

WebUI.scrollToElement(findTestObject('Submit kode unik/Input No. Handphone'), 0)

WebUI.verifyElementVisible(findTestObject('Submit kode unik/Input Kode Unik kotak(1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Submit kode unik/Input Kode Unik kotak(2)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Submit kode unik/Input Kode Unik kotak(3)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Submit kode unik/Input Kode Unik kotak(4)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Submit kode unik/Input Kode Unik kotak(5)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Submit kode unik/Input Kode Unik kotak(6)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Submit kode unik/Input Kode Unik kotak(7)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Submit kode unik/Input Kode Unik kotak(8)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Submit kode unik/Input Kode Unik kotak(9)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Submit kode unik/Input Kode Unik kotak(10)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Submit kode unik/Input Kode Voucher'))

WebUI.verifyElementVisible(findTestObject('Submit kode unik/button_Lanjut'))

WebUI.doubleClick(findTestObject('Submit kode unik/Dropdown ASI TERBAIK BAGI BAYI'))

WebUI.scrollToElement(findTestObject('Submit kode unik/Button Kembali Ke Atas'), 0)

WebUI.click(findTestObject('Submit kode unik/Button Kembali Ke Atas'))

