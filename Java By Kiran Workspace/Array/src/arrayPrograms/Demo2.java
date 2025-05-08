package arrayPrograms;

import java.util.Scanner;

public class Demo2
{
	static Scanner sc=new Scanner(System.in);
	 public static void main(String[] args)
	    {
			byte s[]=new byte[5];
			Demo2 d1=new Demo2();
			 d1.acceptData(s);
			 d1.showData(s);

		}

	     public void acceptData(byte s[])
	     {
	    	 System.out.println("Enter numbers into array:");
	    	  for(int i=0; i<s.length; i++)
	    	  {
	    		  s[i]=sc.nextByte();
	    	  }
	     }

	     public void showData(byte s[])
	     {
	    	 System.out.println("Values of array->");
	    	 for (byte element : s) {
	    		 System.out.println(element);
	    	 }
	     }
}
