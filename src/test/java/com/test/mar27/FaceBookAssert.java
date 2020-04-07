package com.test.mar27;

import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.logs;

public class FaceBookAssert {
	WebDriver driver;

	Logger log = Logger.getLogger(logs.class);

	@BeforeMethod
	public void setUp() throws InterruptedException {

		String driver_path = ".\\BrowserDrivers\\chromedriver.exe";
		String url = "http://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", driver_path);
		ChromeOptions options = new ChromeOptions();

		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		log.info("Browser launched.");
		driver.get(url); // use paramter
		log.info("Application launced");
		Thread.sleep(5000);

	}

	@Test(priority = 1, enabled = true)
	public void testLogin() throws InterruptedException {
		try {

			String title = driver.getTitle(); // get the page title.
			System.out.println("Page title Print : " + title);
			Assert.assertEquals(title, "Facebook – log in or sign up", "Page title does not match.");
			log.info("Page title matched");
			WebElement createPageLink = driver.findElement(By.linkText("Create a Page"));
			System.out.println("Verify link is displayed : " + createPageLink.isDisplayed());
			Assert.assertTrue(createPageLink.isDisplayed());

			if (createPageLink.isDisplayed()) {
				String createpageLink_url = createPageLink.getAttribute("href");
				String expected_url = "pages/create/?ref_type=registration_form";
				String failure_desc = "Create page Link does not match.";
				Assert.assertEquals(createpageLink_url, driver.getCurrentUrl() + expected_url, failure_desc);
				log.info("links matched");
				createPageLink.click();
			} 

			log.info("Selected the source.");
			// code to select the souce.

			log.info("Selected the destination.");
			// code to select destination.

			log.info("Selected journey date.");
			// code

			log.info("Search button clicked.");

			// code
			int buscount = 20;
			log.info("results displayed nuber "+buscount);
			driver.findElement(By.xpath("ddd")).click();
			// code
			log.info("filter opened. with low to high fare.");
			// code

			log.info("bus selected.");

			log.info("seat selected.");

			System.out.println("click book button");

			System.out.println("Enter the passenger details");

			System.out.println("go to payment section");

			System.out.println("Complete the payment process.");

		} catch (NullPointerException e) {
			// TODO: handle exception
			log.error("driver not available", e);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			log.error("element does not displayed", e);
		}catch (Exception e) {
			// TODO: handle exception
			log.error("exception..................", e);
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
