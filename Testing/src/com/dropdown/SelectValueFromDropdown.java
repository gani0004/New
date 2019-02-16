package com.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValueFromDropdown {

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
		
		for(int i=0;i<years.size();i++)
		{
			System.out.println(years.get(i).getText());
		}
		Select selection=new Select(year);
		//selection.selectByIndex(6);
		//selection.selectByValue("8");
		selection.selectByVisibleText("1995");
	}

}
