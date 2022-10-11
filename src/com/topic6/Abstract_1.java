package com.topic6;

abstract class Mobile{
	abstract void ringing();
	
	
}

class Apple1 extends Mobile{
	void ringing() {
		System.out.println("Apple is ringing..");
	}
}
public class Abstract_1 {
	public static void main(String[] args) {
		Apple1 a=new Apple1();
		a.ringing();
		
		
		Mobile m=new Apple1();
		m.ringing();
		
	}

}
