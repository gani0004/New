package com.AutoIt;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItHandleWindows {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://imgur.com/upload");
		driver.findElement(By.xpath("//*[@id=\'upload-modal\']/div[2]/div[2]/label")).click();
		Runtime.getRuntime().exec("E:\\Automation\\SeleniumAUT\\Testing\\src\\com\\AutoIt\\dee.exe");
		
		

	}

}
