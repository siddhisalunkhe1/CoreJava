package loops;

import java.util.Scanner;

public class IfDemo
{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		
		if(num%4==0 || num%7==0)
		{
			System.out.println("number is divisible by 4 or 7");
		}
		else
			System.out.println("number is not divisible by 4 or 7");
		
	}
}
