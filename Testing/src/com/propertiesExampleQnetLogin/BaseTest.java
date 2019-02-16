package com.propertiesExampleQnetLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver=null;
	String url="https://www.vihaan.asia/en/login";
	
	@BeforeTest
	public void SetUP()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	@AfterTest
	public void TearDown()
	{
		driver.quit();
	}
}
