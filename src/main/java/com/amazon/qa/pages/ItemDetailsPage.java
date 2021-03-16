package com.amazon.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class ItemDetailsPage extends TestBase {

	public ItemDetailsPage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@FindBy(xpath="//Input[@id='buy-now-button']")
	WebElement buyNowButton;
	
	
	public PaymentPage clickBuyNow() throws IOException
	{
		buyNowButton.click();
		return new PaymentPage();
		
	}
	
	
	
	

}
