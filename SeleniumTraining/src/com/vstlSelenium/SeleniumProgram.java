package com.vstlSelenium;

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
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Gmail login");
		element.sendKeys(	Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='gmail.google.com']")).click();
		driver.findElement(By.xpath("//a[text()='sign in']")).click();
		
	}
public void tearDownEnvironment(){
	driver.quit();
}
}
