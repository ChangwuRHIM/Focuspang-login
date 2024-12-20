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

// 랜덤 문자열 생성 함수
// 1~100 사이의 랜덤 숫자
// 랜덤 문자열 생성
String randomText = generateRandomText()

// 디버깅용: 생성된 문자열 출력
println('랜덤 입력 값: ' + randomText)

// 기존 동작 유지
WebUI.callTestCase(findTestCase('Teacher loin,logout/Focuspang_teacher_login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/teacher_name_change/Page_focuspang ai for teacher/button__chakra-button css-2kj2c2'))

WebUI.click(findTestObject('Object Repository/teacher_name_change/Page_focuspang ai for teacher/input__field-r3l'))

WebUI.sendKeys(findTestObject('Object Repository/teacher_name_change/Page_focuspang ai for teacher/input__field-r3l'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/teacher_name_change/Page_focuspang ai for teacher/input__field-r3l'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.delay(2)

// 랜덤 문자열을 입력 필드에 설정
WebUI.setText(findTestObject('Object Repository/teacher_name_change/Page_focuspang ai for teacher/input__field-r3l'), randomText)

WebUI.click(findTestObject('Object Repository/teacher_name_change/Page_focuspang ai for teacher/button__1_2_3'))

WebUI.delay(2)

WebUI.acceptAlert()

String generateRandomText() {
    return '자동화' + (new Random().nextInt(100) + 1)
}

