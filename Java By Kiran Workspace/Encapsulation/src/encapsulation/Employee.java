package encapsulation;

import java.util.Scanner;

public class Employee
{
	  static Scanner sc=new Scanner(System.in);
      private String name;
      private String post;
      private double salary;
      
	
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void acceptProperties()
    {
    	setName(sc.next());
    	setPost(sc.next());
    	setSalary(sc.nextDouble());
    	
    }
     public void showProperties()
     {
    	 System.out.println(getName());
    	 System.out.println(getPost());
    	 System.out.println(getSalary());
     }
}
