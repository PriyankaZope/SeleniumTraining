package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {
private CheckboxPage objCheckboxPage;
	
	public void checkboxPageObjects(){
		objCheckboxPage = new CheckboxPage(this);
	}
	
	@BeforeClass
	public void initializeAndSetWebEnvironment(){
		this.checkboxPageObjects();
		this.initializeWebEnvironment();
		
	}
	@AfterClass
	public void tearDownWebEnvironment(){
		this.tearDownEnvironment();
	}
	@Test(priority=1)
	public void TC_ID_100_verifyCheckboxDemoPageIsDisplayed() throws InterruptedException{
		objCheckboxPage.closePopup();
		objCheckboxPage.selectDropdownValue(objconfig.getProperty("topUpValue"), objconfig.getProperty("strDropDownValue_1"));
		objCheckboxPage.verifyHeaderOfcheckboxDemoPage(objconfig.getProperty("strExpectedHdr"));
	}
	
	@Test(priority=2)
	public void TC_ID_101_verifyCheckboxIsSelected(){
		objCheckboxPage.verifyCheckboxIsSelectedOrNot();
		
	}
	@Test(priority=3)
	public void TC_ID_102_verifyMultipleCheckBoxIsSelected(){
		objCheckboxPage.verifyAndSelectMultipleCheckbox();
	}
}
