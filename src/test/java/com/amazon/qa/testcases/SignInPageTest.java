package com.amazon.qa.testcases;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.SignInPage;
import com.amazon.qa.pages.SearchPage;

public class SignInPageTest extends TestBase{

	HomePage HomePage;
	SignInPage SignInPage;
	SearchPage SearchPage;
	
	public SignInPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	  public void setup() throws IOException 
	  {
		initialization();
		HomePage= new HomePage();
		SignInPage=HomePage.goToLoginPage();
	  }
	
	@Test
	public void verifySignInPageTitle()
	{
		String SignInTitle=SignInPage.validateSignInPageTitle();
		
		Assert.assertEquals(SignInTitle,"Amazon Sign In");
	}
	
	@Test
	public void loginInToAmazon() throws IOException, InterruptedException
	{
		SearchPage=SignInPage.login();
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
