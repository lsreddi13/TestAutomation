package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RetryTest {
	WebDriver driver;

	@Parameters("url")
	@BeforeMethod
	public void setUp(@Optional("http://www.google.com") String url) throws InterruptedException {
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

	@Test(priority = 1, enabled = true)
	public void testLogin() throws InterruptedException {

		String title = driver.getTitle(); // get the page title.
		System.out.println("Page title Print : " + title);
		Assert.assertEquals(title, "Facebook – log in or sign up", "Page title does not match."); 
		
		WebElement createPageLink = driver.findElement(By.linkText("Create a Page"));
		System.out.println("Verify link is displayed : "+createPageLink.isDisplayed());
		Assert.assertTrue(createPageLink.isDisplayed());
//		Assert.assertFalse(createPageLink.isDisplayed());
//		Assert.assertNotEquals("" , "", "");
//		Assert.assertSame(actual, expected);
//		Assert.assertNotSame(actual, expected);
//		Assert.assertNotNull(object);
//		Assert.assertThrows(runnable);
		
		if(createPageLink.isDisplayed()) {
			String createpageLink_url = createPageLink.getAttribute("href");
			String expected_url = "pages/create/?ref_type=registration_form";
			String failure_desc = "Create page Link does not match.";
			Assert.assertEquals(createpageLink_url, driver.getCurrentUrl()+expected_url, failure_desc);
			System.out.println("dfdafsd");
			createPageLink.click();
		}else
		{
			System.out.println("Create Page link is not available.");
		}
		
		
	}

	

	

	@AfterMethod
	public void tearDown() throws InterruptedException {
		System.out.println("This is After method.");
		

		// close browser
		driver.close();
		System.out.println("Am going to close the browser.");
	}

}
