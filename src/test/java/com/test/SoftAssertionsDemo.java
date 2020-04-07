package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//this is soft assert demo class.
/*
 * How to use SoftAssertions
 * How to use Hard Assertions
 * How to use .assertAll() and benifits.
 * 
 */
public class SoftAssertionsDemo {
	WebDriver driver;


	@Parameters("name")
	@Test
	public void login() {
		// open Browser
		/*
		 * String driver_path = ".\\BrowserDrivers\\chromedriver.exe"; String url =
		 * "http://www.facebook.com"; System.setProperty("webdriver.chrome.driver",
		 * driver_path); ChromeOptions options = new ChromeOptions();
		 * options.addArguments("start-maximized");
		 * options.addArguments("--disable-notifications"); driver = new
		 * ChromeDriver(options);
		 */

		// open application url
//		driver.get(url);
		// validate page title
//		Assert.assertEquals(true, false); // this is hard assert. if it fails then the test execution will be
		// terminated. and test will failed.

		SoftAssert sft = new SoftAssert();
		sft.assertEquals(true, true); // this is soft assert. if it fails then it won;t stop the test execution. it
										// will continue.

		// enter user name

		// enter password

		// click login button
		Assert.assertEquals(true, true);
		// validate home page
		Assert.assertEquals(true, true);
		// logout
		Assert.assertTrue(true);

//		sft.assertTrue(false);
		sft.assertAll();
		System.out.println("next is assert false");
		Assert.assertFalse(true);
		System.out.println("the above is assert false");
		System.out.println("----------------");
		Assert.assertNotEquals(true , false, "both are true");
		System.out.println("----------------");
		/*
		 * sft.assertEquals(actual, expected); sft.assertNotEquals(actual, expected);
		 * sft.assertTrue(condition); sft.assertFalse(condition);
		 * sft.assertNotNull(object); sft.assertNull(object); sft.assertSame(actual,
		 * expected, message); sft.assertNotSame(actual, expected);
		 */
		
		
		
//		Assert.assertSame(true, true);
		
//		Assert.assertSame(true, false, "this is true and false in the assert same function.");
//		Assert.assertNotSame(true, true, "this is assertnotsame using true and  true.");
//		Assert.assertNotNull(object);
//		Assert.assertThrows(runnable);
	}

}
