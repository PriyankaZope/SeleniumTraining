package com.vstlSelenium;

public class TestSeleniumProgram {

	public static void main(String[] args) {

		SeleniumProgram objSeleniumProgram = new SeleniumProgram();
		objSeleniumProgram.initializeWebEnvironment();
		objSeleniumProgram.tearDownEnvironment();
	}

}
