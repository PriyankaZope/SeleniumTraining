package com.Seleniumeasy;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEasy {
	WebDriver driver = null;
	public boolean blnValue = false;
	public Properties objconfig;

	public void initializeWebEnvironment() {

		this.loadConfigProperties();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(objconfig.getProperty("AUT_URL"));
		driver.manage().window().maximize();

	}

	public void loadConfigProperties() {

		try {
			objconfig = new Properties();
			objconfig.load(new FileInputStream(System.getProperty("user.dir") + "/src/config/config.properties"));

		} catch (Exception exception) {
			System.out.println("I got the exception : " + exception.getMessage());
			exception.printStackTrace();
		}
	}

	/*
	 * public boolean isPopupDisplayed(){ boolean blnValue = false ; try {
	 * blnValue =
	 * driver.findElement(By.xpath("//a[@id='at-cv-lightbox-close']")).
	 * isDisplayed(); return blnValue;
	 * 
	 * } catch (Exception exception) { System.out.println(
	 * "I got the Exception : "+exception.getMessage()); return blnValue; } }
	 * 
	 * public void closePopUp(){ try { Thread.sleep(5000); } catch (Exception
	 * exception) { System.out.println("I got the exception : "
	 * +exception.getMessage()); exception.printStackTrace(); } }
	 */
	public void closePopup() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='at-cv-lightbox-close']")).click();
	}

	public void clickAllHeaderOnTopupMenu(String topUpValue) {
		// Dynamic Locator
		By locator = By
				.xpath("//div[@id='navbar-brand-centered']//li[@class='dropdown']/a[@data-toggle='dropdown'][contains(.,'"
						+ topUpValue + "')]");
		driver.findElement(locator).click();

	}

	public void dropDownValue(String strDropDownValue) {
		// Dynamic Locator
		By locator = By.xpath("//div[@id='navbar-brand-centered']//ul/li/a[text()='" + strDropDownValue + "']");
		driver.findElement(locator).click();

	}

	public void selectValue(String strTopUpValue, String strDropDownValue) {
		this.clickAllHeaderOnTopupMenu(strTopUpValue);
		this.dropDownValue(strDropDownValue);
	}

	public void verifyHeaderOfSimpleFormDemoPage() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		By locator = By.xpath("//h3[text()='This would be your first example to start with Selenium.']");
		boolean element = driver.findElement(locator).isDisplayed();
		if (element) {
			System.out.println("Simple Form Demo Page is opened");
		}
		/*
		 * String strheaderofSimpleFormDemo = element.getText();
		 * System.out.println("Header of 'Simple Form Demo' : "
		 * +strheaderofSimpleFormDemo);
		 */
	}

	public void checkHeaderOfSingleInputField() {
		By locator = By.xpath("//div[text()='Single Input Field']");
		boolean element = driver.findElement(locator).isDisplayed();
		if (element) {
			System.out.println(driver.findElement(locator).getText());
		} else
			System.out.println("Single Input Field is not there");

	}

	public void setMessageForSingleInputField(String strMessage) {
		driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys(strMessage);
		driver.findElement(By.xpath("//button[text()='Show Message']")).click();

	}

	public void verifyMessageInSingleInputField(String strExpectedMessage) {
		String strActualMessage = driver.findElement(By.xpath("//span[@id='display']")).getText();

		if (strActualMessage.equals(strExpectedMessage)) {
			System.out.println("Message is passed !!!");
		} else
			System.out.println("Message is failed !!!");

	}

	
	public void verifyTwoInputFieldsHeader() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");

		
		By locator = By.xpath("//div[text()='Two Input Fields']");
		boolean element = driver.findElement(locator).isDisplayed();
		if (element) {
			System.out.println(driver.findElement(locator).getText());
		} else
			System.out.println("Two Input Fields is not there");

	}

	public void setValuesOfAAndBInTwoInputField(String strValue, String num) {
		By locator = By.xpath("//form[@id='gettotal']//label[text()='" + strValue + "']/following-sibling::input[1]");
		driver.findElement(locator).sendKeys(num);

	}

	public void clickOnGetTotal() {
		driver.findElement(By.xpath("//button[text()='Get Total']")).click();
	}

	public String getTotal() {
		String strTotal = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();
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
