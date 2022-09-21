package com.topic5;

class Vehical
{
	int Wheels;
	void show() {
		System.out.println("Vehical");
	}
}
class Car1 extends Vehical
{
	void showCar1()
	{
		Wheels=4;
		System.out.println("Car="+Wheels);
	}
}
class Truck extends Vehical
{
	void showTruck()
	{
		Wheels=12;
		System.out.println("Truck="+Wheels);
	}
}
public class Hier_1 {

	public static void main(String[] args) {
		/*Car1 c=new Car1();
		c.showCar1();
		Truck t=new Truck();
		t.showTruck();*/
		
		Vehical v=new Car1();
		v.show();
		
		Vehical a =new Truck();
		v.show();

	}

}
