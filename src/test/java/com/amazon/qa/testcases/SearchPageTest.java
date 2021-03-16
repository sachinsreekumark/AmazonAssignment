package com.amazon.qa.testcases;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.SignInPage;
import com.amazon.qa.pages.SearchPage;
import com.amazon.qa.pages.ItemDetailsPage;

public class SearchPageTest extends TestBase{

	HomePage HomePage;
	SignInPage SignInPage;
	SearchPage SearchPage;
	ItemDetailsPage ItemDetailsPage;
	
	public SearchPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	  public void setup() throws IOException, InterruptedException 
	  {
		initialization();
		HomePage= new HomePage();
		SignInPage=HomePage.goToLoginPage();
		SearchPage=SignInPage.login();
	  }
	
	@Test
	public void searchAndSelectItem() throws IOException
	{
		ItemDetailsPage=SearchPage.searchItemAndClick();
	}
	

	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	
	
}
