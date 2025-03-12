package com.Scanner;

import java.util.Scanner;

public class demo3 
{
	static Scanner sc=new Scanner(System.in);
	static double pi=3.14;
	static public void avg()
	{
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int tot=a+b+c;
		int avg=tot/3;
		System.out.println(avg);
	}
	
	static public void areaOfCircle()
	{
		System.out.println("Enter value of r:");
		int r=sc.nextInt();
		double areacircle= pi*r*r;
		System.out.println(areacircle);
	}
	
	static public void circumferenceOfCircle()
	{
		System.out.println("Enter value of r:");
		int r=sc.nextInt();
		double circumferenceOfcircle= 2*pi*r;
		System.out.println(circumferenceOfcircle);
	}
	
	static public void areaOfSquare()
	{
		System.out.println("Enter value of side:");
		int side=sc.nextInt();
		double areaSquare= side*side;
		System.out.println(areaSquare);
	}
	
	static public void areaOfRect()
	{
		System.out.println("Enter values of l, b:");
		int l=sc.nextInt();
		int b=sc.nextInt();
		double areaRect= l*b;
		System.out.println(areaRect);
	}
	
   public static void main(String[] args)
   {
	
//	   avg();
//	   areaOfCircle();
//	   circumferenceOfCircle();
	   areaOfSquare();
	   areaOfRect();
}
}
