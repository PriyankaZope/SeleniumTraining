package com.TestNG;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

		objBaseTest.checkMessageDisplayed(locator);
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

	// button3(verified Using isDisplayed method)
	
	public void verifyAutoclosableWarningMessage(){
		By loc_AutoclosableWarningMessage= By.xpath("//div[contains(text(),'an autocloseable warning message. I will hide in 3 seconds.')]");
		objBaseTest.checkElementVisibility(loc_AutoclosableWarningMessage, 3);
		Assert.assertTrue(objBaseTest.checkMessageDisplayed(loc_AutoclosableWarningMessage));
	}
	
	// button4(verified Using isDisplayed method)
	
	public void verifyNormalWarningMessage(){
		By loc_NormalWarningMessage = By.xpath("//div[@class='alert alert-warning alert-normal-warning']");
		objBaseTest.checkElementVisibility(loc_NormalWarningMessage, 5);
		Assert.assertTrue(objBaseTest.checkMessageDisplayed(loc_NormalWarningMessage));
	}
	

	// button5(verified using list)
	
	public void verifyAutoclosableDangerMessage(){
		By loc_AutoclosableDangerMessage = By.xpath("//div[contains(text(),'an autocloseable danger message. I will hide in 5 seconds.')]");

		String strAutoclosableDangerMessage ="I'm an autocloseable danger message. I will hide in 5 seconds.";
	      // identify elements with text()
	      List<WebElement> autoclosableDangerMessage= objBaseTest.getDriver().findElements(loc_AutoclosableDangerMessage);
	      Assert.assertTrue(autoclosableDangerMessage.size()!=0);
	      Assert.assertTrue(objBaseTest.getDriver().getPageSource().contains(strAutoclosableDangerMessage));
	     
	  
	}
	

	// button6(verified using list)
	
	By loc_NormalDangerMessage = By.xpath("//div[@class='alert alert-danger alert-normal-danger']");
	
	public void verifyNormalDangerMessage(String strNormalDangerMessage){
	      // identify elements with text()
	      List<WebElement> autoclosableDangerMessage= objBaseTest.getDriver().findElements(loc_NormalDangerMessage);
	      // verify list size
	      if ( autoclosableDangerMessage.size() > 0){
	         System.out.println("Text: " + strNormalDangerMessage + " is present. ");
	      } else {
	         System.out.println("Text: " + strNormalDangerMessage + " is not present. ");
	      }
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

	// button8(Using assertEquals)
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
		String ExpectedTitle = "I'm a normal info message. To close use the appropriate button.";
		Assert.assertEquals(ExpectedTitle, strActualValue);
		
	}
}
