package com.WebTableElementCapure;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFirstcolumnAllrowsdata {

	public static void main(String[] args)
	{
		WebDriver driver=null;
		String url="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
		for(int i=1;i<=36;i++)
		{
			String data=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println(data+"  ");
		}
		System.out.println();
	}

}
