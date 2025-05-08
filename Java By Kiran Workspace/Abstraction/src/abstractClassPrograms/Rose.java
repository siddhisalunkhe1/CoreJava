package abstractClassPrograms;

import java.util.Scanner;

public class Rose extends Flower
{
	

	@Override
	public void name() {
		System.out.println("White Rose");
	}

	@Override
	public void smell() {
		System.out.println("Smelling good");
		
	}

	@Override
	public void color() {
		System.out.println("White");
		
	}

	@Override
	public void isFork() {
		System.out.println("Yes");
		
	}

}
