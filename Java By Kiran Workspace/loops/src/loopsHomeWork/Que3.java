package loopsHomeWork;

public class Que3 
{
	 //print 44 to 22
		public static void usingForLoop()
		{
			System.out.println("==Using for loop==");
			for(int i=44; i>=22; i--)
			{
				System.out.println("i->"+i);
			}
		}
		
		public static void usingWhileLoop()
		{
			System.out.println("==Using while loop==");
			int i=44;
			while(i>=22)
			{
				System.out.println("i->"+i);
				i--;
			}
		}
		
		public static void usingDoWhileLoop()
		{
			System.out.println("==Using do while loop==");
			int i=44;
			do
			{
				System.out.println("i->"+i);
				i--;
			}while(i>=22);
		}
		
		public static void main(String[] args) 
		{
			usingForLoop();
			usingWhileLoop();
			usingDoWhileLoop();
		}
}
