package encapsulation;

import java.util.Scanner;

public class EmployeeDemo 
{
      static Scanner sc=new Scanner(System.in);
     public static void main(String[] args)
    {
	   Employee e1=new Employee();
	   
	   System.out.println("Enter data:");
	   e1.acceptProperties();
	   e1.showProperties();
	}
}
