package com.keyboardAndMouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FbLoginWithKeyTAB {

	public static void main(String[] args)
	{
		WebDriver driver=null;
		String url="http://facebook.com";
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("ganeshwarrior09@gmail.com");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("Iloveyou123@").perform();
		act.sendKeys(Keys.ENTER).perform();
	}

}
