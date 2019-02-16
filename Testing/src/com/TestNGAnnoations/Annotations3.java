package com.TestNGAnnoations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3 {

	@BeforeMethod//Checking individual functionality
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
	@AfterMethod//Checking individual functionality
	public void CloseBrowser()
	{
		System.out.println("Close Chrome Browser");
	}
}
