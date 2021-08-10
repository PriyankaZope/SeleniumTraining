package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	@BeforeClass
	public void beforeClassMethod(){
		System.out.println("Before Class");
	}
	
	@AfterClass
public void afterClassMethod(){
	System.out.println("After Class");
	}

	@BeforeMethod
	public void beforeMethodExample(){
		System.out.println("Before Method");
		}

	@AfterMethod
	public void afterMethodExample(){
		System.out.println("After Method");
		}

	@BeforeTest
	public void beforeTestMethod(){
		System.out.println("Before Test");
		}
	
	@AfterTest
	public void afterTestMethod(){
		System.out.println("After Test");
		}
	@BeforeGroups
	public void beforeGroupsMethod(){
		System.out.println("Before Groups");
		}
	
	@AfterGroups
	public void afterGroupsMethod(){
		System.out.println("After Groups");
		}
	
	@BeforeSuite
	public void beforeSuiteMethod(){
		System.out.println("Before Suite");
		}
	
	@AfterSuite
	public void afterSuiteMethod(){
		System.out.println("After Suite");
		}
	
	@Test(priority=1)
	public void TCID_1(){
		System.out.println("Priority 1");
		}

	@Test(priority=2)
	public void TCID_2(){
		System.out.println("Priority 2");
		}
	
	@Test(priority=3)
	public void TCID_3(){
		System.out.println("Priority 3");
		}
}
