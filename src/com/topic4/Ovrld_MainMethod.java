package com.topic4;

public class Ovrld_MainMethod {
	//WAC and try to overload the main method?
	
	public static void main(int x)
	{
		System.out.println(x);
	}
	public static void main(double d, int a)
	{
	    System.out.println(d-a);	
	}
	public static void main(int a, int b)
	{
		System.out.println(a*b);
	}
	public static void main(float c, int b)
	{
		System.out.println(c+b);
	}
	public static float main(float a, float b)
	{
		return a*b;
	}
	public static void main(String[] args)
	{
		Ovrld_MainMethod.main(10);
		Ovrld_MainMethod.main(10.5, 5);
		Ovrld_MainMethod.main(5, 3);
		Ovrld_MainMethod.main(6.8f, 5);
		System.out.println(Ovrld_MainMethod.main(10.5f, 5.6f));
	}

}
