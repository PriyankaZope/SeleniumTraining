package com.Seleniumeasy;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
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
	public void checkHeaderOfSimpleFormDemoPage(){
		By locator = By.xpath("//h3[text()='This would be your first example to start with Selenium.']");
	WebElement element =	driver.findElement(locator);
	String strheaderofSimpleFormDemo = element.getText();
	System.out.println("Header of 'Simple Form Demo' : "+strheaderofSimpleFormDemo);
	
	}
	
	public void sendMessageToSingleInputField(String strmessage){
		driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys(strmessage);
		driver.findElement(By.xpath("//button[text()='Show Message']")).click();
		String strmsg = driver.findElement(By.xpath("//span[@id='display']")).getText();
		System.out.println("Display Message : "+strmsg);
	}
	
	public void getTotalInTwoInputField(String num1 , String num2){
		driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys(num1);
		driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys(num2);
		driver.findElement(By.xpath("//button[text()='Get Total']")).click();
		String strActualSum = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();
        System.out.println("Sum of Numbers for 'Two Input Field' : " + strActualSum);
	}
	
}
