package com.topic4;

class Car
{ 
	int model;
	String name;
	int price;
	
	public Car(int model,String name,int price)
	{
		this.model=model;
		this.name=name;
		this.price=price;
	}
	void display()

	{
		System.out.println(model+" "+name+" "+price+" ");
	}
	
}

public class ThisUse1 {

	public static void main(String[] args) {
		Car c=new Car(5648,"Audi",5600000);
		c.display();

	}

}
