package com.controlstatements;

public class ContinueDemo {
	 public static void main(String[] args) {
			for(int i=5; i<=20; i++)
			{
				if(i%3==0)
					continue;
				System.out.println(i);
				
			}
		}
}
