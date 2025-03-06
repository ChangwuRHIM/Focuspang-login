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

WebUI.navigateToUrl('https://qa.teacher.focuspang.ai/ko/login')

WebUI.click(findTestObject('Object Repository/check/Page_focuspang ai for teacher/span__chakra-checkbox__control css-1dc7bm0'))

WebUI.click(findTestObject('Object Repository/check/Page_focuspang ai for teacher/button_'))

WebUI.click(findTestObject('Object Repository/check/Page_focuspang ai for teacher/span__chakra-checkbox__control css-1dc7bm0_1'))

WebUI.click(findTestObject('Object Repository/check/Page_focuspang ai for teacher/button__1'))

WebUI.click(findTestObject('Object Repository/check/Page_focuspang ai for teacher/span_Android_chakra-checkbox__control css-1dc7bm0'))

WebUI.click(findTestObject('Object Repository/check/Page_focuspang ai for teacher/button__1_2'))

WebUI.click(findTestObject('Object Repository/check/Page_focuspang ai for teacher/span__chakra-checkbox__control css-1dc7bm0_1_2'))

WebUI.click(findTestObject('Object Repository/check/Page_focuspang ai for teacher/button__1_2_3'))

WebUI.setText(findTestObject('Object Repository/check/Page_focuspang ai for teacher/input__id'), 'changwu_rhim@focuspang.com')

WebUI.setEncryptedText(findTestObject('Object Repository/check/Page_focuspang ai for teacher/input__password'), 'MpEqHZHV+RM=')

WebUI.click(findTestObject('Object Repository/check/Page_focuspang ai for teacher/button__1_2_3_4'))

