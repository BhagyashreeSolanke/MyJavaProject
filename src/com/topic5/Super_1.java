package com.topic5;

class Flower{
	String colour="Red";
	
	void show() {
		System.out.println("Flower");
	}
}

class Rose extends Flower{
	String colour="Black";
    
	/*void show() {
		System.out.println("Rose colour = "+super.colour+" colour.");
	}*/
	
	void show() {
		System.out.println("Rose");
		super.show();
	}
}

public class Super_1 {
	public static void main(String args[]) {
		Rose r=new Rose();
		r.show();
	}

}
