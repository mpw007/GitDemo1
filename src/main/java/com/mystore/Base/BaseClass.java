package com.mystore.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	@BeforeTest 
	public void loadConfig() throws Exception {
		prop=new Properties();		
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\config.properties");
		prop.load(fis);
	}
	public void launchApp() {
		String browsername=prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
			//for maximize
		driver.manage().window().maximize();
		// for delete cookies
		driver.manage().deleteAllCookies();
		// for implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//launch Url
		driver.get(prop.getProperty("url"));
	}
	

}
