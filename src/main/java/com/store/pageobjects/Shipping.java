package com.store.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.Base;

public class Shipping extends Base {

	
	
	@FindBy(id="cgv")
	WebElement terms;
	
	
	
	@FindBy(xpath = "//button/span[contains(text(),'Proceed to checkout']")
	WebElement proceedtocheckoutbutton;
	
	public Shipping() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void checkTheTerms() {
		Action act=new Action();
		act.click(driver, terms);
	}
	
	
	public Paymentpage clickonproceedtocheckout() {
		Action act=new Action();
		act.click(driver, proceedtocheckoutbutton);
		return new Paymentpage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
