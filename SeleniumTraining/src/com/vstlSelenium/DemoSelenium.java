package com.vstlSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSelenium {
	WebDriver driver = null;

	public void initializeWebEnvironment() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='at-cv-lightbox-close']")).click();

	}

	public void clickAllHeaderOnTopupMenu(String strTopUpValue, String dropDownValue) {
		By locator = By.xpath("//div[@id='navbar-brand-centered']//li[@class='dropdown']/a[@data-toggle='dropdown']");
		List<WebElement> list = driver.findElements(locator);
		for (WebElement webElement : list) {
			System.out.println("Topup Value : " + webElement.getText());
			String strActualValue = webElement.getText();

			if (strActualValue.equals(strTopUpValue)) {
				webElement.click();
			}
		}

		By locator_1 = By
				.xpath("//div[@id='navbar-brand-centered']//li[@class='dropdown open']/ul[@ class='dropdown-menu']");

		List<WebElement> list_1 = driver.findElements(locator_1);
		for (WebElement webElement_1 : list_1) {
			System.out.println("\nDropDown Value  : \t" + webElement_1.getText());

			String value = webElement_1.getText();

			if (value.contains(dropDownValue)) {
				webElement_1.click();
			}

		}
	}

	public static void main(String[] args) {
		DemoSelenium objDemoSelenium = new DemoSelenium();
		objDemoSelenium.initializeWebEnvironment();
		objDemoSelenium.clickAllHeaderOnTopupMenu("Input Forms", "Simple Form Demo");
		// objDemoSelenium.dropDownValue("Simple Form Demo");

	}

}
