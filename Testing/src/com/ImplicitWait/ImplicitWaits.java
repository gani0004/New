package com.ImplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaits {

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="https://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_2")).click();
		
		//<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_2">
	
	}

}
