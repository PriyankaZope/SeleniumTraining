package com.TestNG;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BootstrapAlert {
	public boolean blnValue = false;
	private BaseTest objBaseTest;
	public Properties objconfig;

	public BootstrapAlert(BaseTest baseTest) {
		this.objBaseTest = baseTest;
	}

	public void closePopup() throws InterruptedException {
		Thread.sleep(5000);
		objBaseTest.getDriver().findElement(By.xpath("//a[@id='at-cv-lightbox-close']")).click();
	}

	public void clickAllHeaderOnTopupMenu(String topUpValue) {
		// Dynamic Locator
		By locator = By
				.xpath("//div[@id='navbar-brand-centered']//li[@class='dropdown']/a[@data-toggle='dropdown'][contains(.,'"
						+ topUpValue + "')]");
		objBaseTest.getDriver().findElement(locator).click();

	}

	public void dropDownValue(String strDropDownValue) {
		// Dynamic Locator
		By locator = By.xpath("//div[@id='navbar-brand-centered']//ul/li/a[text()='" + strDropDownValue + "']");
		objBaseTest.getDriver().findElement(locator).click();

	}

	public void selectDropdownValue(String strTopUpValue, String strDropDownValue) {
		this.clickAllHeaderOnTopupMenu(strTopUpValue);
		this.dropDownValue(strDropDownValue);
	}

	public void verifyHeaderOfBootstrapAlertPage(String strExpectedHdr) {
		objBaseTest.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		By locator = By.xpath("//h2[text()='Bootstrap Alert messages']");

		objBaseTest.checkElementDisplayed(locator);
		String strActualHdr = objBaseTest.getDriver().findElement(locator).getText();
		System.out.println("Header of checkbox demo page : " + strActualHdr);
		Assert.assertTrue(strActualHdr.equals(strExpectedHdr));

	}

	// Method to select BootstrapButton
	public void selectBootstrapButton(String strAlertButtonid) {
		objBaseTest.getDriver().findElement(By.xpath("//button[@id='" + strAlertButtonid + "']")).click();
	}

	// button1
	public String getAutoclosableSuccessMessage() {
		String strAutoActualmsg = objBaseTest.getDriver()
				.findElement(By
						.xpath("//div[contains(text(),'an autocloseable success  message. I will hide in 5 seconds.')]"))
				.getText();
		System.out.println("auto Actual msg :" + strAutoActualmsg);
		return objBaseTest.getDriver()
				.findElement(By
						.xpath("//div[contains(text(),'an autocloseable success  message. I will hide in 5 seconds.')]"))
				.getText();
	}

	public void verifyAutoclosableSuccessMessage(String strExpectedMessage) {
		String strActualMessage = this.getAutoclosableSuccessMessage();
		System.out.println("actual message :" + strActualMessage);
		System.out.println("expected message :" + strExpectedMessage);
		Assert.assertTrue(strActualMessage.equals(strExpectedMessage));

	}

	// button2
	public String getNormalSuccessMessage() {
		String strActualMessage = objBaseTest.getDriver()
				.findElement(By.xpath("//div[@class='alert alert-success alert-normal-success']")).getText();
		System.out.println("Actual message : " + strActualMessage);
		return strActualMessage;
	}

	public void verifyNormalSuccessMessage(String strExpectedMessage) {
		String strText = this.getNormalSuccessMessage();
		String strValue = strText.replace("×", " ");
		String strActualValue = strValue.trim();
		Assert.assertTrue(strActualValue.trim().equals(strExpectedMessage));
	}

	// button3
	public String getAutoclosableWarningMessage() {
		String strAutoActualmsg = objBaseTest.getDriver()
				.findElement(By
						.xpath("//div[contains(text(),'an autocloseable warning message. I will hide in 3 seconds.')]"))
				.getText();
		System.out.println("auto Actual msg :" + strAutoActualmsg);
		return objBaseTest.getDriver()
				.findElement(By
						.xpath("//div[contains(text(),'an autocloseable warning message. I will hide in 3 seconds.')]"))
				.getText();
	}

	public void verifyAutoclosableWarningMessage(String strExpectedMessage) {
		String strActualMessage = this.getAutoclosableWarningMessage();
		System.out.println("actual message :" + strActualMessage);
		System.out.println("expected message :" + strExpectedMessage);
		Assert.assertTrue(strActualMessage.equals(strExpectedMessage));

	}

	// button4
	public String getNormalWarningMessage() {
		String strActualMessage = objBaseTest.getDriver()
				.findElement(By.xpath("//div[@class='alert alert-warning alert-normal-warning']")).getText();
		System.out.println("Actual message : " + strActualMessage);
		return strActualMessage;
	}

	public void verifyNormalWarningMessage(String strExpectedMessage) {
		String strText = this.getNormalWarningMessage();
		String strValue = strText.replace("×", " ");
		String strActualValue = strValue.trim();
		System.out.println("ActualValueMessage : " + strActualValue.trim());
		Assert.assertTrue(strActualValue.trim().equals(strExpectedMessage));
	}

	// button5
	public String getAutoclosableDangerMessage() {
		String strAutoActualmsg = objBaseTest.getDriver()
				.findElement(By
						.xpath("//div[contains(text(),'an autocloseable danger message. I will hide in 5 seconds.')]"))
				.getText();
		System.out.println("auto Actual msg :" + strAutoActualmsg);
		return objBaseTest.getDriver()
				.findElement(By
						.xpath("//div[contains(text(),'an autocloseable danger message. I will hide in 5 seconds.')]"))
				.getText();
	}

	public void verifyAutoclosableDangerMessage(String strExpectedMessage) {
		String strActualMessage = this.getAutoclosableDangerMessage();
		System.out.println("actual message :" + strActualMessage);
		System.out.println("expected message :" + strExpectedMessage);
		Assert.assertTrue(strActualMessage.equals(strExpectedMessage));

	}

	// button6
	public String getNormalDangerMessage() {
		String strActualMessage = objBaseTest.getDriver()
				.findElement(By.xpath("//div[@class='alert alert-danger alert-normal-danger']")).getText();
		System.out.println("Actual message : " + strActualMessage);
		return strActualMessage;
	}

	public void verifyNormalDangerMessage(String strExpectedMessage) {
		String strText = this.getNormalDangerMessage();
		String strValue = strText.replace("×", " ");
		String strActualValue = strValue.trim();
		System.out.println("ActualValueMessage : " + strActualValue.trim());
		Assert.assertTrue(strActualValue.trim().equals(strExpectedMessage));
	}

	// button7
	public String getAutoclosableInfoMessage() {
		String strAutoActualmsg = objBaseTest.getDriver()
				.findElement(
						By.xpath("//div[contains(text(),'an autocloseable info message. I will hide in 6 seconds.')]"))
				.getText();
		System.out.println("auto Actual msg :" + strAutoActualmsg);
		return objBaseTest.getDriver()
				.findElement(
						By.xpath("//div[contains(text(),'an autocloseable info message. I will hide in 6 seconds.')]"))
				.getText();
	}

	public void verifyAutoclosableInfoMessage(String strExpectedMessage) {
		String strActualMessage = this.getAutoclosableInfoMessage();
		System.out.println("actual message :" + strActualMessage);
		System.out.println("expected message :" + strExpectedMessage);
		Assert.assertTrue(strActualMessage.equals(strExpectedMessage));

	}

	// button8
	public String getNormalInfoMessage() {
		String strActualMessage = objBaseTest.getDriver()
				.findElement(By.xpath("//div[@class='alert alert-info alert-normal-info']")).getText();
		System.out.println("Actual message : " + strActualMessage);
		return strActualMessage;
	}

	public void verifyNormalInfoMessage(String strExpectedMessage) {
		String strText = this.getNormalInfoMessage();
		String strValue = strText.replace("×", " ");
		String strActualValue = strValue.trim();
		System.out.println("ActualValueMessage : " + strActualValue.trim());
		Assert.assertTrue(strActualValue.trim().equals(strExpectedMessage));
	}
}
