package com.topic6;

abstract class Vehical
{
	abstract void run();
}
abstract class Car extends Vehical
{
	abstract void stop();
}
class BMW extends Car
{
	public void run()
	{
		System.out.println("BMW is running..");
	}
	public void stop()
	{
		System.out.println("BMW is Stopped.");
	}
}

public class Abstract_4 {

	public static void main(String[] args) {
		
		BMW b= new BMW();
		b.run();
		b.stop();
		
		Car c=new BMW();
		c.run();
		c.stop();
		
		Vehical v= new BMW();
		v.run();
	//	v.stop();   can not execute bcoz stop abstract method is not present in grandparent.
		
		//Vehical w=new Car(); can not execute bcoz no concrete method present.
		
		
		

	}

}
