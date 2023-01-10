package com.mystore.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mystore.Base.BaseClass;

public class CreateAccount extends BaseClass {
	@FindBy(xpath = "//a[@class='login']")
	WebElement login;
	@FindBy(id = "email_create")
	WebElement emailcreate;
	@FindBy(id = "SubmitCreate")
	WebElement createaccount;
	@FindBy(xpath = "//h1[@class='page-heading']")
	WebElement pageHead;

	// user information
	@FindBy(id = "id_gender1")
	WebElement gender;
	@FindBy(id = "customer_firstname")
	WebElement firstName;
	@FindBy(id = "customer_lastname")
	WebElement lastName;
	@FindBy(id = "passwd")
	WebElement password;
	@FindBy(id = "days")
	WebElement day;
	@FindBy(id = "months")
	WebElement month;
	@FindBy(id = "years")
	WebElement year;
	@FindBy(xpath = "//input[@id='newsletter']")
	WebElement newsletr;
	@FindBy(id = "optin")
	WebElement opt;
	@FindBy(id = "firstname")
	WebElement addfname;
	@FindBy(id = "lastname")
	WebElement addlastfname;
	@FindBy(id = "company")
	WebElement compan;
	@FindBy(id = "address1")
	WebElement add1;
	@FindBy(id = "address2")
	WebElement add2;
	@FindBy(id = "city")
	WebElement cite;
	@FindBy(id = "id_state")
	WebElement state;
	@FindBy(id = "postcode")
	WebElement poscode;

	@FindBy(id = "id_country")
	WebElement country;
	@FindBy(id = "other")
	WebElement othe;
	@FindBy(id = "phone")
	WebElement phon;
	@FindBy(id = "phone_mobile")
	WebElement mobile;
	@FindBy(id = "alias")
	WebElement ali;
	@FindBy(id = "submitAccount")
	WebElement button;

	public CreateAccount() {
		PageFactory.initElements(driver, this);
	}

	public String validateHeading() {
		String str = pageHead.getText();
		return str;
	}

	public void creatNewAccount() throws Exception {

		login.click();
		emailcreate.sendKeys("bbb@xyz.com");
		createaccount.click();
		gender.click();
		firstName.sendKeys("milind");
		lastName.sendKeys("Wasn");
		password.sendKeys("abcd");
		Select dy = new Select(day);
		dy.selectByValue("24");
		Select mon = new Select(month);
		mon.selectByIndex(5);
		Select yr = new Select(year);
		yr.selectByValue("1981");

		newsletr.click();
		opt.click();
		addfname.sendKeys("abcd");
		addlastfname.sendKeys("abcd");
		compan.sendKeys("xyz");
		add1.sendKeys("abab");
		add2.sendKeys("abab");
		cite.sendKeys("ass");
		state.click();
		poscode.sendKeys("11111");
		Select cn = new Select(country);
		cn.selectByIndex(6);
		othe.sendKeys("aasd");
		phon.sendKeys("1234567897");
		mobile.sendKeys("1234567897");
		ali.sendKeys("asdd");

		button.submit();

	}

}
