package interfacePrograms3;

public class Rectangle implements Shape
{
      
	@Override
	public void getArea() {
		int len=10;
		int breadth=20;
		int area=len*breadth;
		System.out.println("Area of rect-> "+area);
	}
       
}
