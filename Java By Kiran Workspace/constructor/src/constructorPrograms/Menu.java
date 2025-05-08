package constructorPrograms;

import java.util.Scanner;

public class Menu 
{
	int option;
    static Scanner sc=new Scanner(System.in);
	public static void main(String []args)
	{
        Menu m1=new Menu();
        m1.showMenu();    
	}
      public void showMenu()
      {
    	  
    	  while(true)
    	  {
    		  System.out.println("Addition");
    		  System.out.println("Substraction");
    		  System.out.println("Multiplication");
    		  System.out.println("Division");
    		  System.out.println("Modulus");
    	 
    		  System.out.println("Enter choice: ");
    		  option=sc.nextInt();
    		  switch(option)
    		  {
    		  case 1:
    			  add();
    			  break;
    			  
    		  case 2:
    			  substract();
    			  break;
    		  case 3:
    			  multiplication();
    			  break;
    		  case 4:
    			  division();
    			  break;
    		  case 5:
    			  mod();
    			  break;  
    		  default :
    			  System.out.println("Invalid input");
    			  
    		  }
    	  }
      }
      public static int add()
      {
    	 System.out.println("Enter numbers->");
     	 int a=sc.nextInt();
     	 int b=sc.nextInt();
     	 int sum=a+b;
     	 System.out.println("Addition-> "+sum);
 		return sum; 
      }
      
      public static int substract()
      {
    	 System.out.println("Enter numbers->");
     	 int a=sc.nextInt();
     	 int b=sc.nextInt();
     	 int sub=a-b;
     	 System.out.println("Substraction -> "+sub);
 		return sub;
      }
      
      public static int multiplication()
      {
    	 System.out.println("Enter numbers->");
     	 int a=sc.nextInt();
     	 int b=sc.nextInt();
     	 int mul=a*b;
     	 System.out.println("Multiplication-> "+mul);
 		return mul;
      }
      
      public static int division()
      {
    	 System.out.println("Enter numbers->");
     	 int a=sc.nextInt();
     	 int b=sc.nextInt();
     	 int div=a/b;
     	 System.out.println("Division-> "+div);
 		return div;
      }	
      
      public static int mod()   
      {
         System.out.println("Enter numbers->");
     	 int a=sc.nextInt(); 
     	 int b=sc.nextInt();
     	 int modulus=a%b;
     	 System.out.println("Modulus-> "+modulus);
 		return modulus;
      }

	
}
