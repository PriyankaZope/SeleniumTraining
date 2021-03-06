package com.vstlSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProgram {

	WebDriver driver = null;

	public void initializeWebEnvironment() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='at-cv-lightbox-close']")).click();

	}

	public void clickAllHeaderOnTopupMenu(String strTopUpValue) {
		By locator = By.xpath("//div[@id='navbar-brand-centered']//li[@class='dropdown']/a[@data-toggle='dropdown']");
		List<WebElement> list = driver.findElements(locator);
		for (WebElement webElement : list) {
			System.out.println("Topup Value : " + webElement.getText());

			String strActualValue = webElement.getText();
			if (strActualValue.equals(strTopUpValue)) {
				webElement.click();
				// break;

			}}}

	public void dropDownValue(String strDropDownValue) {
	By locator_1=By.xpath("//div[@id='navbar-brand-centered']//li[@class='dropdown open']/ul[@ class='dropdown-menu']");	
		
		List<WebElement> list_1 = driver.findElements(locator_1);
		for (WebElement webElement : list_1) {
			System.out.println("\nDropDown Value  : " + webElement.getText());
			
			String strActualvalue = webElement.getText();
			if (strActualvalue.contains(strDropDownValue)){
				webElement.click();
				
			
				
			}
		}
	}

	public void tearDownEnvironment() {
		driver.quit();
	}
}
