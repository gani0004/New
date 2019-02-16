package com.GetAttribueToIdenRefUrlOfElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetAttributeMethod {

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="https://www.vihaan.asia/";
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//<a id="ctl00_ctl12_hlLogin" title="IR Login" href="/en/login">IR Login</a>
	    String url_expected=driver.findElement(By.linkText("IR Login")).getAttribute("href");
	    System.out.println(url_expected);
	    driver.findElement(By.linkText("IR Login")).click();
	    String actual_url=driver.getCurrentUrl();
	System.out.println(actual_url);
	if(actual_url.equals(url_expected)) 
	{
		System.out.println("sucessful navigate to url-PASS");
	}
	else 
	{
		System.out.println("failed to navigate -Failed");
			
		
	}
	
	
	}

}
