package com.topic6;

// Create a one abstract class which contain one integer type of variable,
//  create an interface which contain integer type variable and in child class
//  perform the addition of interface variable and abstract class variable.

abstract class Alpha{
	int x=2;
	
	
}
interface Beatable{
	public static final int y=1;
	 
}

class Gama extends Alpha implements Beatable
{
	void add()
	{
		System.out.println(x+y);
	}
}
public class Interface_Abstract {

	public static void main(String[] args) {
		Gama g=new Gama();
		g.add();

	}

}
