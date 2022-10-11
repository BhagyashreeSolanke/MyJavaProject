package com.topic6;

//Write a program to create abstract class and provide the implementation
//    to abstract method inside the child class and show the uses of super keyword
//    with parent and child. 

// Grand_Parent class:
abstract class Fighter_Plane{
	
	//Variable:
	String origin="Indian";
	
	//Constructor:
	Fighter_Plane(String wingType){
		System.out.println(wingType);
	}
	
	//Abstract method:
	abstract void engine();
}

//Parent Class:
abstract class MultiRole extends Fighter_Plane{
	
	//Constructor:
	MultiRole(String properties){
		super("Its wing type is detla.");
		System.out.println(properties);
	}
	
	// Abstract Method:
	abstract void designedBy();	
	
	// variable called by using super key word: 
	public void origin() {
		System.out.println("Its origin is "+super.origin);
	}
}

//child class:
class HAL_Tejas extends MultiRole{
	
	// Constructor:
	HAL_Tejas(){
		super("It is the smallest, lightest and second supersonic Fighter plane.");
	}
	
	//Implemented abstract method of Fighter_Plane(Grand parent class)
	public void engine() {
		System.out.println("It has Single engine. ");
	}
	
	//Implemented abstract method of MultiRole(parent class)
	public void designedBy() {
		System.out.println("It is designed by Aeronautical Development Agency.");
	}
	
	//Concrete Method:
	public void collabarationWith() {
		super.origin();
		System.out.println("It is collabation with Aircraft Research and Design Centre.");
	}
}
public class Abstract_7 {

	public static void main(String[] args) {
		HAL_Tejas t = new HAL_Tejas();
		t.collabarationWith();
		t.engine();
		t.designedBy();
		

	}

}
