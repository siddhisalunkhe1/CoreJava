package ArrayList;

import java.util.ArrayList;

public class InputIntoList
{
     public static void main(String[] args)
    {
	     ArrayList a1=new ArrayList();
	     
	     a1.add(46);
	     a1.add(98);
	     a1.add(67);
	     a1.add(56);
	     
	     
//	     System.out.println(a1.get(3));
	     
	     for(Object obj: a1)
	     {
	    	 System.out.println(obj.toString());
	     }
	}
}
