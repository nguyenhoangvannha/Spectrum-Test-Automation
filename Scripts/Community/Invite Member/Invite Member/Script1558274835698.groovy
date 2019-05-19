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
import com.kms.katalon.core.testdata.CSVData as CSVData

WebUI.callTestCase(findTestCase('SignUp Test/SignIn'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://localhost:3000/community01?tab=posts')

WebUI.click(findTestObject('button_Settings'))

WebUI.click(findTestObject('div_Members'))

CSVData data = findTestData("csv/Invite_Data")

for (def index : (0.. data.getRowNumbers() - 1)) {
	WebUI.setText(findTestObject('input_Invite by email_style__EmailInviteInput-sc-1vvoo0f-1 gNxvqX'), data.internallyGetValue("Email", index))
	
	WebUI.setText(findTestObject('input_Invite by email_style__EmailInviteInput-sc-1vvoo0f-1 kRLwzc'), data.internallyGetValue("FirstName", index))
	
	WebUI.click(findTestObject('button_Send Invitations'))
}

