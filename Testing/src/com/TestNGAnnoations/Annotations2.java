package com.TestNGAnnoations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {

	@BeforeTest//Launching Browser and navigating to URL its not a Functionality
	public void Browser_launch()
	{
		System.out.println("Chrome browser launch & navigating to Gmail");
	}
	@Test(priority=1)
	public void Login()
	{
		System.out.println("Testing Login functionality");
	}
	@Test(enabled=false)//is used to ignore test case i.e it will skip it
	public void Inbox()
	{
		System.out.println("Testing Inbox functionality");
	}
	@Test(priority=2)
	public void Compose()
	{
		System.out.println("Testing Compose_Mail functionality");
	}
	@AfterTest//Closing Browser its not a Functionality
	public void CloseBrowser()
	{
		System.out.println("Close Chrome Browser");
	}
}
