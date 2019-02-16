package com.TestNGAnnoations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation4login {
	WebDriver driver=null;
	String url="https://uidai.gov.in/";
	
	@BeforeTest
	public void SetUP()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	@Test
	public void login()
	{
		System.out.println("login to facebook");
	}
	@AfterTest
	public void TearDown()
	{
		driver.quit();
	}
}
