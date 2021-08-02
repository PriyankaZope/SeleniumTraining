package com.vstlSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {
	WebDriver driver = null;

	public void initializeWebEnvironment() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='at-cv-lightbox-close']")).click();

	}
	public void selectInputForms(){
		By loc_lnk_inputForm = By.xpath("//a[contains(.,'Input Forms')][1]");
		driver.findElement(loc_lnk_inputForm).click();
		driver.findElement(By.xpath("//a[contains(.,'Simple Form Demo')][1]")).click();
	}
	public void tearDownEnvironment() {
		driver.quit();
	}
}
