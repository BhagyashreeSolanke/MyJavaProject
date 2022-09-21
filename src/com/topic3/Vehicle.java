package com.topic3;

public class Vehicle {
	int modelNo;
	String name;
	int price;
	public static void main(String[] args)
	{
		Vehicle i20=new Vehicle();
		i20.modelNo=123;
		i20.name="Hundai";
		i20.price=850000;
		
		System.out.println(i20.modelNo+" "+i20.name+" "+i20.price+" ");
	}

}
