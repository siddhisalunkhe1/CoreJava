package constructorPrograms;

import java.util.Scanner;

public class EmployeeMain
{
	static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
    	System.out.println("Enter id, name, city and post: ");
    	Employee e2=new Employee();
//    	String name=sc.nextLine();
//    	sc.nextLine();
//    	String address=sc.nextLine();
		Employee e1=new Employee(sc.nextInt(), sc.next(), sc.next(), sc.next());
		
//		e1.acceptProperties();
		e1.showProperties();
	}
}
