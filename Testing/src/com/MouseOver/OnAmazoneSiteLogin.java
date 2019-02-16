package com.MouseOver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public final class OnAmazoneSiteLogin {

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="http://amazon.in";
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement helloSign=driver.findElement(By.id("nav-link-yourAccount"));
		//for mouse or keyboard related oprationes
		Actions act=new Actions(driver);
		act.moveToElement(helloSign).build().perform();
		driver.findElement(By.linkText("Your Wish List")).click();
		
	}

}
