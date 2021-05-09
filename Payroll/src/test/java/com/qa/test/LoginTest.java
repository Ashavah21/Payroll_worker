package com.qa.test;

import org.testng.annotations.Test;

import com.qa.constant.Constant;
import com.qa.page.LoginPage;
import com.qa.utility.ExcelRead;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class LoginTest extends BaseTest{
	  @Test(dataProvider = "loginData")
	  public void verifyLogin(String username ,String password)
	  {
		  	LoginPage lp = new LoginPage(driver);
			lp.doLogin(username,password);
			String actTitle=driver.getTitle();
			String expTitle ="Login";
			Assert.assertEquals(actTitle, expTitle, "TITLE OK");
			//Assert.assertEquals(driver.getTitle(), Constant.homeTitle);
			
			System.out.println("LOGINPAGE VERIFIED");

	  }

  @DataProvider
  public Object[][] loginData() throws InvalidFormatException, IOException {
	  
	  // Excel path and excelsheet name
	  Object[][] data =ExcelRead.getDataFromExcel("C:\\Users\\Sasi\\Desktop\\Desktop\\JavaNotes\\LoginPR.xlsx", "LoginPR");
	  
	    return  data ;

    };
  
}
