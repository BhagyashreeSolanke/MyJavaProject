package com.topic4;

public class OvrLoad_StaticMethod {
	// WAC to overload the static method?
	//static int a;
	//static int b;
	public static void calculate()
	{
		System.out.println("hello");
	}
	public static void calculate(int a, int b)
	{
		System.out.println(a+b);
	}
	public static float calculate(float a, int b)
	{
		return (float)(a*b);
	}
	public static void calculate(float a, float b)
	{
		System.out.println(a-b);
	}
	public static double calculate(int a, double b)
	{
		return (double) (b/a);
	}

	public static void main(String[] args) {
		OvrLoad_StaticMethod.calculate();
		OvrLoad_StaticMethod.calculate(5, 4);	
		System.out.println(OvrLoad_StaticMethod.calculate(2.5f, 4));
		OvrLoad_StaticMethod.calculate(2.5f, 3.5f);
		System.out.println(OvrLoad_StaticMethod.calculate(10, 25.5));
	}
}
