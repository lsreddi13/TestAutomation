package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Base {

	public static WebDriver driver;

	@BeforeTest
	public void Base() throws IOException {

		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(".//src//main//resources//config.properties");
		p.load(fis);
		String Browser = p.getProperty("Brw");
		switch (Browser) {
		case "Chrome":
			String driver_path = ".//BrowserDrivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driver_path);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			driver.get("http://www.google.com");
			break;
		case "Firefox":
			String driver_path2 = ".\\BrowserDrivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driver_path2);
			ChromeOptions options3 = new ChromeOptions();
			options3.addArguments("start-maximized");
			options3.addArguments("--disable-notifications");
			driver = new ChromeDriver(options3);
			break;

		default:

			break;
		}

	}
}
