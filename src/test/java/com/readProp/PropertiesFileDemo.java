package com.readProp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.testng.annotations.Test;

public class PropertiesFileDemo {

	@Test(priority = 1)
	public void test() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".//data.properties");
		prop.load(fis);

		String name = prop.getProperty("name");
		System.out.println(name + " : " + prop.getProperty("browser"));
		System.out.println("-------------------------");
	}

	@Test(priority = 2)
	public void readXML() throws DocumentException {
		File inputFile = new File(System.getProperty("user.dir") + "\\properties.xml");

		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(new File(".//properties.xml"));

		String emailText = document.selectSingleNode("//menu/user").getText();

		String pswd = document.selectSingleNode("//menu/pwd").getText();
		String emailText2 = document.selectSingleNode("//menu/user2").getText();

		String pswd2 = document.selectSingleNode("//menu/pwd2").getText();

		System.out.println(emailText + " : " + pswd);
		System.out.println("-------------------------");
		System.out.println(emailText2 + " : " + pswd2);
		System.out.println("-------------------------");
	}
}
