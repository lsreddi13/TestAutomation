package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptParamDemo2 {
	WebDriver driver;
	
	@Parameters("city")
	@Test
	public void test(@Optional("Hyderabad")  String city) throws InterruptedException {
		
	String City= city;
	
	System.out.println(City);
	
	
	}
	

}
