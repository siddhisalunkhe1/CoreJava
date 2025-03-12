package com.Scanner;

import java.util.Scanner;

public class Demo2 
{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int a, b, tot;
		System.out.println("Enter values: ");
		a=sc.nextInt();
		b=sc.nextInt();
		tot=a+b;
		System.out.println("total are:"+tot);
		
		int sub=a-b;
		System.out.println(sub);
		
		int mul=a*b;
		System.out.println(mul);
		
		int div=a/b;
		System.out.println(div);
		
		int mod=a%b;
		System.out.println(mod);
		
		
	}
}
