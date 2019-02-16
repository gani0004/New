package com.selenium;

import org.openqa.selenium.opera.OperaDriver;

public class OperaBrowser {

	public static void main(String[] args) 
	{
		{
			System.setProperty("webdriver.opera.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\operadriver.exe");
			OperaDriver od=new OperaDriver();
			od.get("http:\\www.facebook.com");
		}
	}

}
