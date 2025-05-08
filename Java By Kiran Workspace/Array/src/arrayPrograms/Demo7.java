package arrayPrograms;

import java.util.Scanner;

public class Demo7
{
	 static Scanner sc=new Scanner(System.in);
     public static void main(String[] args)
  {
	     char ch[]=new char[5];
	     Demo7 d1=new Demo7();
	     d1.acceptData(ch);

	}

     public void acceptData(char ch[])
     {
    	 System.out.println("Enter characters into array:");
    	  for(int i=0; i<ch.length; i++)
    	  {
    		  ch[i]=sc.next().charAt(i);
    	  }
     }

     public void showData(char ch[])
     {
    	 System.out.println("Values of array->");
    	 for (char element : ch) {
    		 System.out.println(element);
    	 }
     }
}
