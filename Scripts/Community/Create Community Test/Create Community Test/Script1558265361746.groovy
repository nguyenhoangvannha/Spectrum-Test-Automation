import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testdata.CSVData

WebUI.callTestCase(findTestCase('SignUp Test/SignIn'), [:], FailureHandling.STOP_ON_FAILURE)

CSVData data = findTestData("csv/Create_Community_Data")

for (def index : (0.. data.getRowNumbers() - 1)) {
	WebUI.click(findTestObject('Object Repository/a_exploreExplore'))
	
	WebUI.click(findTestObject('Object Repository/button_Create a community'))
	
	WebUI.setText(findTestObject('Object Repository/input_What is your community called_style__StyledInput-sc-17zryot-2 jHXlSy'),
		data.internallyGetValue("Name", index))
	
	WebUI.setText(findTestObject('Object Repository/textarea_Describe it in 140 characters or less_style__StyledTextArea-sc-17zryot-3 hSQZHk'),
		data.internallyGetValue("Describe", index))
	
	WebUI.setText(findTestObject('Object Repository/input_Optional Add your communitys website_style__StyledInput-sc-17zryot-2 jHXlSy'),
		data.internallyGetValue("Website", index))
	
	WebUI.click(findTestObject('Object Repository/div_checkboxI have read the Spectrum Code of Conduct and agree to enforce it in my community'))
	
	WebUI.click(findTestObject('Object Repository/button_Create Community  Continue'))
	
	WebUI.click(findTestObject('Object Repository/button_Skip this step'))
	
	WebUI.click(findTestObject('Object Repository/button_Go to my community'))
}
