package com.store.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.Base;

public class Login extends Base{

	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="passwd")
	WebElement password;
	
	
	
	@FindBy(id="SubmitLogin")
	WebElement signinbtn;
	
	
	@FindBy(id="email_create")
	WebElement emailfornewaccount;
	
	@FindBy(name ="SubmitCreate")
	WebElement createaccountbtn;
	
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	
	public HomePage login(String uname,String pwd) {
		
		Action act =new Action();
		act.type(username, uname);
		act.type(password, pwd);
		act.click(driver, signinbtn);
		return new HomePage();

	}
	
	public Accountcreation createNewAccount(String newemail) {
		Action act =new Action();
		act.type(emailfornewaccount, newemail);
		act.click(driver, emailfornewaccount);
		
		return new Accountcreation();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
