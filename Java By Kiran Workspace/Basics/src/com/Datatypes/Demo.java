package com.Datatypes;

import java.util.Scanner;

 class Index 
 {
	 void add()
	 {
		 float a, b, res;
		 a=24;
		 b=30;
		 res = a + b;
		 System.out.println("Result is:" +res);
	 }
 }


public class Demo 
{
    public static void main(String[] args) 
    {
//    	Scanner sc=new Scanner(System.in);
//    	System.out.println("Enter the value of y: ");
//		int y=sc.nextInt();
//		System.out.println(y);
		char s1=84;
		System.out.println(s1);
		int s='T';
		System.out.println(s);
		Index i1 = new Index();
		i1.add();
	}
}
