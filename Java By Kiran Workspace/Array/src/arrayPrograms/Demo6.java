package arrayPrograms;

import java.util.Scanner;

public class Demo6 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String str[] = new String[5];
		Demo6 d1 = new Demo6();
		d1.acceptData(str);
		d1.showData(str);
		d1.reverseArray(str);

	}

	public void acceptData(String str[]) {
		System.out.println("Enter String into array:");
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.nextLine();
		}
	}

	public void showData(String str[]) {
		System.out.println("Strings of array->");
		for (String element : str) {
			System.out.println(element);
		}
	}
	
	public void reverseArray(String str[])
	{
		System.out.println("Reversed array->");
		for(int i=str.length-1; i>0; i++) 
		{
		    System.out.println(str[i]);	
		}
	}
}
