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

WebUI.navigateToUrl('http://localhost:3000/spectrum?tab=posts')

CSVData data = findTestData("csv/Post_Community (1)")

for (def index : (0.. data.getRowNumbers() - 1)) {
    WebUI.click(findTestObject('Page_CnAME2 community/div_Info_sc-bxivhb beCRxj'))

    WebUI.setText(findTestObject('Page_CnAME2 community/input_Info_sc-gzVnrw lbskuL'), data.internallyGetValue("PostDetails", index) )

    WebUI.setText(findTestObject('Page_CnAME2 community/textarea'), data.internallyGetValue("PostDes", index) )

    WebUI.click(findTestObject('Page_CnAME2 community/button_Post'))

    WebUI.click(findTestObject('Object Repository/Page_Post title  CnAME2/span_view-close'))
}

