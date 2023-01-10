package com.mystore.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.Base.BaseClass;

public class LoginPage  extends BaseClass{
	@FindBy(xpath="//a[@class='login']")
	WebElement login;
	
	@FindBy(id="email")
	WebElement  username;
	
	@FindBy(id="passwd")
	WebElement  userpassword;
	
	@FindBy(id="SubmitLogin")
	WebElement  signIn;
	
	@FindBy(id="email_create")
	WebElement emailcreate;
	
	@FindBy(id="SubmitCreate")
	WebElement createaccount;
	@FindBy(xpath="//a[@class='account']")
	WebElement loginname;
	
	public LoginPage(){
		PageFactory.initElements(driver,this);
	}
	public void clickOnLogin() throws Exception {
		Thread.sleep(3000);
		login.click();
		username.sendKeys(prop.getProperty("username"));
		userpassword.sendKeys(prop.getProperty("password"));
		signIn.click();
		Thread.sleep(3000);
		
	}
	
	public String verifyLoginUser()
	{
		String loginuser=loginname.getText();
		return loginuser;
	}
	
	

}

