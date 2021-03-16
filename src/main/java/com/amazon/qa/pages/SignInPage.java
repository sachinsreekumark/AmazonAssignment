package com.amazon.qa.pages;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.util.TestUtil;


public class SignInPage extends TestBase {

	public SignInPage() throws IOException 
	{
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@name='email']")
	WebElement emailID;

	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continueButton;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signInButton;
	
	
	
	public SearchPage login() throws IOException, InterruptedException
	{
		Map<String, String> map = TestUtil.getAmazonTestData();
		emailID.sendKeys(map.get("User_ID"));
		continueButton.click();
		password.sendKeys(map.get("Password"));
		signInButton.click();
		if (driver.findElements(By.xpath(prop.getProperty("refreshLink"))).size()>0)
		{
			Thread.sleep(5000);
			driver.findElement(By.xpath(prop.getProperty("refreshLink"))).click();
			
		}
		return new SearchPage();
		
	}
	
	
	
	public String validateSignInPageTitle()
	{
		return driver.getTitle();
	}
	
}
