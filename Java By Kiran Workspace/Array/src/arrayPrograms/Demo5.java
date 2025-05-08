package arrayPrograms;

import java.util.Scanner;

public class Demo5
{
	static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
    	double s[]=new double[5];
	     Demo5 d1=new Demo5();
	     d1.acceptData(s);
	     d1.showData(s);

	}

    public void acceptData(double s[])
    {
   	 System.out.println("Enter numbers into array:");
   	  for(int i=0; i<s.length; i++)
   	  {
   		  s[i]=sc.nextDouble();
   	  }
    }

    public void showData(double s[])
    {
   	 System.out.println("Values of array->");
   	 for (double element : s) {
   		 System.out.println(element);
   	 }
    }
}
