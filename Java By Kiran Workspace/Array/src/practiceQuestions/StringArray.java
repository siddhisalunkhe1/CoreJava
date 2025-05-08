package practiceQuestions;

import java.util.Scanner;

public class StringArray
{ 
	 static Scanner sc=new Scanner(System.in);
    public void inputString()
    {
    	String str[]=new String[2];
    	System.out.println("Enter String into array->");
    	for(int i=0; i<str.length; i++)
    	{
    		
    		str[i]=sc.next();
    		System.out.println(str[i]);   		
    	}
    }
    
    public static void main(String[] args)
    {
		StringArray s1=new StringArray();
		s1.inputString();
	}
}
