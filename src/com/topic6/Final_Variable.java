package com.topic6;


public class Final_Variable {
	
	final int x;
	Final_Variable(){
		x=45;
	}
	
	void put() {
		//x=20;     //we can not reinitialise final variable.
	}
	
	void show() {
		System.out.println(" x = "+x);
		
	}

	public static void main(String[] args) {
       Final_Variable f= new Final_Variable();
       f.show();
       //f.put();
	}

}
