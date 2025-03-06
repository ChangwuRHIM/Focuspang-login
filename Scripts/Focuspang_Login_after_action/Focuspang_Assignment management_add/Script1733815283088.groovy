import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

// 로그인 테스트 케이스 호출
WebUI.callTestCase(findTestCase('Teacher loin,logout/Focuspang_teacher_login'), [:], FailureHandling.STOP_ON_FAILURE)

// 페이지 클릭 이벤트
WebUI.click(findTestObject('Assignment_add/Page_focuspang ai for teacher/div_ (1)'))

WebUI.click(findTestObject('Object Repository/Assignment_add/Page_focuspang ai for teacher/assignment_management_button'))

WebUI.delay(3)

WebUI.click(findTestObject('Assignment_add/Page_focuspang ai for teacher/assignment_add_button'))

WebUI.click(findTestObject('18/Page_focuspang ai for teacher/div_Back'), FailureHandling.STOP_ON_FAILURE)

// 과제 제목 및 설명 입력
WebUI.setText(findTestObject('Object Repository/Assignment_add/Page_focuspang ai for teacher/input__field-r4g (1)'), '과제테스트')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assignment_add/Page_focuspang ai for teacher/p'))

WebUI.setText(findTestObject('Object Repository/Assignment_add/Page_focuspang ai for teacher/p'), '테스트')

WebUI.delay(3)

// 날짜 및 시간 입력 필드 처리
WebDriver driver = DriverFactory.getWebDriver()

WebElement dateInputElement = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Assignment_add/Page_focuspang ai for teacher/submitAt_input'), 
    10)

Actions actions = new Actions(driver)

// '2030-12-10 16:45' 입력을 TAB으로 이동하며 처리
actions.click(dateInputElement).sendKeys('2030').perform()

WebUI.delay(1)

actions.sendKeys(Keys.TAB).perform()

actions.sendKeys('12102').perform()

WebUI.delay(1)

actions.sendKeys(Keys.TAB).perform()

actions.sendKeys('0445').perform()

WebUI.delay(1)

actions.sendKeys(Keys.TAB).perform()

WebUI.delay(2)

// 필드 blur 처리
WebUI.executeJavaScript('document.querySelector("input[type=\'datetime-local\']").blur();', null)

WebUI.delay(3)

// 과제 추가 버튼 클릭
WebUI.waitForElementClickable(findTestObject('Object Repository/Assignment_add/Page_focuspang ai for teacher/button__1_2_3_4 (1)'), 
    10)

WebUI.click(findTestObject('Object Repository/Assignment_add/Page_focuspang ai for teacher/button__1_2_3_4 (1)'))

WebUI.delay(2)

