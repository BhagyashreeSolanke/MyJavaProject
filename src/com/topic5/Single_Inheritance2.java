package com.topic5;

class Bike
{
	int cc=125;
}
class FzYamaha extends Bike
{
	void show()
	{
		System.out.println("Fz Yamaha bike has "+cc+" cc power.");
	}
}
public class Single_Inheritance2 {

	public static void main(String[] args) {
		FzYamaha f=new FzYamaha();
		f.show();
	}
}
