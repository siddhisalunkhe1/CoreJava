package arrayListPrograms;

public class StudentDemo 
{
      public static void main(String[] args)
    {
	    Student s1=new Student();
	    Student s2=new Student("Bhagyashri Salunkhe", 43);
	    
	    System.out.println("All Students-> ");
	    for(Student s : Student.stdList)
	    {
	    	s.showDetails();
	    }
	    
	}
}
