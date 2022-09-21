package com.topic4;

public class Arithmatics {
	public void calculate(int a,int b)
	{
		System.out.println(a+b);
	}
	public void calculate(float a,float b)
	{
		System.out.println(a-b);
	}
	public double calculate(int a,double c)
	{
	  return a*c;	  
	}
	public void calculate(double a,int c)
	{
		System.out.println(a/c);
	}
	public static void main(String[] args) {
		Arithmatics ari = new Arithmatics();
		ari.calculate(4, 5);
		System.out.println(ari.calculate(5, 1.25));
		ari.calculate(2.5f, 1.5f);
		ari.calculate(25.5, 5);

	}

}
