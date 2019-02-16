package com.BasicJava;

public class MultiArray {

	public static void main(String[] args) 
	{
		String a[][]=new String [2][2];
		a[0][0]="Ganesh";
		a[0][1]="Abhay";
		a[1][0]="Chavan";
		a[1][1]="from Jath";
		for(int i=0;i<a.length;i++) 
		{
               for(int k=0;k<a.length;k++)
               {
            	   System.out.print(a[i][k]+" ");
               }
               System.out.println();
	}
	}
}
