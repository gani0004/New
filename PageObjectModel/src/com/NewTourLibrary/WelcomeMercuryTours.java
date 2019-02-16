package com.NewTourLibrary;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours {

	//<a href="mercurysignon.php?osCsid=5835b3047a954731b3bb634040e5b79d">SIGN-ON</a>
	@FindBy(linkText="SIGN-ON")
	WebElement SignOn;
public void Signon()
{
	SignOn.click();
}
//<a href="mercuryregister.php?osCsid=5835b3047a954731b3bb634040e5b79d">REGISTER</a>
	@FindBy(linkText="REGISTER")
	WebElement Register;
	public void register()
	{
		Register.click();
	}
@FindBy(name="userName")
WebElement username;
@FindBy(name="password")
WebElement password;
@FindBy(name="login")
WebElement login;
public void login(String uname,String Pwd)
{
	username.clear();
	username.sendKeys(uname);
	password.clear();
	password.sendKeys(Pwd);
	login.click();
}

}
