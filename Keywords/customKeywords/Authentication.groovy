package customKeywords

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository

public class Authentication {

	@Keyword
	def login(String username, String encryptedPassword) {
		WebUI.openBrowser('')
		WebUI.delay(2)
		WebUI.navigateToUrl('https://qa.teacher.focuspang.ai/ko/login')
		WebUI.delay(2)
		WebUI.click(ObjectRepository.findTestObject('Object Repository/Page_focuspang ai for teacher/span_Android_chakra-checkbox__control css-1dc7bm0'))
		WebUI.click(ObjectRepository.findTestObject('Object Repository/Page_focuspang ai for teacher/button_'))
		WebUI.click(ObjectRepository.findTestObject('Object Repository/Page_focuspang ai for teacher/span__chakra-checkbox__control css-1dc7bm0'))
		WebUI.click(ObjectRepository.findTestObject('Object Repository/Page_focuspang ai for teacher/button__1'))
		WebUI.setText(ObjectRepository.findTestObject('Object Repository/Page_focuspang ai for teacher/input__id'), username)
		WebUI.setEncryptedText(ObjectRepository.findTestObject('Object Repository/Page_focuspang ai for teacher/input__password'), encryptedPassword)
		WebUI.click(ObjectRepository.findTestObject('Object Repository/Page_focuspang ai for teacher/button__1_2'))
	}
}
