package com.BasicJava;

import java.util.ArrayList;
import java.util.List;

public class ArratListExample {

	public static void main(String[] args) 
	{
		List<Object>a=new ArrayList<>();
		a.add("Selenium");
		a.add(123);
		a.add("Hb123");
		a.add(19.8488);
		for(Object x:a) {
			System.out.println(x);
		}

	}

}
