package com.CountVLinksofFipkart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.description.modifier.SynchronizationState;

public class Count_headerBlock_Links {

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="https://uidai.gov.in/";
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS );
		
		WebElement headerBlock=driver.findElement(By.id("submenu-2"));
		List<WebElement>HeaderBlocklinks=headerBlock.findElements(By.tagName("a"));
		int headerCount=HeaderBlocklinks.size();
		//<div class="fusion-row">
		System.out.println(headerCount);
		
		for(int k=0;k<headerCount;k++) 
		{
			String headerBlocklink=HeaderBlocklinks.get(k).getText();
			System.out.println(headerBlocklink);
		}

	}

}
