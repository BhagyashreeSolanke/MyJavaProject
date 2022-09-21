package com.topic5;

class Animal2
{
	int legs;
	public void read(int legs) {
		this.legs=legs;
	}
}
class Dog extends Animal2{
	
	@Override
	public void read(int s) {
		System.out.println("Dogs=");
	}
	void show() {
		System.out.println("Dog has "+legs+" Legs.");
	}
}

public class Single_Inheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.read(2);
		d.show();

	}

}
