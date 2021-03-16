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
import com.amazon.qa.pages.PaymentPage;
import com.amazon.qa.util.TestUtil;

public class ItemDetailsPageTest extends TestBase {

	HomePage HomePage;
	SignInPage SignInPage;
	SearchPage SearchPage;
	ItemDetailsPage ItemDetailsPage;
	PaymentPage PaymentPage;
	TestUtil TestUtil;
	
	public ItemDetailsPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	  public void setup() throws IOException, InterruptedException 
	  {
		initialization();
		TestUtil=new TestUtil();
		HomePage= new HomePage();
		SignInPage=HomePage.goToLoginPage();
		SearchPage=SignInPage.login();
		ItemDetailsPage=SearchPage.searchItemAndClick();
	  }
	
	@Test
	public void buyItem() throws IOException, InterruptedException
	{
		Thread.sleep(5000);
		TestUtil.switchToNewTab();
		PaymentPage=ItemDetailsPage.clickBuyNow();
		
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	

}
