package com.amazon.qa.pages;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.util.TestUtil;

public class SearchPage extends TestBase {

	public SearchPage() throws IOException 
	{
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchBar;

	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement searchButton;
	

	
	@FindBy(xpath="//span[contains(text(),'Samsung Galaxy M31 (Ocean Blue, 6GB RAM, 128GB Storage)')]")
	WebElement mobile;
	
	@FindBy(xpath="//Input[@id='buy-now-button']")
	WebElement buyNowButton;
	
	
	@FindBy(xpath="//a[text()='Amazon Pay']")
	WebElement amazonPay;
	
	public ItemDetailsPage searchItemAndClick() throws IOException
	{
		Map<String, String> map = TestUtil.getAmazonTestData();	
		searchBar.sendKeys(map.get("Product_Name"));
		searchButton.click();
		
		if (mobile.isDisplayed())
		{
			mobile.click();
			
		}
		
		
		
		return new ItemDetailsPage();
		
		
	}
	
		
	

}
