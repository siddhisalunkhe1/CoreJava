package loopsHomeWork;

public class Que1
{
    //print 11 to -33 and decrese it by 4
	public static void usingForLoop()
	{
		System.out.println("==Using for loop==");
		for(int i=11; i>=-33; i-=4)
		{
			System.out.println("i->"+i);
		}
	}
	
	public static void usingWhileLoop()
	{
		System.out.println("==Using while loop==");
		int i=11;
		while(i>=-33)
		{
			System.out.println("i->"+i);
			i-=4;
		}
	}
	
	public static void usingDoWhileLoop()
	{
		System.out.println("==Using do while loop==");
		int i=11;
		do
		{
			System.out.println("i->"+i);
			i-=4;
		}while(i>=-33);
	}
	
	public static void main(String[] args) 
	{
		usingForLoop();
		usingWhileLoop();
		usingDoWhileLoop();
	}
}
