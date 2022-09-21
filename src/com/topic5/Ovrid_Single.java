package com.topic5;

class Animal1{
	int legs;
	void read(int legs) {
		this.legs=legs;
	}
}
class Dog1 extends Animal1{
	@Override
	public void read(int s) {
		System.out.println("Dogs=");
	}
	void show() {
		System.out.println("Dog has "+legs+" legs");
	}
}

public class Ovrid_Single {

	public static void main(String[] args) {
		

	}

}
