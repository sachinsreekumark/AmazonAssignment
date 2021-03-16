package com.amazon.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase {

	
	
	

	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement loginButton;

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchBar;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement searchButton;
	
	
	public HomePage() throws IOException  {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	public String validateHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateLoginButton()
	{
		return loginButton.isDisplayed();
	}
	
	public SignInPage goToLoginPage() throws IOException
	{
		loginButton.click();
		return new SignInPage();
	}
	
	public void searchItem(String itemName)
	{
		searchBar.sendKeys(itemName);
		searchButton.click();
	}
}
