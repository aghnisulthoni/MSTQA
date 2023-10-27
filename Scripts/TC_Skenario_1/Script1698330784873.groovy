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

Mobile.startApplication('/Users/aghni/Downloads/mst-qa-0.0.1.apk', true)

Mobile.tap(findTestObject('Object Repository/mst/login/inputUsername'), 0)

Mobile.sendKeys(findTestObject('mst/login/inputUsername'), Username)

Mobile.tap(findTestObject('Object Repository/mst/login/inputPassword'), 0)

Mobile.sendKeys(findTestObject('mst/login/inputPassword'), Password)

Mobile.tap(findTestObject('Object Repository/mst/login/buttonLogin'), 0)

Mobile.verifyElementVisible(findTestObject('mst/logout/buttonLogout'), 0)

Mobile.tap(findTestObject('mst/logout/buttonLogout'), 0)

Mobile.waitForElementPresent(findTestObject('mst/login/inputUsername'), 1)

Mobile.closeApplication()

