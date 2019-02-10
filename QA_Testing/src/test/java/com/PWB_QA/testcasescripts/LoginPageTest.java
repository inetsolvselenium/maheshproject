package com.PWB_QA.testcasescripts;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PWB_QA.pages.Dashboardpage;
import com.PWB_QA.pages.LoginPage;
import com.PWB_QA.baseclass.Baseclass;
import com.PWB_QA.util.Testutil;

//import Academy.HomePage;

public class LoginPageTest extends com.PWB_QA.baseclass.Baseclass {

	
	com.PWB_QA.pages.HomePage hp;
	LoginPage lp;
	private String loginpageimg;
   
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void setup() throws Exception{
		
		initialization();
		lp=new LoginPage();		//login page initialization
		
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title=lp.validateloginPageTitle();
		Assert.assertEquals(title, "eLearning- HebeOn Technologies");
		
	}
	

	@Test(priority=2)
	public void LoginTest() throws Exception{
		
		takescreenshot("loginpageimg");
		hp=lp.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	

	@AfterTest
	public void teardown(){
		//driver.quit();
	}
}
