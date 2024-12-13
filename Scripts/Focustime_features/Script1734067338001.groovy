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

WebUI.callTestCase(findTestCase('focustime_start'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Focustime_features/Page_focuspang ai for teacher/button__chakra-button css-138310v'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Focustime_features/Page_focuspang ai for teacher/button__chakra-button css-138310v_1_2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Focustime_features/Page_focuspang ai for teacher/button__chakra-button css-10742wj'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Focustime_features/Page_focuspang ai for teacher/button__chakra-button css-138310v_1_2_3'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Focustime_features/Page_focuspang ai for teacher/button__1_2_3_4'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Focustime_features/Page_focuspang ai for teacher/button_Quit'))
