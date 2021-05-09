package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.constant.Constant;
import com.qa.page.CreateWorkerPage;
import com.qa.page.LoginPage;
import com.qa.page.WorkerPage;

public class CreateWorkerTest extends BaseTest {
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
	
/**
 * Navigate to Add Worker Page
 * @throws Exception
 */
	@Test(priority=3)
	public void verifyAddWorker() throws Exception  {
	  CreateWorkerPage cwp = new CreateWorkerPage(driver);
		cwp.doWorkerpage();
		System.out.println("Create Worker Page");
	}
	
	@Test(priority=4)
	public void verifyAddWorkerdata() throws Exception  {
	  CreateWorkerPage cwp = new CreateWorkerPage(driver);
		cwp.doWorkercreatedata();
		System.out.println("Exit Create Worker Page");
	}
	
}