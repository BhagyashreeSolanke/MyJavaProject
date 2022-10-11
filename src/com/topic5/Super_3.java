package com.topic5;

class Bag
{
	String color="Black";
	
	Bag(String type)
	{
		System.out.println(type);
	}
	void show() {
		System.out.println("Bags");
	}
}
class Wildcraft extends Bag
{
	String colour="Navy Blue";
	
	Wildcraft()
	{
		super("School Bag");
		System.out.println("Hand Bag");
	}
	
	void show() {
		System.out.println("Wildcraft");
		super.show();
	}
	
}
public class Super_3 {
	

	public static void main(String[] args) {
		Wildcraft w=new Wildcraft();
		w.show();

	}

}
