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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.student.focuspang.ai/login')

WebUI.click(findTestObject('Object Repository/Page_focuspang ai student/button_'))

WebUI.setText(findTestObject('Object Repository/Page_focuspang ai student/input_concat(id(, , pin-input-r4-0, , ))_pi_29be13'), 
    '7')

WebUI.setText(findTestObject('Object Repository/Page_focuspang ai student/input_concat(id(, , pin-input-r4-1, , ))_pi_f4fde3'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_focuspang ai student/input_concat(id(, , pin-input-r4-2, , ))_pi_2ee6b2'), 
    'e')

WebUI.setText(findTestObject('Object Repository/Page_focuspang ai student/input_concat(id(, , pin-input-r4-3, , ))_pi_696240'), 
    'a')

WebUI.setText(findTestObject('Object Repository/Page_focuspang ai student/input_concat(id(, , pin-input-r4-4, , ))_pi_f6ecbc'), 
    '8')

WebUI.setText(findTestObject('Object Repository/Page_focuspang ai student/input_concat(id(, , pin-input-r4-5, , ))_pi_d79f4b'), 
    'c')

WebUI.setText(findTestObject('Object Repository/Page_focuspang ai student/input_concat(id(, , pin-input-r4-6, , ))_pi_56b678'), 
    '7')

WebUI.setText(findTestObject('Object Repository/Page_focuspang ai student/input_concat(id(, , pin-input-r4-7, , ))_pi_21b65d'), 
    '1')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_focuspang ai student/button__1'))

WebUI.setText(findTestObject('Object Repository/Page_focuspang ai student/input__studentNumber'), '09876')

WebUI.setText(findTestObject('Object Repository/Page_focuspang ai student/input__studentName'), '자동화')

WebUI.click(findTestObject('Object Repository/Page_focuspang ai student/button__1_2'))

