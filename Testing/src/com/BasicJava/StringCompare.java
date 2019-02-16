package com.BasicJava;

public class StringCompare {

	public static void main(String[] args) 
	{
		String a="Ganesh";
		String b="ganesh";
		if(a.equals(b))
		{
			System.out.println("both strings are equal");
		}
		else {
			System.out.println("both strings are not equal");
		}
		System.out.print("**************************");
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("both strings are equal");	
		}
		else {
			System.out.println("both strings are not equal");
		}
	}

}
