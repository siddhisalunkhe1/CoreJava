package practiceQuestions;

import java.util.Scanner;

public class DoubleArray
{
	static Scanner sc=new Scanner(System.in);
	
       public void inputDoublearray()
       {
    	   double arr[]=new double[4];
    	   System.out.println("Enter element->");
    	   for(int i=0; i<arr.length; i++)
    	   {
    		   arr[i]=sc.nextDouble();
//    		   System.out.println(arr[i]);
    	   }
    	   
    	   for(Double d:arr)
    	   {
    		  System.out.println(d.toString()); 
    	   }
       }
       
       public static void main(String[] args) {
		DoubleArray d1=new DoubleArray();
		d1.inputDoublearray();
	}
}
