package com.store.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.Base;

public class Address extends Base{

	
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	WebElement proceedToCheckOut;
	
	
	public Address() {
		PageFactory.initElements(driver, proceedToCheckOut);
	}
	
	public Shipping clickonCheckout() {
		Action act=new Action();
		act.click(driver, proceedToCheckOut);
		return new Shipping();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
