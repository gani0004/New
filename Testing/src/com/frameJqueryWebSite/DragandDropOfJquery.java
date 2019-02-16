package com.frameJqueryWebSite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropOfJquery {

	public static void main(String[] args) 
	{

		WebDriver driver=null;
		String url="http://jqueryui.com/droppable/";
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//for switching to frame/iframe when id is not working and it is inside frame tag 
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement dragElementText=driver.findElement(By.id("draggable"));
		dragElementText.getText();
		System.out.println(dragElementText);
		//for Drag and Drop
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(dragElementText, drop).build().perform();
	}

}
