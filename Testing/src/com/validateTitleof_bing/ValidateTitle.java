package com.validateTitleof_bing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ValidateTitle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:\\bing.com");
		String Actual_title=driver.getTitle();
		System.out.println("The Actual title is: "+Actual_title);
		String Expected_title=("Bing");
		System.out.println("The Expected title is: "+Expected_title);
		if(Actual_title.equals(Expected_title))
		{
			System.out.println("Title matched_Pass");
		}
		else {
			System.out.println("Title missmatched_Fail");
		}
		driver.quit();
	}
}
