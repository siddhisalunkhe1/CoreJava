package interfacePrograms3;

class Circle implements Shape
{
	@Override
	public void getArea() {
		double pi=3.14;
		int radius=4;
		double area=pi*radius*radius;
		System.out.println("Area of Circle-> "+area);
	}
}
