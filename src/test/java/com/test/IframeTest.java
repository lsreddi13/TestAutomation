package com.test;

import java.io.IOException;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;



public class IframeTest extends Base {

	public IframeTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		IframeTest ifr = new IframeTest();

		driver.get("https://paytm.com/");
		Thread.sleep(3000);
		/*
		 * List<WebElement> frameList1 = driver.findElements(By.tagName("iframe")); int
		 * count1 = frameList1.size();
		 * System.out.println("before number of frames in the page : "+count1);
		 */
		String xpath_loginLink = "//div[contains(text(), 'Log In/Sign Up')]";
		WebElement loginLink = driver.findElement(By.xpath(xpath_loginLink));

		loginLink.click();
		Thread.sleep(3000);
		// how do find how many frames in the webpage.
		List<WebElement> frameList2 = driver.findElements(By.tagName("iframe"));
		int count2 = frameList2.size();
		System.out.println("after number of frames in the page : "+count2);
		Thread.sleep(3000);
		/*
		 * driver.navigate().refresh(); List<WebElement> frameList3 =
		 * driver.findElements(By.tagName("iframe")); int count3 = frameList3.size();
		 * System.out.println("after Refresh number of frames in the page : "+count3);
		 */
		
//		driver.switchTo().frame(0);
		
		WebElement frame = driver.findElement(By.xpath(""));
		driver.switchTo().frame(frame);
		
//		driver.switchTo().frame("frame name");
		
		Thread.sleep(2000);
		
		String xpath_login_frame = "//span[contains(text(), 'Login/Signup')]";
		
		WebElement loginLink_frame = driver.findElement(By.xpath(xpath_login_frame));
		loginLink_frame.click();
		Thread.sleep(3000);
		
		
		driver.switchTo().defaultContent();
		
		//can do any actions
		
	
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
	alert.dismiss();
	alert.sendKeys("fads");
	alert.getText();
	
	driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	driver.switchTo().alert().sendKeys("dfsd");;
	driver.switchTo().alert().getText();
	
		
		/*
		 * driver.switchTo().frame("frame1"); //some work
		 * 
		 * driver.switchTo().defaultContent(); driver.switchTo().frame("frame3");
		 * driver.switchTo().defaultContent(); driver.switchTo().frame("frame4");
		 * driver.switchTo().defaultContent(); driver.switchTo().frame("frame1");
		 * driver.switchTo().frame("frame2");
		 * 
		 * driver.switchTo().defaultContent(); driver.switchTo().defaultContent();
		 */
	
	
	//
	driver.switchTo().frame(0); //using frame index.
	driver.switchTo().frame("famename"); // using frame name
	driver.switchTo().frame(frame); // using webelement
		
	}

}
