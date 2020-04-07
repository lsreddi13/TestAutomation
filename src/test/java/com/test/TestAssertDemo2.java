package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
// assert not null assert. 
public class TestAssertDemo2 {
	WebDriver driver;
	WebElement txt1, txt2;
	 
	@Test
	public void verifyLastName() {

		String driver_path = ".\\BrowserDrivers\\chromedriver.exe";
		String url = "http://only-testing-blog.blogspot.com/2014/02/attributes.html";
		System.setProperty("webdriver.chrome.driver", driver_path);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

		// open application url
		driver.get(url);

		txt1 = driver.findElement(By.xpath("//input[@id='text1']"));
		txt2 = driver.findElement(By.xpath("//input[@id='text2']"));
		
		  System.out.print("----------"+txt1.getAttribute("disabled")+"-------");
//		  Assert.assertNotNull(txt1.getAttribute("disabled"));
		  Assert.assertNull(txt1.getAttribute("disabled"));

		  System.out.print("++++++++++++"+txt2.getAttribute("disabled")+"--------");
		  Assert.assertNotNull(txt2.getAttribute("disabled"));
		
		  
	}
	 @Test(enabled = false)
	 public void notnull1() {
	  System.out.print("\n"+txt1.getAttribute("disabled"));
	  Assert.assertNotNull(txt1.getAttribute("disabled"));
	 }  
	 //Example Of Assertion Method - will Pass
	 @Test(enabled = false)
	 public void notnull2() {
	  System.out.print("\n"+txt2.getAttribute("disabled"));
	  Assert.assertNotNull(txt2.getAttribute("disabled"));
	 }

}
