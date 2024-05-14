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

WebUI.openBrowser('https://generasi.eydendigital.co.id/klub-generasi-maju/register')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('Submit kode unik/X'))

WebUI.click(findTestObject('Submit kode unik/Button cookie SAYA SETUJU'))

WebUI.setText(findTestObject('Register/Input Nama Lengkap'), 'Sarah Nur Azizah')

WebUI.setText(findTestObject('Register/Input Nomor Ponsel'), '085784018007')

WebUI.scrollToElement(findTestObject('Register/Input Nomor Ponsel'), 0)

WebUI.setEncryptedText(findTestObject('Register/Input Password'), '3nNXWIp0P+s=')

WebUI.click(findTestObject('Register/Hiding Password'))

WebUI.delay(5)

WebUI.verifyTextPresent('Silahkan ikuti pengisian password sesuai ketentuan di bawah ini', true)

WebUI.clearText(findTestObject('Register/Input Password'))

WebUI.setEncryptedText(findTestObject('Register/Input Password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.verifyTextNotPresent('Silahkan ikuti pengisian password sesuai ketentuan di bawah ini', true)

WebUI.click(findTestObject('Register/Dropdown Kondisi Bunda'))

WebUI.click(findTestObject('Register/Value Sedang Hamil'))

WebUI.click(findTestObject('Register/Dropdown Usia kehamilan bunda'))

WebUI.sendKeys(findTestObject('Register/Text Usia kehamilan bunda'), Keys.chord('12', Keys.ENTER))

WebUI.click(findTestObject('Register/Pointer kode refferal'))

WebUI.click(findTestObject('Register/Pointer kode event'))

WebUI.verifyElementVisible(findTestObject('Register/Input Kode Referal (opsional)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Register/Input Kode Event (opsional)'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Register/Pointer kode event'), 0)

WebUI.click(findTestObject('Register/Check box saya telah membaca ___'))

WebUI.verifyElementClickable(findTestObject('Register/Button Daftar'))

WebUI.verifyElementClickable(findTestObject('Register/Button Masuk'))

WebUI.doubleClick(findTestObject('Submit kode unik/Dropdown ASI TERBAIK BAGI BAYI'))

WebUI.scrollToElement(findTestObject('Submit kode unik/Button Kembali Ke Atas'), 0)

WebUI.click(findTestObject('Submit kode unik/Button Kembali Ke Atas'))

