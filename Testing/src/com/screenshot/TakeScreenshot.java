package com.screenshot;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=null;
		String url="http://facebook.com";
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("5467890653");
				
		//<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("fggdree34455");
				
		//<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_8">
		driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();
		
		
		File Bing_acreenshot=((TakesScreenshot)driver). getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Bing_acreenshot, new File("./screenshot/fb.png"));
	}

}
