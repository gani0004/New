package com.CountLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlllinksWorkingINHeaderBlock {

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="http://jqueryui.com";
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS );
		//id="menu-top"
		
		WebElement headerBlock=driver.findElement(By.id("menu-top"));
		List<WebElement>headerBlockLink=headerBlock.findElements(By.tagName("a"));
		int CountLinks=headerBlockLink.size();
		System.out.println(CountLinks);
		 
		for(int k=0;k<CountLinks;k++)
		{
		String LinkName=headerBlockLink.get(k).getText();
		System.out.println(LinkName);
		headerBlockLink.get(k).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		headerBlockLink=driver.findElements(By.tagName("a"));
		}
		driver.close();

	}

}
