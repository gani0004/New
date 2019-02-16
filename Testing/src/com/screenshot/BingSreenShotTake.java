package com.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BingSreenShotTake {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=null;
		String url="http://bing.com";
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		File Bing_acreenshot=((TakesScreenshot)driver). getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Bing_acreenshot, new File("./screenshot/bing.png"));

				
	}

}
