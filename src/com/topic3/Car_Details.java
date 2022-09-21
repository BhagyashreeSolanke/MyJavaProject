package com.topic3;

public class Car_Details {
	
	public static void main(String[] args)
	{
		Car cr=new Car();
		
		System.out.println(cr.getModelno());
		System.out.println(cr.getName());
		System.out.println(cr.getPrice());
		System.out.println(cr.getSpeed());
		
		cr.setModelno(007);
		cr.setName("Sonet");
		cr.setPrice(1400000);
		cr.setSpeed(125);
		
		
		System.out.println(cr.getModelno());
		System.out.println(cr.getName());
		System.out.println(cr.getPrice());
		System.out.println(cr.getSpeed());
		
	}

}
