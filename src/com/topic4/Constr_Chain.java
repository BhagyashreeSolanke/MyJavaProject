package com.topic4;

public class Constr_Chain {
	int a;
	int b;
	float c;
	Constr_Chain()
	{
		System.out.println("Default");
	}
	Constr_Chain(int a,int b)
	{
		this();
		System.out.println(a*b);
	}
	Constr_Chain(int a,int b,float c)
	{
		this(7,8);
		System.out.println((a*b)+c);
	}

	public static void main(String[] args) {
		Constr_Chain cc=new Constr_Chain(4,5,6);	
	}

}
