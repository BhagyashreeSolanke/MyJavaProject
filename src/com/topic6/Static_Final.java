
package com.topic6;

public class Static_Final {
	static final int x;  //Blank final variable
	static final int y;
	
// We can initialise static final variable in static block or we can at the time of variable declairation only.
	static {
		x=2;
		y=6;
	}
	
// In method we can not initialise the variable.
	void put() {
		//x=2;  
	}
	void show() {
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

	public static void main(String[] args) {
		Static_Final s= new Static_Final();
		s.show();

	}

}
