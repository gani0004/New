package com.BasicJava;

public class NestedCondition {

	public static void main(String[] args) 
	{
		int a=10;
		int b=40;
		int c=30;
		if(a>b & a>c)
		{
		System.out.println("a is greater than b&c");
		}
		else
			if(b>c)
			{
				System.out.println("b is greater than a&c");
			}
			else
			{
				System.out.println("c is greater than a&b");
			}

	}

}
