package testhuset.com.selenium_maven_eclipse_demo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;


@SuppressWarnings("deprecation")
public class MyFirstTest {
	
	@Test
	public void startWebDriver(){
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://seleniumsimplified.com");	
		Assert.assertTrue("Title should start differently", 
				driver.getTitle().startsWith("Selenium Simplified"));
		driver.close();
	}

}
