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

WebUI.click(findTestObject('Object Repository/student_list-fix/Page_focuspang ai for teacher/div_11-1'))

WebUI.click(findTestObject('Object Repository/student_list-fix/Page_focuspang ai for teacher/div__1_2'))

WebUI.click(findTestObject('Object Repository/student_list-fix/Page_focuspang ai for teacher/button__chakra-button css-1pjbhs7'))

WebUI.click(findTestObject('Object Repository/student_list-fix/Page_focuspang ai for teacher/input__field-r5f'))

WebUI.sendKeys(findTestObject('Object Repository/student_list-fix/Page_focuspang ai for teacher/input__field-r5f'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/student_list-fix/Page_focuspang ai for teacher/input__field-r5f'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/student_list-fix/Page_focuspang ai for teacher/input__field-r5f'), '67890')

WebUI.click(findTestObject('Object Repository/student_list-fix/Page_focuspang ai for teacher/input__field-r1h'))

WebUI.sendKeys(findTestObject('Object Repository/student_list-fix/Page_focuspang ai for teacher/input__field-r1h'), Keys.chord(
	Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/student_list-fix/Page_focuspang ai for teacher/input__field-r1h'), Keys.chord(
	Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/student_list-fix/Page_focuspang ai for teacher/input__field-r1h'), '자동화삭제명단')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/student_list-fix/Page_focuspang ai for teacher/button__1_2_3'))

