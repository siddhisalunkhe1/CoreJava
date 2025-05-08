package interfacePrograms1;

public class Main
{
       public static void main(String[] args) {
    	   System.out.println("Rectangle->");
		Rectangle r1=new Rectangle(5,3);
		r1.calArea();
		r1.calPerimeter();
		System.out.println("----------------");
		
		Square s1=new Square(4);
		System.out.println("Square->");
		s1.calArea();
		s1.calPerimeter();
	}
}
