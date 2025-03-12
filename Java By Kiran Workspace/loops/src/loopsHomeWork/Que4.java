package loopsHomeWork;

public class Que4
{
	 //print 55 to 88 and increse it by 3
		public static void usingForLoop()
		{
			System.out.println("==Using for loop==");
			for(int i=55; i<=88; i+=3)
			{
				System.out.println("i->"+i);
			}
		}
		
		public static void usingWhileLoop()
		{
			System.out.println("==Using while loop==");
			int i=55;
			while(i<=88)
			{
				System.out.println("i->"+i);
				i+=3;
			}
		}
		
		public static void usingDoWhileLoop()
		{
			System.out.println("==Using do while loop==");
			int i=55;
			do
			{
				System.out.println("i->"+i);
				i+=3;
			}while(i<=88);
		}
		
		public static void main(String[] args) 
		{
			usingForLoop();
			usingWhileLoop();
			usingDoWhileLoop();
		}
}
