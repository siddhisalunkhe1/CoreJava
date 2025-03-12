package com.Scanner;

import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value:");
		byte a=sc.nextByte();
		System.out.println(a);
		System.out.println("Enter value:");
		short b=sc.nextShort();
		System.out.println(b);
		System.out.println("Enter value:");
		int c=sc.nextInt();
		System.out.println(c);
		System.out.println("Enter value:");
		long l=sc.nextInt();
		System.out.println(l);
		System.out.println("Enter value:");
		float d=sc.nextFloat();
		System.out.println(d);
		System.out.println("Enter value:");
		double e=sc.nextDouble();
		System.out.println(e);
		System.out.println("Enter firstName:");
		String str=sc.next();
		System.out.println(str);
		System.out.println("Enter FullName:");
		String str1=sc.next();
		System.out.println(str1);
		boolean s=sc.nextBoolean();
		System.out.println(s);
		
	}
}
