package constructorPrograms;

public class Cat
{
    String name;
    int age;
    
    Cat()
    {
    	name="Unknown";
    	age=0;
    	System.out.println(name);
    	System.out.println(age);
    }
    
    public static void main(String[] args)
    {
	    Cat c1=new Cat();
	    
	}
}
