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

WebUI.callTestCase(findTestCase('Teacher loin,logout/Focuspang_teacher_login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/quiz_make/Page_focuspang ai for teacher/quizmanagement'))

WebUI.click(findTestObject('Object Repository/quiz_make/Page_focuspang ai for teacher/create_quiz_set_button'))

WebUI.click(findTestObject('Object Repository/quiz_make/Page_focuspang ai for teacher/quizset_card_QUIZ'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/quiz_make/Page_focuspang ai for teacher/quiz_header_input_filed'), '자동화')

WebUI.click(findTestObject('Object Repository/quiz_make/Page_focuspang ai for teacher/p'))

WebUI.setText(findTestObject('Object Repository/quiz_make/Page_focuspang ai for teacher/p'), '자동화테스트')

WebUI.click(findTestObject('Object Repository/quiz_make/Page_focuspang ai for teacher/quiz_save_button'))

WebUI.delay(2)

