package com.readProp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.base.Base;

public class PropTestDemo extends Base {

//	static WebDriver driver;

	public PropTestDemo() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void est(WebDriver driver) throws IOException {
		PropTestDemo dd = new PropTestDemo();
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(".//src//main//resources//config.properties");
		p.load(fis);
		driver.get(p.getProperty("url"));
	}
	@Test
	public void test() throws IOException {
		est(driver);
//		

		System.out.println();

		// declare driver

		// open browser

		// open applciation

		// singin

		// do some actioons

		// signout

	}

}
