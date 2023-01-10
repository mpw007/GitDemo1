package com.mystore.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.Base.BaseClass;

public class IndexPage extends BaseClass {

	@FindBy(xpath = "//img[@class='logo img-responsive']")
	WebElement myStoreLogo;

	@FindBy(id = "search_query_top")
	WebElement serchProductBox;

	public IndexPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validateLogo() {

		return myStoreLogo.isDisplayed();
	}

	public String validateTitle() {
		String storeTitle = driver.getTitle();
		return storeTitle;

	}

}
