package com.ORHM.lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginkeyWords 
{
	WebDriver driver=null;
	String url="https://www.vihaan.asia/en/login";
	public void Launch_brower()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Keyword Driven\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void Navigate()
	{
		driver.get(url);
	}
	public void Enter_username()
	{
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTCO")).sendKeys("IN699833");
	}
	public void Enter_password()
	{
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPassword")).sendKeys("Grudhi143@");
	}
	public void Login()
	{
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnLogin")).click();
	}

}
