package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptParamDemo {
	WebDriver driver;
	
	@Parameters("url")
	@Test
	public void test(@Optional("http://www.msn.com") String url) throws InterruptedException {
		
		System.out.println("This is Before Method.");
		String driver_path = ".\\BrowserDrivers\\chromedriver.exe";
//		String url = "http://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", driver_path);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get(url); // use paramter

		Thread.sleep(5000);
	}
	

}
