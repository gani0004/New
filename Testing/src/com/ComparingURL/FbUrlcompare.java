package com.ComparingURL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbUrlcompare {

	public static void main(String[] args)
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		String url="http://facebook.com";
		driver=new ChromeDriver();
		driver.get(url);
		String actual_url=driver.getCurrentUrl();
		System.out.println("The current url: "+actual_url);
		driver.close();

	}

}
