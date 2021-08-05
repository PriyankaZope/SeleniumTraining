package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	WebDriver driver = null;
	Select selectRandom ;

	public void initializeWebEnvironment(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
	}
	public void verifyHeaderOfFacebookSignUpPage(){
		//driver.findElement(By.xpath("//div[@class='_8esf _8f3m _9bpz _9bq9']//div//div//div[@class='mbs _52lq _9bp_ fsl fwb fcb']"));
		By locator = By.xpath("//div[@class='_8esf _8f3m _9bpz _9bq9']//div//div//div[@class='mbs _52lq _9bp_ fsl fwb fcb']");
		boolean element = driver.findElement(locator).isDisplayed();
		if (element) {
			System.out.println("Header of facebook page is verified : ");
		} else
			System.out.println("Opened a wrong Page");

		
	}
	
	public void setName(String name) {
		System.out.println("===========================");
		System.out.println("\tFaceBook SignUp Page");
		System.out.println("===========================");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(name);

		System.out.println("\nSet Name : " + name);
	}

	public void setLastName(String lastName) {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
		System.out.println("Set LastName : " + lastName);
	}

	public void setMobileNumber(String mobNo) {
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(mobNo);

		System.out.println("Set Mobile Number : " + mobNo);
	}

	public void setPassword(String strPassword) {
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(strPassword);

		System.out.println("Set Password : " + strPassword);
	}

	public void setBirthDate(String date) {
		selectRandom = new Select (driver.findElement(By.xpath("//select[@name='birthday_day']")));
		selectRandom.selectByValue(date);
		System.out.println("Set Birth Date : " + date);

	}

	public void setBirthMonth(int month) {
		selectRandom = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		selectRandom.selectByIndex(month);
		System.out.println("Set Birth Month : " + month);
	}

	public void setBirthYear(String year) {
		selectRandom = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		selectRandom.selectByValue(year);
		System.out.println("Set Birth Year : " + year);
	}

	public void selectGender(String gender) {
		
		 WebElement radio = driver.findElement(By.xpath("//input[@name='sex'][@value='2']"));
	        radio.click();
	   
		System.out.println("Set Birth Year : " + gender);

		
	}

/*	public void clickSignUpButton() {
	 driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		System.out.println("click on 'SignUp' button");
	}*/


}
