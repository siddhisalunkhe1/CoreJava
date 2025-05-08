package arrayPrograms;

import java.util.Scanner;

public class Demo4
{
	static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
    	long s[]=new long[5];
	     Demo4 d1=new Demo4();
	     d1.acceptData(s);
	     d1.showData(s);

	}

    public void acceptData(long s[])
    {
   	 System.out.println("Enter numbers into array:");
   	  for(int i=0; i<s.length; i++)
   	  {
   		  s[i]=sc.nextLong();
   	  }
    }

    public void showData(long s[])
    {
   	 System.out.println("Values of array->");
   	 for (long element : s) {
   		 System.out.println(element);
   	 }
    }
}
