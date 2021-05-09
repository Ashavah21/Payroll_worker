package com.qa.test;

import org.testng.annotations.Test;

import com.qa.constant.Constant;
import com.qa.utility.Elementutil;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {
	WebDriver driver;
	Elementutil util;
	
		 @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get(Constant.appUrl);
			 util= new Elementutil(driver);
		  }		

	  @AfterTest
	  public void afterTest() {
		 //driver.close();
	  }

}
