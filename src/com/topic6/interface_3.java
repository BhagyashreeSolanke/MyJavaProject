package com.topic6;
interface Printable2{

	int x=12;
	
	void print();
	
	default void show()
	{
		System.out.println("Show mthod");
	}
	static void edit() {
		System.out.println("Edit before print..");
	}
}
class Doc1 implements Printable2{
	public void print() {
		System.out.println("Document printed.");
	}
}
public class interface_3 {

	public static void main(String[] args) {
		
		Doc1 d=new Doc1();
		d.show();
		d.print();
		System.out.println(d.x);
	//	d.edit();   //we can not take bcoz its static method so instead of this we can do
		Printable2.edit();
		
		Printable2 p= new Doc1();
		p.show();
		p.print();
		System.out.println(p.x);
		Printable2.edit();

	}

}
