package com.qa.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.constant.Constant;
import com.qa.utility.Elementutil;

public class WorkerPage {
	
	WebDriver driver;
	Elementutil util;
	
	//Identify the Header -Worker
	@FindBy(how=How.XPATH, using = "//a[text()='Workers']")	private WebElement headwork;
	
	//Identify TextBox for search
	@FindBy(how=How.NAME, using ="WorkerSearch[first_name]") private WebElement wfnamefld;
	@FindBy(how=How.XPATH, using ="//button[text()='Search']") private WebElement searchbtn;
	
	//Identify TextBox for update
	@FindBy(how=How.XPATH, using ="//table[@class='table table-striped table-bordered']/tbody/tr[1]/td[8]/a[2]")
	private WebElement updatebtn;
	@FindBy(how=How.XPATH, using = "//input[@name='Worker[ni_number]']") private WebElement nilno;
	@FindBy(how=How.XPATH, using = "//input[@name='Worker[known]']") private WebElement kname;
	@FindBy(how=How.XPATH, using ="//button[text()='Next']") private WebElement nextbtn;
	@FindBy(how=How.XPATH, using = "//input[@name='Worker[roll_no]']") private WebElement rollno;
	@FindBy(how=How.XPATH, using = "//input[@name='Worker[bank_address]']") private WebElement bankadd;
	@FindBy(how=How.XPATH, using ="//button[text()='Save']") private WebElement savebtn;
	@FindBy(how=How.NAME, using ="WorkerSearch[ni_number]") private WebElement wnifld;
	
	//Identify TextBox for view
	@FindBy(how=How.XPATH, using ="//table[@class='table table-striped table-bordered']/tbody/tr[1]/td[8]/a[1]") 
	private WebElement viewbtn;
	
	//Identify TextBox for Delete
	@FindBy(how=How.XPATH, using ="//table[@class='table table-striped table-bordered']/tbody/tr[1]/td[8]/a[3]") 
	private WebElement deletebtn;
	public WorkerPage(WebDriver driver)
	{
		this.driver=driver;
		util=new Elementutil(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Worker enter Functionality
		public void doWorkerdash() throws Exception {
			System.out.println("Worker Dashboard");
			Thread.sleep(2000);
	// Calling Methods from ElementUtil class
			util.waitvisibility(headwork);
			headwork.click();			
			}		
		
	//Search Functionality
	public void doWorkerSearch() throws Exception {
		System.out.println("Worker Search Functionality");
		Thread.sleep(2000);
		util.doSendkey(wfnamefld, Constant.workerLastname);
		util.doClick(searchbtn);
		Thread.sleep(2000);
		}
	
	//Update Functionality
	public void doWorkerupdate() throws Exception {
		System.out.println("Worker Update Functionality");
		util.doClick(updatebtn);
		Thread.sleep(4000);
		util.doSendkey(nilno, Constant.nilno);
		//util.waitforlocating(By );
		util.mousescrolldown();
		util.doSendkey(kname,Constant.knownname);
		util.waitvisibility(nextbtn);
		Thread.sleep(2000);
		util.doClick(nextbtn);
		util.waitvisibility(rollno);
		Thread.sleep(2000);
		util.doSendkey(rollno, Constant.rollno);
		util.doSendkey(bankadd, Constant.bankadd);
		Thread.sleep(2000);
		util.mousescrolldown();
		util.waitvisibility(savebtn);
		util.doClick(savebtn);
			}
	
	//View Functionality
	public void doWorkerview() throws Exception {
		System.out.println("Worker View Functionality");
		Thread.sleep(2000);
		util.waitvisibility(wnifld);
		util.doSendkey(wnifld, Constant.nilno);
		util.waitvisibility(searchbtn);
		util.doClick(searchbtn);
		Thread.sleep(2000);
		util.waitvisibility(viewbtn);
		util.doClick(viewbtn);
		Thread.sleep(2000);		
	}
	public void doWorkerdelete() throws Exception {
		System.out.println("Worker Delete Functionality");
		util.doClick(deletebtn);
		Thread.sleep(2000);
		util.alerthandle();
//		util.waitvisibility(wnifld);
//		util.doSendkey(wnifld, Constant.nilno);
//		util.waitvisibility(searchbtn);
//		util.doClick(searchbtn);
//		Thread.sleep(2000);
//		util.waitvisibility(viewbtn);
//		util.doClick(viewbtn);
//		Thread.sleep(2000);		
	}


}
			

