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
import java.awt.event.InputEvent as InputEvent

// 기존 테스트 케이스 실행
WebUI.callTestCase(findTestCase('focustime_start'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/focustime_pen/Page_focuspang ai for teacher/Ffocus_pen_button'))

// 디지털 칠판 요소를 위한 새로운 TestObject 정의
TestObject canvasArea = new TestObject()

canvasArea.addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'react-sketch-canvas-teacher__canvas-background-group')

// 디지털 칠판 요소 대기 및 확인
if (WebUI.waitForElementVisible(canvasArea, 60)) {
    WebUI.comment('디지털 칠판 요소가 성공적으로 로드되었습니다.')

    // 디지털 칠판 영역 클릭 (초기화)
    WebUI.click(canvasArea)

    // Robot 클래스 초기화 (마우스 드래그 동작)
    Robot robot = new Robot()

    // 좌표 리스트
    int[][] coordinates = [
        [1051, 525], 
        [878, 867], 
        [1154, 644], 
        [816, 620], 
        [1087, 834], 
        [1058, 529]
    ]

    // 시작점 좌표로 이동
    robot.mouseMove(coordinates[0][0], coordinates[0][1])

    // 마우스 누르기 (왼쪽 버튼)
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK)

    // 좌표를 따라 마우스 드래그 동작
    for (int i = 1; i < coordinates.length; i++) {
        robot.mouseMove(coordinates[i][0], coordinates[i][1])
        Thread.sleep(50) // 이동 속도 조절 (50ms)
    }
    
    // 마우스 떼기 (왼쪽 버튼)
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK)

    // 완료 대기 시간 추가
    WebUI.delay(2)
} else {
    WebUI.comment('디지털 칠판 요소를 찾을 수 없습니다. 테스트를 종료합니다.')
    assert false : '디지털 칠판 요소 로드 실패'
}

WebUI.waitForElementClickable(findTestObject('Object Repository/focustime_start_end/Page_focuspang ai for teacher/button_Quit'), 5)

WebUI.click(findTestObject('Object Repository/focustime_start_end/Page_focuspang ai for teacher/button_Quit'))

WebUI.delay(3)
