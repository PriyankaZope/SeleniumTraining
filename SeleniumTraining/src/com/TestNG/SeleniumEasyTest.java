package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumEasyTest extends BaseTest {
	
	private SeleniumEasyPage objSeleniumEasyPage;
	
	public void seleniumEasyPageObjects(){
		objSeleniumEasyPage = new SeleniumEasyPage(this);
	}
	
	
	
	
	@BeforeClass
	public void initializeAndSetWebEnvironment(){
		this.seleniumEasyPageObjects();
		this.initializeWebEnvironment();
		
	}
	@AfterClass
	public void tearDownWebEnvironment(){
		this.tearDownEnvironment();
	}
	@Test(priority=1)
	public void TC_ID_100_verifySimpleFormDemoPageIsDisplayed() throws InterruptedException{
		objSeleniumEasyPage.closePopup();
		objSeleniumEasyPage.selectDropdownValue(objconfig.getProperty("topUpValue"), objconfig.getProperty("strDropDownValue"));
		objSeleniumEasyPage.verifyHeaderOfSimpleFormDemoPage();
	}
	
	@Test(priority=2)
	public void TC_ID_101_setAndVerifyMessageForSingleInputField(){
		objSeleniumEasyPage.setMessageForSingleInputField(objconfig.getProperty("strMessage"));
		objSeleniumEasyPage.verifyMessageInSingleInputField(objconfig.getProperty("strExpectedMessage"));
	}
	
	@Test(priority=3)
	public void TC_ID_102_setNumbersAndVerifyTotal(){
		objSeleniumEasyPage.setValuesOfAAndBInTwoInputField(objconfig.getProperty("strValue"), objconfig.getProperty("num1"));
		objSeleniumEasyPage.setValuesOfAAndBInTwoInputField(objconfig.getProperty("strValue2"), objconfig.getProperty("num2"));
		objSeleniumEasyPage.clickOnGetTotal();
		objSeleniumEasyPage.verifyTotal(objconfig.getProperty("num1"), objconfig.getProperty("num2"));
		}
	
/*	@BeforeClass
	public void initializeAndWebEnvironment(){
		this.seleniumEasyPageObjects();
		this.initializeWebEnvironment();
		
	}
	@Test(priority=1)
	public void TC_ID_100_verifyCheckboxDemoPageIsDisplayed() throws InterruptedException{
		objSeleniumEasyPage.closePopup();
		objSeleniumEasyPage.selectDropdownValue(objconfig.getProperty("topUpValue"), objconfig.getProperty("strDropDownValue_1"));
		objSeleniumEasyPage.verifyHeaderOfSimpleFormDemoPage();
	}*/
	}
