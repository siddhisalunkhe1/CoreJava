package constructorPrograms;

import java.util.Scanner;

public class Dog 
{
     String name;
     String color;
      
     static Scanner sc=new Scanner(System.in);
     Dog(String name, String color)
     {
    	 name=name;
    	 color=color;
    	 System.out.println(name);
    	 System.out.println(color);
     }
     
     public static void main(String[] args)
    {
    	 System.out.println("Enter name and color:");
	   Dog d1=new Dog(sc.nextLine(), sc.nextLine() );	
	}
}
