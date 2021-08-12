package com.TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckboxPage {
	public boolean blnValue = false;
	private BaseTest objBaseTest;

	public CheckboxPage(BaseTest baseTest) {
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

	public void verifyHeaderOfcheckboxDemoPage(String strExpectedHdr) {
		objBaseTest.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		By locator = By.xpath("//h3[text()='This would be a basic example to start with checkboxes using selenium.']");

		objBaseTest.checkMessageDisplayed(locator);
		String strActualHdr = objBaseTest.getDriver().findElement(locator).getText();
		System.out.println("Header of checkbox demo page : " + strActualHdr);
		Assert.assertTrue(strActualHdr.equals(strExpectedHdr));

	}

	// verified checkbox is selected or not by using assertFalse
	//used assertNotNull
	public void verifyCheckboxIsSelectedOrNot() {
		By loc_SingleCheckbox = By.xpath("//input[@id='isAgeSelected']");
		Assert.assertFalse(objBaseTest.getDriver().findElement(loc_SingleCheckbox).isSelected());
		objBaseTest.getDriver().findElement(loc_SingleCheckbox).click();
		Assert.assertNotNull(objBaseTest.getDriver().findElement(loc_SingleCheckbox));
	}

	// verified checkbox is selected or not by using assertFalse
	public void verifyAndSelectMultipleCheckbox() {

		By locator = By.xpath("//input[@type='checkbox'][@class='cb1-element']");
		Assert.assertFalse(objBaseTest.getDriver().findElement(locator).isSelected());
		List<WebElement> AllCheckboxes = objBaseTest.getDriver().findElements(locator);

		int size = AllCheckboxes.size();
		System.out.println("Size of Multiple checkbox is : " + size);

		for (int i = 0; i < size; i++) {

			AllCheckboxes.get(i).click();
			System.out.println("Checkbox is selected");
		}

	}

}
