package com.PWB_QA.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PWB_QA.baseclass.Baseclass;

//import Academy.HomePage;

public class LoginPage extends com.PWB_QA.baseclass.Baseclass {

	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}

	//object repository or page factory
	@FindBy(id="ContentPlaceHolder1_txtUserName")
	WebElement txtUsername;
	
	@FindBy(id="ContentPlaceHolder1_txtPassword")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_CaptchaCodeTextBox']")
	WebElement Captcha;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_btnLogin']")
	WebElement SignInButton;
	
	public String validateloginPageTitle(){
		return driver.getTitle();
		
	}
	
	public HomePage login(String un,String pwd) throws Exception{
		txtUsername.sendKeys(un);
		txtPassword.sendKeys(pwd);
	    SignInButton.click();
		return new HomePage(); // navigating to home page once login was success
	    	   
	}
}
