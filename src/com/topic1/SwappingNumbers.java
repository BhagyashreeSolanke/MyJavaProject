package com.topic1;

public class SwappingNumbers {
	public static void main(String[] args) {
		//Swap values of two integer variables using third variable?
		
		int a = 10;
		int b = 33;
		int c = 6;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		
		
		//Swap values of two integer variables without using third variable?
		
		int x = 44;
		int y = 16;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		
	}

}
