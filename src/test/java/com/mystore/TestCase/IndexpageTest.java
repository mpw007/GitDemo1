package com.mystore.TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.Base.BaseClass;
import com.mystore.PageObjectModel.IndexPage;

public class IndexpageTest extends BaseClass {
	IndexPage ip=new IndexPage();
	@BeforeMethod
	public void launch() {
	launchApp();
	}
	@AfterMethod
		public void tearDown() {
		driver.quit();
	}
	@Test
	public void verifyLogo() {
		IndexPage ip=new IndexPage();
		boolean result=ip.validateLogo();
		Assert.assertTrue(result);
		
	}
	@Test
	public void verifyTitle() {
		String actualTitle=ip.validateTitle();
		String expectedTitle="My Store";
		Assert.assertEquals(actualTitle, expectedTitle,"actual and expected  match");
	}
	
	}
