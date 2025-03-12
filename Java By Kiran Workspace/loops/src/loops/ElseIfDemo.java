package loops;

import java.util.Scanner;

public class ElseIfDemo
{
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		
		if(num%3==0 && num%5==0)
		{
			System.out.println("Mango and Cherry");
		}
		else if(num%3==0)
		{
			System.out.println("Mango");
		}
		else if(num%5==0)
		{
			System.out.println("Cherry");
		}
		else
			System.out.println(num);
		
		
}
}
