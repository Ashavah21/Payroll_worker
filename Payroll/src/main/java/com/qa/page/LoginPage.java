package com.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.Elementutil;

public class LoginPage {
	WebDriver driver;
	Elementutil util;
	
	//@FindBy(how=How.XPATH,using="//input[@id='loginform-username']")
   //@FindBy(how=How.ID,using = "LoginForm[username]")
//	
//	@FindBy(how=How.XPATH,using="//input[@id='loginform-password']")
//	private WebElement passwordfld;
	
//	@FindBy(how=How.XPATH,using="//p[text()='Username cannot be blank.']//preceding::input[1]")
//	private WebElement usernamefld;
	
	@FindBy(how=How.NAME,using ="LoginForm[username]")
	private WebElement usernamefld;
	@FindBy(how=How.NAME,using ="LoginForm[password]")
	private WebElement passwordfld;
		
	@FindBy(how=How.XPATH,using ="//button[@name='login-button']")
	private WebElement submitbtn;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		util=new Elementutil(driver);
		PageFactory.initElements(driver, this);
	}

	public void doLogin(String username, String password) {
		System.out.println("Please Enter Credentials");
//	usernamefld.sendKeys(username);
//    passwordfld.sendKeys(password);
//    submitbtn.click();
		util.doSendkey(usernamefld, username);
		util.doSendkey(passwordfld, password);
		util.doClick(submitbtn);
		
		
	}

}