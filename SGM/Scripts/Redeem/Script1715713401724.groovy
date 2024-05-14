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

WebUI.openBrowser('https://generasi.eydendigital.co.id/klub-generasi-maju/login')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('Submit kode unik/X'))

WebUI.click(findTestObject('Submit kode unik/Button cookie SAYA SETUJU'))

WebUI.setText(findTestObject('Redeem/Input Nomor Handphone'), '085784018007')

WebUI.setEncryptedText(findTestObject('Redeem/Input Password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Redeem/Hiding Password'))

WebUI.click(findTestObject('Redeem/Button Masuk'))

WebUI.click(findTestObject('Redeem/Button_XLengkapiProfile'))

WebUI.focus(findTestObject('Redeem/Button Selengkapnya'))

WebUI.click(findTestObject('Redeem/Button Selengkapnya'))

WebUI.focus(findTestObject('Redeem/Button Tukar Poin'))

WebUI.click(findTestObject('Redeem/Button Tukar Poin'))

WebUI.doubleClick(findTestObject('Redeem/Dropdown Deskripsi Produk'))

WebUI.focus(findTestObject('Redeem/Button TukarPoin'))

WebUI.setText(findTestObject('Redeem/Input Alamat'), 'Alamat Saya Disini')

WebUI.selectOptionByValue(findTestObject('Redeem/Select Provinsi'), 'Ng==', true)

WebUI.selectOptionByValue(findTestObject('Redeem/Select KabupatenKota'), 'Mzg=', true)

WebUI.selectOptionByValue(findTestObject('Redeem/Select Kecamatan'), 'MTI5ODA=', true)

WebUI.selectOptionByValue(findTestObject('Redeem/Select Kelurahan'), 'NDQ0Nw==', true)

WebUI.click(findTestObject('Redeem/Button TukarPoin'))

WebUI.verifyElementVisible(findTestObject('Redeem/Popup notifikasi'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Redeem/Button_XNotifikasi'))

WebUI.back()

WebUI.click(findTestObject('Redeem/Button Kembali ke Halaman Bunda'))

WebUI.click(findTestObject('Redeem/Button Profile'))

WebUI.click(findTestObject('Redeem/Button Keluar'))

WebUI.verifyElementVisible(findTestObject('Redeem/Popup informasi'))

WebUI.click(findTestObject('Redeem/Button Oke, Saya Mengerti'))

