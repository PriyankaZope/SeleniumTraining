package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class SeleniumEasyPage {
	public boolean blnValue = false;
	private BaseTest objBaseTest;
	
	public SeleniumEasyPage(BaseTest baseTest ){
		this.objBaseTest= baseTest;
		
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
	public void verifyHeaderOfSimpleFormDemoPage() {
		objBaseTest.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		By locator = By.xpath("//h3[text()='This would be your first example to start with Selenium.']");
		
		objBaseTest.checkElementDisplayed(locator);
		if (objBaseTest.checkElementDisplayed(locator)){
			System.out.println("Simple form demo page is displayed");
		}
}
	public void setMessageForSingleInputField(String strMessage) {
		objBaseTest.getDriver().findElement(By.xpath("//input[@id='user-message']")).sendKeys(strMessage);
		objBaseTest.getDriver().findElement(By.xpath("//button[text()='Show Message']")).click();

	}
	public void verifyMessageInSingleInputField(String strExpectedMessage) {
		String strActualMessage = objBaseTest.getDriver().findElement(By.xpath("//span[@id='display']")).getText();

		if (strActualMessage.equals(strExpectedMessage)) {
			System.out.println("Message is passed !!!");
		} else
			System.out.println("Message is failed !!!");

	}
	public void setValuesOfAAndBInTwoInputField(String strValue, String num) {
		By locator = By.xpath("//form[@id='gettotal']//label[text()='" + strValue + "']/following-sibling::input[1]");
		objBaseTest.getDriver().findElement(locator).sendKeys(num);

	}

	public void clickOnGetTotal() {
		objBaseTest.getDriver().findElement(By.xpath("//button[text()='Get Total']")).click();
	}
	public String getTotal() {
		String strTotal = objBaseTest.getDriver().findElement(By.xpath("//span[@id='displayvalue']")).getText();
		return strTotal;
	}

	public void verifyTotal(String strValueA, String strValueB) {

		int intTotal = Integer.parseInt(strValueA) + Integer.parseInt(strValueB);
		String strActualTotal = this.getTotal();
		if (intTotal == Integer.parseInt(strActualTotal)) {
			System.out.println("Got the Total");
		} else
			System.out.println("Wrong Total");

	}
	}
