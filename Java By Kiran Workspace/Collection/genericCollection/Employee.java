package genericCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee extends Person
{
	private int empId;
    private double salary;
    private static ArrayList<Employee> empList=new ArrayList<Employee>();
    
    public Employee()
    {
    	super();
    	this.setEmpId(empId);
    	this.setSalary(salary);
    	
    }
    
    public Employee(String name, int age, int empId, double salary)
    {
    	super(name, age);
    	this.empId=empId;
    	this.salary=salary;
    	this.addToList();
    }
    
    public void addToList()
    {
    	empList.add(this);
    	
    }
    public void acceptEmployee(String name, int age, int empId, double salary)
    {
    	super.acceptPerson(name, age);
    	this.empId=empId;
    	this.salary=salary;
    }
    
    public void showEmployee()
    {
    	super.showPerson();
    	System.out.println("Employee Id: "+empId);
    	System.out.println("Salary: "+salary);
    }

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee ["+ super.toString()+ " empId=" + empId + ", salary=" + salary + "]";
	}

	public static void showAllEmployees()
	{
		Iterator<Employee> itr=empList.iterator();
		while(itr.hasNext())
		{
		  Employee e=itr.next();
		  System.out.println(e);
		}
	}
    
    
}
