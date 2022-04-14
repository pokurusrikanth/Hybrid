package com.store.pageobjects;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.Base;

public class IndexPage extends Base{

	
	@FindBy(xpath = "//a[@class='login']")
	WebElement signinbutton;
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	WebElement logo;
	
	@FindBy(id="search_query_top")
	WebElement search_input_box;
	
	@FindBy(name="submit_search")
	WebElement searchbutton;
	
	
	
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public Login click_on_signin() {
		Action act=new Action();
		act.click(driver, signinbutton);
		return new Login();
	}
	
	public boolean Validate_Logo() {
		Action act=new Action();
		return act.isDisplayed(driver, logo);
	}
	
	public String getMystoretitle() {
		String mystoretitle=driver.getTitle();
		return mystoretitle;
	}
	
	public SearchResultPage searchproduct(String productName) {
		Action act=new Action();
		act.type(searchbutton, productName);
		act.click(driver, searchbutton);
		return new SearchResultPage();
		
		
		
		
		
		
	}
	
}
