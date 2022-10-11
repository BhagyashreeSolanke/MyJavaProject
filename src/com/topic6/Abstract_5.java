package com.topic6;

abstract class Vehical1
{
	abstract void run();
}
abstract class Car1 extends Vehical1
{
	abstract void stop();
	
	void run()
	{
		System.out.println("Car is running...");
	}
}
class Audi extends Car1
{
	void stop()
	{
		System.out.println("Audi is stopped.");
	}
}
public class Abstract_5 {

	public static void main(String[] args) {
		
		Audi a= new Audi();
		a.run();
		a.stop();
		
		Car1 c=new Audi();
		c.run();
		c.stop();
		
		Vehical1 v=new Audi();
		v.run();
	//	v.stop();  // this method we cant call bcoz it is abstract method of parent.
		
		
	//	Vehical1 b=new Car1();  we can not instantiate this bcoz parent contain abstract method.
		
		

	}

}
