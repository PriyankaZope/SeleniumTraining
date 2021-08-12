package com.TestNG;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	WebDriver driver = null;
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
	
	public WebDriver getDriver(){
		return driver;
		
	}
	public void checkElementVisibility(By locator,int timeUnitInSecond) {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), timeUnitInSecond);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
	
	public boolean checkMessageDisplayed(By locator){
		boolean blnFlag=false;
	try {
		 WebDriverWait wait = new WebDriverWait(this.getDriver(), 5);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	     WebElement webElement = this.getDriver().findElement(locator);
	  blnFlag=   webElement.isDisplayed();
		return blnFlag;
	} catch (Exception exception) {
		System.out.println("I got Exception : "+exception.getMessage());
		return blnFlag;
	}
	
}
	

	public void tearDownEnvironment(){
		driver.quit();
	}
}
