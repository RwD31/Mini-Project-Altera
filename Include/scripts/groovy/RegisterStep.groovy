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

class RegisterStep {

	@Given("I navigated into register page")
	def navigateRegister() {
		WebUI.openBrowser('https://alta-shop.vercel.app/')

		WebUI.click(findTestObject('Object Repository/Register/RG_1/i_AltaShop_v-icon notranslate fas fa-sign-i_3d16a9'))

		WebUI.click(findTestObject('Object Repository/Register/RG_1/a_Register'))
	}

	@When("I fill (.*) , (.*) and (.*)")
	def FillRegisterForm(String Fullname, String Email, String Password) {
		WebUI.setText(findTestObject('Object Repository/Register/Page_frontend-web/input_Nama Lengkap_input-1486'), Fullname)

		WebUI.setText(findTestObject('Object Repository/Register/Page_frontend-web/input_Email_input-1489'), Email)

		WebUI.setText(findTestObject('Object Repository/Register/Page_frontend-web/input_Password_input-1492'), Password)
	}

	@And("I click register button")
	def ClickRegister() {
		WebUI.setText(findTestObject('Object Repository/Register/Page_frontend-web/button_Register'))
	}

	@Then("I navigated to login page")
	def navigateLogin() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Register/RG_2/div_Register_v-alert__wrapper'),	5)

		WebUI.closeBrowser()
	}
}