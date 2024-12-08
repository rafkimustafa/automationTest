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

WebUI.callTestCase(findTestCase('TC - TK 004/TC 001 Membuka fitur PIM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Search Employee/inputUsername'))

WebUI.setText(findTestObject('Search Employee/inputUsername'), 'xx231xx')

WebUI.click(findTestObject('Search Employee/inputEmployeeid'))

WebUI.setText(findTestObject('Search Employee/inputEmployeeid'), '060997')

WebUI.click(findTestObject('Search Employee/buttonSearch'))

WebUI.focus(findTestObject('Search Employee/tableEmployee'))

WebUI.verifyElementPresent(findTestObject('Search Employee/toasUsernotfound'), 3)

WebUI.getText(findTestObject('Search Employee/inputUsername'))

WebUI.verifyMatch('rafki mustafa', 'rafki mustafa', false)

WebUI.getText(findTestObject('Search Employee/inputEmployeeid'))

WebUI.verifyMatch('060997', '060997', false)

WebUI.delay(5)

WebUI.closeBrowser()
