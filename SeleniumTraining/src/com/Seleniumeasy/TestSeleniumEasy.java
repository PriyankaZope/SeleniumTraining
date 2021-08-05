package com.Seleniumeasy;

public class TestSeleniumEasy {

	public static void main(String[] args) throws InterruptedException {

		SeleniumEasy objSeleniumEasy = new SeleniumEasy();
		objSeleniumEasy.initializeWebEnvironment();
		objSeleniumEasy.closePopup();
		
	
	objSeleniumEasy.selectValue(objSeleniumEasy.objconfig.getProperty("topUpValue"), objSeleniumEasy.objconfig.getProperty("strDropDownValue"));
	objSeleniumEasy.verifyHeaderOfSimpleFormDemoPage();
	objSeleniumEasy.checkHeaderOfSingleInputField();
	objSeleniumEasy.setMessageForSingleInputField(objSeleniumEasy.objconfig.getProperty("strMessage"));
	objSeleniumEasy.verifyMessageInSingleInputField(objSeleniumEasy.objconfig.getProperty("strExpectedMessage"));
	objSeleniumEasy.verifyTwoInputFieldsHeader();
	objSeleniumEasy.setValuesOfAAndBInTwoInputField(objSeleniumEasy.objconfig.getProperty("strValue"), objSeleniumEasy.objconfig.getProperty("num1"));
	objSeleniumEasy.setValuesOfAAndBInTwoInputField(objSeleniumEasy.objconfig.getProperty("strValue2"), objSeleniumEasy.objconfig.getProperty("num2"));
	objSeleniumEasy.clickOnGetTotal();
	objSeleniumEasy.getTotal();
	objSeleniumEasy.verifyTotal(objSeleniumEasy.objconfig.getProperty("num1"), objSeleniumEasy.objconfig.getProperty("num2"));
	
	
	
	
	}

}
