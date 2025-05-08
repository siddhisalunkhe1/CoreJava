package arrayPrograms;

import java.util.Scanner;

public class Demo
{
	static Scanner sc=new Scanner(System.in);
	 public static void main(String[] args)
	    {
			int s[]=new int[5];
			Demo d1=new Demo();
			 d1.acceptData(s);
			 d1.showData(s);


		}

	     public void acceptData(int s[])
	     {
	    	 System.out.println("Enter numbers into array:");
	    	  for(int i=0; i<s.length; i++)
	    	  {
	    		  s[i]=sc.nextInt();
	    	  }
	     }

	     public void showData(int s[])
	     {
	    	 System.out.println("Values of array->");
	    	 for (int element : s) {
	    		 System.out.println(element);
	    	 }
	     }
}
