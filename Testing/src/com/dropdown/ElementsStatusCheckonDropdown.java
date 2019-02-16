package com.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsStatusCheckonDropdown {

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="http://facebook.com";
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//<select aria-label="Year" name="birthday_year" id="year" title="Year" class="_5dba"><option value="0">Year</option>
		WebElement year=driver.findElement(By.id("year"));
		List<WebElement>years=year.findElements(By.tagName("option"));
		int yearCount=years.size();
		System.out.println(yearCount);
		
		for(int i=0;i<yearCount;i++) 
		{
		String ycount=years.get(i).getText();
		System.out.println(i+" "+ycount);
		years.get(i).click();
		if(years.get(i).isSelected())
		{
			System.out.println("element is active");
		}
		else {
			System.out.println("elements is inactive");
		}
		
	}

}}