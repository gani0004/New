package com.BasicJava;

public class ObjectArray {

	public static void main(String[] args) 
	{
		Object a[]=new Object[4];
		a[0]=84848;
		a[1]="Ganesh";
		a[2]=434.93993;
		a[3]='a';
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("**********************");
		
		//For Each Loop Important and it only used with Array
		for(Object var:a)
		{
			System.out.println(var);	
		}
	}

}
