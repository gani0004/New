package com.alertHandled;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelPopUPWindow {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=null;
		String url="https://in.bookmyshow.com/hyderabad";
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
///html/body/div[3]/header/div/div[3]/a
		//driver.findElement(By.xpath("/html/body/div[3]/header/div/div[3]/a")).click();
		
		Alert alt=driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.dismiss();
	}

}
