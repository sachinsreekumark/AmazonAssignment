package com.amazon.qa.pages;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.util.TestUtil;

public class PaymentPage extends TestBase{

	public PaymentPage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//h1[text()='Select a payment method']")
	WebElement selectPaymentMethodText;
	
	@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
	WebElement addCardRadioButton;
	
	@FindBy(xpath="//input[@name='ppw-accountHolderName']")
	WebElement cardHolderName;
	
	@FindBy(xpath="//input[@name='addCreditCardNumber']")
	WebElement cardNumber;
	

	@FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	WebElement addYourCardButton;
	
	@FindBy(xpath="//span[text()='Card number is not correct.']")
	WebElement cardNumberIncorrect;
	

	public String verifyPaymentPageText() throws IOException
	{
	
	 return selectPaymentMethodText.getText();
		
	}
	
	public String addIncorrectCardDetails() throws IOException
	{
		Map<String, String> map = TestUtil.getAmazonTestData();
		
		addCardRadioButton.click();
		cardHolderName.clear();
		cardHolderName.sendKeys(map.get("Card_Name"));
		cardNumber.clear();
		cardNumber.sendKeys(map.get("Card_Number"));
		addYourCardButton.click();
		String errorText;
		
		if (cardNumberIncorrect.isDisplayed())
		{
			errorText=cardNumberIncorrect.getText();
		}
		else
		{
			errorText="No Error Message Found";
		}
		
		return errorText;
	 
		
	}
	
			
			
	
}
