package com.topic6;

class Animal3
{
	final int legs = 4;
	
	final void run() {
		System.out.println("Animal is running...");
	}
}
  class Dog3 extends Animal3 {
	public void show() {
		System.out.println(legs);
	}
}
public class Final_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog3 d = new Dog3();
        d.show();
	}

}
