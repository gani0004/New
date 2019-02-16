package com.Inheristance;

public class Child extends Parent
{
	public void test4()
	{
		System.out.println("test4 method Executed");
	}

	public static void main(String[] args)
	{
		Child c=new Child();
		c.test4();
		c.test2();
		c.test3();
	}

}
