package com.CountLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinksandPrint {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=null;
		String url="https://www.flipkart.com";
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int LinkCount=links.size();
		System.out.println("the total number of links count is:"+LinkCount);
		
		for(int k=0;k<LinkCount;k++) 
		{
		String LinksName=links.get(k).getText();
		System.out.println(k+" "+"Links names are:"+LinksName);
		}

	}

}
