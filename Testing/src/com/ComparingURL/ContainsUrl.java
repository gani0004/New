package com.ComparingURL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsUrl {

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		String url="http:\\facebook.com";
		driver.get(url);
		String expected_url="facebook.com";
		if(url.contains(expected_url)) {
			System.out.println("Contains url_passed");
		}else {
			System.out.println("failed");
		}
		driver.close();
	}

}
