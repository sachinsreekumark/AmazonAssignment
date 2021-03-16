package com.amazon.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;

import java.io.IOException;






import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.SignInPage;

public class HomePageTest extends TestBase{

	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	HomePage HomePage;
	SignInPage SignInPage;
	
	
	
	@BeforeMethod
	  public void setup() throws IOException 
	  {
		initialization();
		HomePage= new HomePage();
	  
	  }
	
	
	@Test
	public void homePageTitleTest()
	{
		String title=HomePage.validateHomePageTitle();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	
	@Test
	public void loginButtonValidationTest()
	{
		boolean check=HomePage.validateLoginButton();
		Assert.assertTrue(check);
	}
	
	@Test
	public void gotoLoginPageTest() throws IOException
	{
		SignInPage=HomePage.goToLoginPage();
	}
	

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
