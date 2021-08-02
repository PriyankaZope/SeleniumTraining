package com.vstlSelenium;

public class TestSeleniumProgram {

	public static void main(String[] args) {

		SeleniumProgram objSeleniumProgram = new SeleniumProgram();
		objSeleniumProgram.initializeWebEnvironment();
		objSeleniumProgram.clickAllHeaderOnTopupMenu("Input Forms");
		objSeleniumProgram.dropDownValue("Simple Form Demo");
		//objSeleniumProgram.tearDownEnvironment();
		
	
		
		//	Input Forms : Simple Form Demo ,Checkbox Demo , 	Radio Buttons Demo ,	Select Dropdown List , Input Form Submit, 	Ajax Form Submit ,JQuery Select dropdown
	//	Date pickers
	//	Table : Table Pagination ,Table Data Sea,	Table Filter ,Table Sort & Search ,Table Data Download
	//	Progress Bars
	//	Alerts & Modals
	//	List Box : Bootstrap List Box , JQuery List Box ,	Data List Filter
	//	Others
		
	
	}

}
