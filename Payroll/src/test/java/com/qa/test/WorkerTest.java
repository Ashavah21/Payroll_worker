package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.constant.Constant;
import com.qa.page.LoginPage;
import com.qa.page.WorkerPage;
import com.qa.utility.Elementutil;

public class WorkerTest extends BaseTest{
	
	//Login
  @Test(priority=1)
  public void verifyLogin()  {	  
		
		LoginPage lp1 = new LoginPage(driver);
		lp1.doLogin(Constant.username,Constant.password);
		WebDriverWait wait = new WebDriverWait(driver,60); 		//Explicit
		wait.until(ExpectedConditions.titleIs("Payroll Application"));
		Assert.assertEquals(driver.getTitle(), Constant.homeTitle, "DashBoard Title Mismatch");
		System.out.println("Title Verified:" + Constant.homeTitle);
}
  
//Navigate to Worker Dashboard
  @Test(priority=2)
  public void verifyWorkerDashboard() throws Exception  {
	  WorkerPage wp = new WorkerPage(driver);
		wp.doWorkerdash();
		System.out.println("Worker Dashboard Navigation");
  }
  
	//Search
  @Test(priority=3)
  public void verifyWorkerSearch() throws Exception  {
	  WorkerPage wp = new WorkerPage(driver);
		wp.doWorkerSearch();
		Assert.assertEquals(driver.getTitle(), Constant.searchTitle, "Search Page Title Mismatch");
		System.out.println("Exit Search Functionality");
  }
  
  // Update
  @Test(priority=4)
  public void verifyWorkerUpdate() throws Exception  {
	  WorkerPage wp = new WorkerPage(driver);
		wp.doWorkerupdate();
		//util.waitforpagetitle(Constant.knownname);
		//Assert.assertEquals(driver.getTitle(), Constant.knownname);
		System.out.println("Updated the selected Worker");
		System.out.println("Exit Update Functionality");
  }
  
  //View
  @Test(priority=5)
  public void verifyWorkerView() throws Exception  {
	  WorkerPage wp = new WorkerPage(driver);
	    wp.doWorkerdash();
		wp.doWorkerview();
		//Assert.assertEquals(driver.getTitle(), Constant.knownname);
		System.out.println("View the selected Worker");
		System.out.println("Exit View Functionality");
	  }
  
      @Test(priority=6)
 public void verifyWorkerDelete() throws Exception  {
	  WorkerPage wp = new WorkerPage(driver);
  	    wp.doWorkerdash();
		wp.doWorkerSearch();
		wp.doWorkerdelete();
		System.out.println("Error on Worker Delete application");
		System.out.println("Delete the selected Worker");
//		//wp.doWorkerSearch();
//		System.out.println("Exit Delete Functionality");
 }
}
