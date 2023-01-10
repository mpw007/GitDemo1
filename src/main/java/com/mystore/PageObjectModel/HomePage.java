package com.mystore.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.Base.BaseClass;

public class HomePage extends BaseClass {
	@FindBy(xpath="//span[text()='Order history and details']")
	WebElement orderhistory;
	
	@FindBy(xpath="//span[text()='My wishlists']")
	WebElement wishlist;
	
	public void homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyhistory() {
		return orderhistory.isDisplayed();
	}
	
	public boolean verifywishlist() {
		return wishlist.isDisplayed();
	}
	
	public String getcurrenturl() {
		String url=driver.getCurrentUrl();
		return url;
	}

}
