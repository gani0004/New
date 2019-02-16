package com.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class CromeBrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("http:\\www.facebook.com");
		cd.quit();
	}

}
