package arrayPrograms;

import java.util.Scanner;

public class Demo3
{
	static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
    	short s[]=new short[5];
	     Demo3 d1=new Demo3();
	     d1.acceptData(s);
	     d1.showData(s);

	}

    public void acceptData(short s[])
    {
   	 System.out.println("Enter numbers into array:");
   	  for(int i=0; i<s.length; i++)
   	  {
   		  s[i]=sc.nextShort();
   	  }
    }

    public void showData(short s[])
    {
   	 System.out.println("Values of array->");
   	 for (short element : s) {
   		 System.out.println(element);
   	 }
    }
}
