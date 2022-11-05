import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LogoutStep {
	
	@Given("I navigated into login page")
	def navigateLogin() {
		WebUI.openBrowser('https://alta-shop.vercel.app/')

		WebUI.click(findTestObject('Object Repository/Login/Page_frontend-web/span_AltaShop_v-btn__content'))
	}

	@When("I fill (.*) and (.*)")
	def FillLoginForm(String Email, String Password) {

		WebUI.setText(findTestObject('Login/Page_frontend-web/input_Email_input-1472'), Email)

		WebUI.setText(findTestObject('Login/Page_frontend-web/input_Password_input-1475'), Password)
	}

	@And("I click login button")
	def ClickLogin() {
		WebUI.setText(findTestObject('Object Repository/Login/Page_frontend-web/button_Login'))
	}

	@Then("I navigated to home page")
	def navigatehome() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_frontend-web/div_password is required'), 5)

		WebUI.closeBrowser()
	}
	
	@And("I click the log out button")
	def ClickLogout() {
		WebUI.setText(findTestObject('Object Repository/login/Page_frontend-web/div_Logout'))
	}
	
	@Then("I should be logged out")
	def LogoutNavigated() {
		WebUI.navigateToUrl('https://alta-shop.vercel.app/')

		WebUI.closeBrowser()
	}
	
}