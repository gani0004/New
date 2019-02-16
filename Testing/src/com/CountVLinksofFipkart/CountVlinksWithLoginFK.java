package com.CountVLinksofFipkart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountVlinksWithLoginFK {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=null;
		String url="https://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS );
		
		driver.findElement(By.id("email")).sendKeys("8177844284");
		driver.findElement(By.id("pass")).sendKeys("Iloveyou123@");
		driver.findElement(By.id("u_0_2")).click();
		
	
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int LinkCount=links.size();
		System.out.println("the total number of links count is:"+LinkCount);
		
		for(int k=0;k<LinkCount;k++) 
		{
			if(links.get(k).isDisplayed()) {
		String LinksName=links.get(k).getText();
		System.out.println(LinksName);
	}
	}
		Thread.sleep(10000);
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.id("u_12_5")).click();
		driver.quit();
	}
	}
