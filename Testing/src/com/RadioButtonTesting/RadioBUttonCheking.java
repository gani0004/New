package com.RadioButtonTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBUttonCheking {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=null;
		String url="http://www.echoecho.com/htmlforms10.htm";
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement RadioBlock=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		//<input type="radio" name="group1" value="Milk">
		//<input type="radio" name="group1" value="Butter" checked="">
		//<input type="radio" name="group1" value="Cheese">
		//<input type="radio" name="group2" value="Water">
		List<WebElement>radioButton=RadioBlock.findElements(By.name("group1"));
		for(int i=0;i<radioButton.size();i++) 
		{
			radioButton.get(i).click();
			Thread.sleep(5000);
			for(int k=0;k<radioButton.size();k++)
			{
				System.out.println(radioButton.get(k).getAttribute("value")+"  "+radioButton.get(k).getAttribute("checked"));
			}
			Thread.sleep(5000);
		}
		
		
		
	}

}
