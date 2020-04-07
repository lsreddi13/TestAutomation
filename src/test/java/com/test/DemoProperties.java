package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoProperties {

	WebDriver driver;
	
	@Test
	public void test() throws FileNotFoundException {
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("");
		
		String driver_path = ".\\BrowserDrivers\\chromedriver.exe";
		String url = "http://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", driver_path);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get(url); // use paramter
		
		driver.findElement(By.id("")).sendKeys("sasidhar@yahoo");
		
		driver.findElement(By.id("")).sendKeys("password123");
		driver.findElement(By.id("")).click();
		

	}
}
