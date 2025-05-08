package interfacePrograms3;

public class Triangle implements Shape
{
	@Override
	public void getArea() {
		int base=59;
		int hei=10;
		double area=(0.5)*base*hei;
		System.out.println("Area of triangle-> "+area);
	}
}
