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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.Toolkit as Toolkit

WebUI.callTestCase(findTestCase('TC - LW 002/TC 001 Login berhasil'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PIM/buttonMenupim'))

WebUI.verifyElementPresent(findTestObject('Dashboard/textDashboard'), 0)

WebUI.click(findTestObject('PIM/addButton'))

WebUI.click(findTestObject('PIM/inputFirstname'))

WebUI.setText(findTestObject('PIM/inputFirstname'), 'Rafki')

WebUI.click(findTestObject('PIM/inputMiddlename'))

WebUI.setText(findTestObject('PIM/inputMiddlename'), 'Mustafa')

WebUI.click(findTestObject('PIM/inputLastname'))

WebUI.setText(findTestObject('PIM/inputLastname'), 'Abdullah Kafi')

WebUI.click(findTestObject('PIM/inputEmployeeid'))

WebUI.sendKeys(findTestObject('PIM/inputEmployeeid'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('PIM/inputEmployeeid'), '6234238')

WebUI.click(findTestObject('PIM/addImage'))

// File path yang akan diunggah
String filePath = 'C:\\Users\\rafki\\git\\automationTest\\Screenshots\\test_doc.docx'

// Salin file path ke clipboard
StringSelection filePathSelection = new StringSelection(filePath)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePathSelection, null)

// Simulasikan dialog Windows
Robot robot = new Robot()

Thread.sleep(2000 // Tunggu dialog terbuka
    )

// Tekan Ctrl+V untuk menempelkan file path
robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_CONTROL)

// Tekan Enter untuk memilih file
robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('PIM/textFilenotallowed'), 0)

WebUI.delay(2)

WebUI.closeBrowser()

