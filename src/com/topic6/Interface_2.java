package com.topic6;

interface Printable1{
	int x=12;
	void print();
}

 // In interface we use "implements" instead of "extends".
class Doc implements Printable1 {
	
// while implementing parent abstract method in child class its mandatory to declair method as a public. 	
	public void print() {
		System.out.println("Doc is printing..");
	}
}
public class Interface_2 {

	public static void main(String[] args) {
		Printable1 p=new Doc();
		p.print();
		System.out.println(p.x);

	}

}
