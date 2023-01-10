package com.mystore.TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.Base.BaseClass;
import com.mystore.PageObjectModel.CreateAccount;
import com.mystore.PageObjectModel.IndexPage;
import com.mystore.PageObjectModel.LoginPage;

public class CreateAccountTest extends BaseClass {
	private IndexPage ip;
	private LoginPage lgp;
	private CreateAccount cr;

	@BeforeMethod
	public void setup() {
		launchApp();
	}

	@AfterMethod

	public void teardum() {
		driver.quit();

	}

	@Test
	public void createAccount() throws Exception {
		ip = new IndexPage();
		lgp = new LoginPage();
		cr = new CreateAccount();
		cr.creatNewAccount();

	}

	@Test
	public void validHead() throws Exception {
		ip = new IndexPage();
		lgp = new LoginPage();
		cr = new CreateAccount();
		String actualHead = cr.validateHeading();
		Assert.assertEquals(actualHead, "CREATE AN ACCOUNT", "actual and expec heading are same");

	}

}
