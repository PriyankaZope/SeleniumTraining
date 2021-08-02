package com.vstlSelenium;

public class TestXpathPractice {

	public static void main(String[] args) {
		XpathPractice objXpathPractice = new XpathPractice();
		objXpathPractice.initializeWebEnvironment();
		objXpathPractice.selectInputForms();
		objXpathPractice.tearDownEnvironment();

	}

}
