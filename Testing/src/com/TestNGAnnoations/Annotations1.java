package com.TestNGAnnoations;

import org.testng.annotations.Test;

public class Annotations1 {
@Test(priority=0)//if you not given "(pririty=)"then It tests Tc's Alphabetically by method name
public void Browser_launch() {
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
@Test(priority=3)
public void Compose()
{
	System.out.println("Testing Compose_Mail functionality");
}
}
