package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BootstrapAlertTest extends BaseTest {
	private BootstrapAlert objBootstrapAlert;

	public void bootStrapAlertPageObjects() {
		objBootstrapAlert = new BootstrapAlert(this);
	}

	@BeforeClass
	public void initializeAndSetWebEnvironment() {
		this.bootStrapAlertPageObjects();
		this.initializeWebEnvironment();

	}

	@AfterClass
	public void tearDownWebEnvironment() {
		this.tearDownEnvironment();
	}

	@Test(priority = 1)
	public void TC_ID_100_verifyCheckboxDemoPageIsDisplayed() throws InterruptedException {
		objBootstrapAlert.closePopup();
		objBootstrapAlert.selectDropdownValue(objconfig.getProperty("topupValue1"),
				objconfig.getProperty("strDropDownValue_2"));
		objBootstrapAlert.verifyHeaderOfBootstrapAlertPage(objconfig.getProperty("strExpectedHeader_1"));
	}

	@Test(priority = 2)
	public void TC_ID_101_verifyAutoClosableSuccessMessageIsDisplayed() {
		objBootstrapAlert.selectBootstrapButton(objconfig.getProperty("strAutoclosableSuccess"));
		objBootstrapAlert.verifyAutoclosableSuccessMessage(objconfig.getProperty("strExpectedMessage_2"));

	}

	@Test(priority = 3)
	public void TC_ID_102_verifyNormalSuccessMessageIsDisplayed() {
		objBootstrapAlert.selectBootstrapButton(objconfig.getProperty("strSuccessMessage"));
		objBootstrapAlert.verifyNormalSuccessMessage(objconfig.getProperty("strExpectedMessage_1"));
	}

	@Test(priority = 4)
	public void TC_ID_102_verifyAutoClosableWarningMessageIsDisplayed() {
		objBootstrapAlert.selectBootstrapButton(objconfig.getProperty("strAutoclosableWarningMessage"));
		objBootstrapAlert.verifyAutoclosableWarningMessage(objconfig.getProperty("strExpectedMessage_3"));
	}
	@Test(priority = 5)
	public void TC_ID_102_verifyNormalWarningMessageIsDisplayed() {
		objBootstrapAlert.selectBootstrapButton(objconfig.getProperty("strnormalWarningMessage"));
		objBootstrapAlert.verifyNormalWarningMessage(objconfig.getProperty("strExpectedMessage_4"));
	}
	@Test(priority = 6)
	public void TC_ID_102_verifyAutoclosableDangerMessageIsDisplayed() {
		objBootstrapAlert.selectBootstrapButton(objconfig.getProperty("strAutoClosableDanger"));
		objBootstrapAlert.verifyAutoclosableDangerMessage(objconfig.getProperty("strExpectedMessage_5"));
	}
	@Test(priority = 7)
	public void TC_ID_102_verifyNormalDangerMessageIsDisplayed() {
		objBootstrapAlert.selectBootstrapButton(objconfig.getProperty("strNormalDanger"));
		objBootstrapAlert.verifyNormalDangerMessage(objconfig.getProperty("strExpectedMessage_6"));

	}
	@Test(priority = 8)
	public void TC_ID_102_verifyAutoClosableInfoMessageIsDisplayed() {
		objBootstrapAlert.selectBootstrapButton(objconfig.getProperty("strAutoclosableInfo"));
		objBootstrapAlert.verifyAutoclosableInfoMessage(objconfig.getProperty("strExpectedMessage_7"));
	}
	@Test(priority = 9)
	public void TC_ID_102_verifyNormalInfoMessageIsDisplayed() {
		objBootstrapAlert.selectBootstrapButton(objconfig.getProperty("strNormalInfo"));
		objBootstrapAlert.verifyNormalInfoMessage(objconfig.getProperty("strExpectedMessage_8"));
		
	}
}
