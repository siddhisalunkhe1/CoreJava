package practiceProblems;

import java.lang.reflect.Array;
import java.util.Scanner;

public class UserInputIntoArray
{
	  static Scanner sc=new Scanner(System.in);
     public static void main(String[] args)
    {
	     int arr[]=new int[5];
	     System.out.println("Enter elements into array:");
	     for(int i=0; i<arr.length; i++)
	     {
	    	 arr[i]=sc.nextInt();
	    	 
	     }
	     
	     for(int i=0; i<arr.length; i++)
	     {
	       System.out.println("Element at "+i+"th "+"index "+Array.get(arr, i)); 
	     }
	   
	}
}
