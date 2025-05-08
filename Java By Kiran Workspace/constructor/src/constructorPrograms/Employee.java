package constructorPrograms;

import java.util.Scanner;

public class Employee
{
     int id;
     String name;
     String city;
     String post;
     
     Scanner sc=new Scanner(System.in);
     
     Employee()
     {
    	
    	
     }
     Employee(int id, String name, String city, String post)
     {
    	 this.id=id;
    	 this.name=name;
    	 this.city=city;
    	 this.post=post;
    	 
     }
     
     public void acceptProperties()
     {
    	 System.out.println("Enter id, name, city and post: ");
    	 this.id=sc.nextInt();
    	 this.name=sc.nextLine();
    	 this.city=sc.nextLine();
    	 this.post=sc.nextLine();    	 
     }
     
     public void showProperties()
     {
    	 System.out.println("Id: "+this.id);
    	 System.out.println("Name: "+this.name);
    	 System.out.println("City: "+this.city);
    	 System.out.println("Post: "+this.post);
     }
}
