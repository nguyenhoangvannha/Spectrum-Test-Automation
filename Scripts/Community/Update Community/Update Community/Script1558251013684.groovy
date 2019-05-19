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

WebUI.callTestCase(findTestCase('SignUp Test/SignIn'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://localhost:3000/cname2?tab=posts')

WebUI.click(findTestObject('Object Repository/Page_CnAME community/button_Settings'))

WebUI.setText(findTestObject('Object Repository/Page_CnAME settings/input_Name_style__StyledInput-sc-17zryot-2 jHXlSy'), 
    'CnAME updasted 2')

WebUI.setText(findTestObject('Object Repository/Page_CnAME settings/textarea_hELLOCC'), 'hELLOCC  2')

WebUI.setText(findTestObject('Object Repository/Page_CnAME settings/input_Optional Add your communitys website_style__StyledInput-sc-17zryot-2 jHXlSy'), 
    'nONAME updasted 2')

WebUI.click(findTestObject('Object Repository/Page_CnAME settings/button_Save'))

