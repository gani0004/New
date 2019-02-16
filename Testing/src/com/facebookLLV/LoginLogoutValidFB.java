package com.facebookLLV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutValidFB {

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="http:\\facebook.com";
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\SeleniumAUT\\Testing\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.id("email")).sendKeys("8177844284");
		driver.findElement(By.id("pass")).sendKeys("Iloveyou123@");
		driver.findElement(By.id("u_0_2")).click();
		
		//<span class="_1vp5">Ganesh</span>
		String expected_text="Ganesh";
		System.out.println("the expected text after login is: "+expected_text);
		
		WebElement Ganesh=driver.findElement(By.className("_1vp5"));
		String actual_text=Ganesh.getText();
		System.out.println("the actual text after login is: "+actual_text);
		
		if(actual_text.equals(expected_text))
		{
			System.out.println("login successful_pass");
		}
		else {
			System.out.println("login failed_fail");
		}
		//<div class="_6qfu _5lxt" id="userNavigationLabel">Account Settings</div>
		driver.findElement(By.id("userNavigationLabel")).click();
		//<span class="_54nh"><form class="_w0d _w0d" action="https://www.facebook.com/login/device-based/regular/logout/?button_name=logout&amp;button_location=settings" data-nocookies="1" id="u_1b_5" method="post" onsubmit=""><input type="hidden" name="jazoest" value="22012" autocomplete="off"><input type="hidden" name="fb_dtsg" value="AQEMYjxWc3t8:AQFEM-Xge0qN" autocomplete="off"><input type="hidden" autocomplete="off" name="ref" value="mb"><input type="hidden" autocomplete="off" name="h" value="Afei0XezW7luBKrr"></form>Log Out</span>
		driver.findElement(By.className("_54nh")).click();
		driver.quit();
	}

}
