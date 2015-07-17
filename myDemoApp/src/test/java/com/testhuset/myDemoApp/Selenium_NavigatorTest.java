package com.testhuset.myDemoApp;

import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_NavigatorTest {

	@Test 
	public void startWebDriver(){
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://seleniumsimplified.com");
		Assert.assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
		driver.close();
	} 
}
