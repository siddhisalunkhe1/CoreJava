package arrayListPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class Student
{
       private String name;
       private int age;
       
       public static ArrayList<Student> stdList=new ArrayList<>();
       
       public Student()
       {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter name:");
    	   this.name=sc.nextLine();
    	   System.out.println("Enter age:");
    	   this.age=sc.nextInt();
    	   stdList.add(this); 
       }
       
       public Student(String name, int age)
       {
    	   this.name=name;
    	   this.age=age;
    	   stdList.add(this);
       }
       
       public String getName()
       {
    	   return name;
       }
       
       public void setName(String name)
       {
    	   this.name=name;
       }
       
       public int getAge()
       {
    	   return age;
       }
       
       public void setAge()
       {
    	   this.age=age;
    	   
       }
       
       public void showDetails()
       {
    	   System.out.println("Name: "+name+", Age: "+age);
       }
}
