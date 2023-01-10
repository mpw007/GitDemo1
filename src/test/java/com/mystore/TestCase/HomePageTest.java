package com.mystore.TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mystore.Base.BaseClass;
import com.mystore.PageObjectModel.HomePage;
import com.mystore.PageObjectModel.IndexPage;
import com.mystore.PageObjectModel.LoginPage;

public class HomePageTest  extends BaseClass{
	IndexPage ip=new IndexPage();
	HomePage hp;
	LoginPage lp;
	@BeforeMethod
	public void launch() {
	launchApp();
	}
	@AfterMethod
		public void tearDown() {
		driver.quit();
	}
	
	
		
	
	@Test
	void verifyTitle() throws Exception {
		ip=new IndexPage();
		 LoginPage lp=new LoginPage();
	HomePage hp=new HomePage();
		lp.clickOnLogin();
		boolean result=hp.verifyhistory();
		Assert.assertTrue(result);
		boolean reult1=hp.verifywishlist();
		Assert.assertTrue(reult1);
		
		String acturl=hp.getcurrenturl();
		Assert.assertEquals(acturl, "http://automationpractice.com/index.php?controller=my-account");
		
	}
	
	}

