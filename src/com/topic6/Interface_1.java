package com.topic6;

interface Printable{
	//contain abstract method -- no need to write "abstract" before void.
	void print();
}
class Document implements Printable {
	public void print() {
		System.out.println("Document printed..");
	}
}
public class Interface_1 {

	public static void main(String[] args) {
		Printable p=new Document();
		p.print();
		

	}

}
