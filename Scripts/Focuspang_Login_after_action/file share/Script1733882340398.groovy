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
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection

// 로그인 테스트 케이스 호출
WebUI.callTestCase(findTestCase('Teacher loin,logout/Focuspang_teacher_login'), [:], FailureHandling.STOP_ON_FAILURE)

// 페이지 내 링크 및 파일 공유 작업
WebUI.click(findTestObject('Object Repository/Link,File_share/Page_focuspang ai for teacher/monday_1class'))

WebUI.click(findTestObject('Object Repository/Link,File_share/Page_focuspang ai for teacher/focustime_button'))

WebUI.click(findTestObject('Object Repository/Link,File_share/Page_focuspang ai for teacher/student_filelink_dropdown_button'))

WebUI.click(findTestObject('Object Repository/Link,File_share/Page_focuspang ai for teacher/share_url_input__button'))

WebUI.setText(findTestObject('Object Repository/Link,File_share/Page_focuspang ai for teacher/link_url_button'), 'www.naver.com')

WebUI.setText(findTestObject('Object Repository/Link,File_share/Page_focuspang ai for teacher/link_title_button'), '네이버')

WebUI.click(findTestObject('Object Repository/Link,File_share/Page_focuspang ai for teacher/Link_share_button'))

// 파일 탭 및 파일 공유 버튼 클릭
WebUI.click(findTestObject('Object Repository/Link,File_share/Page_focuspang ai for teacher/File_tab_button'))

WebUI.click(findTestObject('Object Repository/Link,File_share/Page_focuspang ai for teacher/file_share_button'))

WebUI.delay(2)

// 파일 경로 설정 및 클립보드 복사
String filePath = 'C:\\Users\\USER\\Desktop\\업무\\test.png'

StringSelection selection = new StringSelection(filePath)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null)

// Robot 클래스를 사용하여 키보드 입력 실행
Robot robot = new Robot()

// Ctrl + V (경로 붙여넣기)
robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_CONTROL)

// Enter 키 입력 (파일 선택)
robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

// 업로드 후 잠시 대기
WebUI.delay(2)

