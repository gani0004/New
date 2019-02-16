package com.capatureTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTitle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe" );
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("http:\\yahoo.com");
		String dri=Driver.getTitle();
		System.out.println("the title of page is"+dri);
		Driver.close();
		
		

	}

}
