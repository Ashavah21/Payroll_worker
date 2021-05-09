package com.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.constant.Constant;
import com.qa.utility.Elementutil;

public class CreateWorkerPage {
	WebDriver driver;
	Elementutil util;
	
	//Identify the fields in Create Worker page
	@FindBy(how=How.XPATH, using = "//a[text()='Create Worker']")	private WebElement createworker;
	@FindBy(how=How.ID, using ="worker-gender") private WebElement gender;
	@FindBy(how=How.ID, using ="worker-branch_id") private WebElement branch;
	@FindBy(how=How.ID, using ="worker-division_id") private WebElement division;
	@FindBy(how=How.ID, using ="worker-first_name") private WebElement wfname;
	@FindBy(how=How.ID, using ="worker-last_name") private WebElement wlname;
	@FindBy(how=How.ID, using ="worker-dob") private WebElement wdob;
	@FindBy(how=How.ID, using ="worker-employment_type") private WebElement wemptype;
	@FindBy(how=How.ID, using ="worker-payslip_method") private WebElement wpay;
	@FindBy(how=How.ID, using ="worker-address1") private WebElement wadd;
	@FindBy(how=How.ID, using ="worker-phone") private WebElement wphone;	
	@FindBy(how=How.ID, using ="worker-ni_number") private WebElement wnino;
	@FindBy(how=How.ID, using ="worker-postcode") private WebElement wpcode;
	@FindBy(how=How.ID, using ="worker-email") private WebElement wemail;
	@FindBy(how=How.XPATH, using ="//button[text()='Next']") private WebElement nextbtn;
	@FindBy(how=How.ID, using ="worker-payment_method") private WebElement wpaym;
	@FindBy(how=How.ID, using ="worker-start_date") private WebElement wsdate;
	@FindBy(how=How.ID, using ="worker-ac_name") private WebElement wacname;
	@FindBy(how=How.ID, using ="worker-ac_no") private WebElement wacno;
	@FindBy(how=How.ID, using ="worker-sort_code") private WebElement waccode;
	@FindBy(how=How.XPATH, using ="//button[text()='Save']") private WebElement savebtn;


	public CreateWorkerPage(WebDriver driver)
	{
		this.driver=driver;
		util=new Elementutil(driver);
		PageFactory.initElements(driver, this);
	}
	
	//CreateWorker Functionality
	 public void doWorkerpage() throws Exception {
		System.out.println("Create Worker Dashboard");
		Thread.sleep(2000);
		util.waitvisibility(createworker);
		createworker.click();			
		}	
	//Enter Worker data Functionality
		 public void doWorkercreatedata() throws Exception {
			System.out.println("Please Enter Worker Basic Data");
			Thread.sleep(2000);
			util.waitvisibility(gender);
			util.dropdownvalueselector(gender, "female");	
			util.dropdownvalueselector(branch, "1");	
			util.dropdownvalueselector(division, "1");	
			util.doSendkey(wfname, "T104");
			util.doSendkey(wlname, "W4");
			util.doSendkey(wdob, "28-04-2000");
			util.dropdownvalueselector(wemptype, "contractor");
			util.dropdownvalueselector(wpay, "electronic");
			util.doSendkey(wadd, "Address Details");
			util.doSendkey(wphone, "9898989898");
			util.doSendkey(wnino, "NI104");
			util.doSendkey(wpcode, "54543");
			util.doSendkey(wemail, "test100@test100.com");
			util.doClick(nextbtn);
			Thread.sleep(2000);
			System.out.println("Please Enter Worker Account  Data");
			util.waitvisibility(wpaym);
			util.dropdownvalueselector(wpaym, "BACS");
			util.waitvisibility(wsdate);
			util.doSendkey(wsdate, "08-05-2020");
			Thread.sleep(2000);
			util.waitvisibility(wacname);
			util.doSendkey(wacname, "ACNAMETEST100");
			util.doSendkey(wacno, "1044");
			util.doSendkey(waccode, "code104");
			Thread.sleep(2000);
			util.waitvisibility(savebtn);
			util.mousescrolldown();
			util.doClick(savebtn);
			}	
			 
}
