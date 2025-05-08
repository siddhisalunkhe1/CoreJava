package abstractClassPrograms;

public class DemoFlower
{
      public static void main(String[] args)
    {
	   Rose r1=new Rose();
	   Lotus l1=new Lotus();
	   Sunflower s1=new Sunflower();
	   Flower f1=new Rose(); //dynamic dispatching
	   
	   r1.name();
	   r1.smell();
	   r1.color();
	   r1.isFork();
	   
	   System.out.println("----------------------------------");
	   
	   l1.name();
	   l1.smell();
	   l1.color();
	   l1.isFork();
	   
	   System.out.println("----------------------------------");
	   
	   s1.name();
	   s1.smell();
	   s1.color();
	   s1.isFork();
	   
	   System.out.println("----------------------------------");
	   
	   f1.name();
	   
	}
}
