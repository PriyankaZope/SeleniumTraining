package com.Seleniumeasy;

public class TestSeleniumEasy {

	public static void main(String[] args) throws InterruptedException {

		SeleniumEasy objSeleniumEasy = new SeleniumEasy();
		objSeleniumEasy.initializeWebEnvironment();
		objSeleniumEasy.closePopup();
	//	objSeleniumEasy.clickAllHeaderOnTopupMenu("Table");
	//	objSeleniumEasy.dropDownValue("Table Filter");
		objSeleniumEasy.selectValue(objSeleniumEasy.objconfig.getProperty("topUpValue"),objSeleniumEasy.objconfig.getProperty("strDropDownValue"));
		objSeleniumEasy.checkHeaderOfSimpleFormDemoPage();
		objSeleniumEasy.sendMessageToSingleInputField(objSeleniumEasy.objconfig.getProperty("strmessage"));
		objSeleniumEasy.getTotalInTwoInputField(objSeleniumEasy.objconfig.getProperty("num1"),objSeleniumEasy.objconfig.getProperty("num2"));
	
	
	
	}

}
