package loopsHomeWork;

public class Que2
{
	//print 1 to 10 number 
    public static void usingForLoop()
    {
    	System.out.println("Using for loop");
    	for(int i=1; i<=10; i++)
    	{
    		System.out.println("i->"+i);
    	}
    }
    
    public static void usingWhileLoop()
    {
    	System.out.println("Using while loop");
    	int i=1;
    	while(i<=10)
    	{
    		System.out.println("i->"+i);
    		i++;
    	}
    }
    
    public static void usingDoWhileLoop()
    {
    	System.out.println("Using do while loop");
    	int i=1;
    	do
    	{
    		System.out.println("i->"+i);
    		i++;
    	}while(i<=10);
    }
    
    public static void main(String[] args)
    {
    	usingForLoop();
    	usingWhileLoop();
    	usingDoWhileLoop();
	}
}
