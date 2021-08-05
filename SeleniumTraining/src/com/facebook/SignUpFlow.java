package com.facebook;

import java.util.Random;

public class SignUpFlow {
	public SignUpPage objSignUpPage;
	private String testData = "";
	private Utility objUtility;
	Random objRandom = new Random();
	
	public SignUpFlow() {
		objSignUpPage = new SignUpPage();
		
		objUtility = new Utility();
	}
	public void initializeWebEnvironment(){
		
		objSignUpPage.initializeWebEnvironment();
		
	}
	public void verifyHeaderOfFacebookSignUpPage(){
		objSignUpPage.verifyHeaderOfFacebookSignUpPage();
	}
	

	public void signUp() {
		testData = objUtility.createSignUpTestData().get("Name") + objUtility.getRandomString(3);
		if (!testData.equals(""))
			objSignUpPage.setName(testData);

		testData = objUtility.createSignUpTestData().get("LastName") + objUtility.getRandomString(3);
		if (!testData.equals(""))
			objSignUpPage.setLastName(testData);

		testData = objUtility.createSignUpTestData().get("MobileNo") + objUtility.setMobileNumber1();
		if (!testData.equals(""))
			objSignUpPage.setMobileNumber(testData);

		testData = objUtility.createSignUpTestData().get("Password")+objUtility.getRandomString(5);
		if (!testData.equals(""))
			objSignUpPage.setPassword(testData);

		testData = objUtility.createSignUpTestData().get("BirthDate")+objUtility.getRandomDate(30);
		if (!testData.equals(""))
			objSignUpPage.setBirthDate(testData);

		testData = objUtility.createSignUpTestData().get("Month")+objUtility.randomBirthMonth();
		if (!testData.equals(""))
			objSignUpPage.setBirthMonth(Integer.parseInt(testData));

		testData = objUtility.createSignUpTestData().get("Year")+objUtility.getYear();
		if (!testData.equals(""))
			objSignUpPage.setBirthYear(testData);

		testData = objUtility.createSignUpTestData().get("Gender");
		if (!testData.equals(""))
			objSignUpPage.selectGender(testData);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
