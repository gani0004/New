package com.WebTableElementCapure;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicProgToCapureAllDatafromRowAndColumn {

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]    =1st Element
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[7]   =last Element

	///html/body/div[1]/div[6]/section[1]/div/section/div[1]     =web table
	WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]"));
	List<WebElement>row=table.findElements(By.tagName("tr"));
	
	for(int i=0;i<row.size();i++)//for row
	{
		List<WebElement>cols=row.get(i).findElements(By.tagName("td"));
		for(int k=0;k<cols.size();k++)//for column
		{
			String data=cols.get(k).getText();
			System.out.print(data+"  ");
		}
		System.out.println();
	}
	
	
	}

}
