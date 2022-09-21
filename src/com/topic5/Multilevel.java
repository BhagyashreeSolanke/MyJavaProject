package com.topic5;

class Animal{
	String type;
}
class Harbi extends Animal{
    int legs;
}
class Cat extends Harbi{
	String tale="Short";
	void show()
	{
		type = "Pet";
		legs = 4;
		System.out.println(type+" "+legs+" "+tale);
	}
	
}
public class Multilevel{
	public static void main(String [] args) {
	Cat c=new Cat();
	c.show();
	
	}
}
