package com.mystore.TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mystore.Base.BaseClass;
import com.mystore.PageObjectModel.IndexPage;
import com.mystore.PageObjectModel.LoginPage;

public class LoginPageTest extends BaseClass{
	private IndexPage ip;
	private LoginPage lgp;
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	@AfterMethod
	
	public void teardum() {
		driver.quit();
		
	}
	@Test
	public void login() throws Exception {
		ip=new IndexPage();
		lgp=new LoginPage();
		lgp.clickOnLogin();;
		
	}
	@Test
	public void validLoginUser() throws Exception {
		ip=new IndexPage();
		lgp=new LoginPage();
		lgp.clickOnLogin();
		String actUser=lgp.verifyLoginUser();
		Assert.assertEquals(actUser, "Admin xyz","Verfiyed login user");
	}
	

}
