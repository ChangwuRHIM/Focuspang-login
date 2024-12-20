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

WebUI.callTestCase(findTestCase('Teacher loin,logout/Focuspang_teacher_login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/info_image_fix/Page_focuspang ai for teacher/info_setting_button'))

WebUI.click(findTestObject('Object Repository/info_image_fix/Page_focuspang ai for teacher/profile_image'))

WebUI.click(findTestObject('Object Repository/info_image_fix/Page_focuspang ai for teacher/image_import_button'))

WebUI.delay(2 // 파일 탐색기 로딩 시간 확보
    )

// 파일 경로 설정
String filePath = 'C:\\Users\\USER\\Desktop\\업무\\test.png'

// 파일 경로를 클립보드에 복사
StringSelection selection = new StringSelection(filePath)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null)

// Robot 클래스를 사용하여 키보드 이벤트 실행
Robot robot = new Robot()

// Ctrl + V (파일 경로 붙여넣기)
robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_CONTROL)

// Enter 키 입력 (파일 열기)
robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.delay(2 // 파일 업로드 처리 시간 확보
    )

WebUI.click(findTestObject('Object Repository/info_image_fix/Page_focuspang ai for teacher/button__1_2_3'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.delay(2)

