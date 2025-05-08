package interfacePrograms1;

public class Rectangle
{
    double length;
    double breadth;
    
    public Rectangle()
    {
    	
    }
    public Rectangle(double length, double breadth  )
    {
    	this.length=length;
    	this.breadth=breadth;
    }
    
    public void calArea()
    {
    	double area=length*breadth;
    	System.out.println("Area-> "+area);
    }
    
    public void calPerimeter()
    {
    	double perimeter=(length+breadth)*2;
    	System.out.println("Perimeter-> "+perimeter);
    }
}
