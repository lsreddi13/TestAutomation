package com.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTestDemo2 {
	WebDriver driver;

	@Test()
	public void testLogin()  {
		
		System.out.println("This is Before Method.");
		String driver_path = ".\\BrowserDrivers\\chromedriver.exe";
		String url = "http://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", driver_path);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get(url); // use paramter
		assertEquals(driver.getTitle(), "Login");
		
		
		
	}

}
