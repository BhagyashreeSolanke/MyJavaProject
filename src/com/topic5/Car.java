package com.topic5;

class Engine
{
	int engNo;
	String engType;
	
	Engine(int engNo, String engType)
	{
		this.engNo=engNo;
		this.engType=engType;
	}
//	void display_engDetails()
//	{
//		System.out.println(engNo+" "+engType+" ");
//	}
	
	public String toString()
	{
		return engNo+" "+engType;
	}
}
class Gear
{
	String grType;
	Gear(String grType)
	{
		this.grType=grType;
	}
	
//	void display_grType()
//	{
//		System.out.println(grType);
//	}
	
	public String toString()
	{
		return grType;
	}
}

public class Car {
	int modelNo;
	String name;
	int price;
	Engine eng;
	Gear gr;
	Car(int modelNo, String name, int price, Engine eng, Gear gr)
	{
		this.modelNo=modelNo;
		this.name=name;
		this.price=price;
		this.eng=eng;
		this.gr=gr;
	}
	
	
//	void show_carDetails()
//	{
//		System.out.println(modelNo+" "+name+" "+price);
//		gr.display_grType();
//		eng.display_engDetails();
//	}
	
	public String toString()
	{
		return modelNo+" "+name+" "+price+" "+eng+" "+gr;
	}
	

	public static void main(String[] args) {
		
		Car c = new Car(652,"MG Hector",5000000,new Engine(561,"Petrol"),new Gear("Manual"));
		System.out.println(c);
		
//		Engine e= new Engine(561,"Petrol");
//		Gear g=new Gear("Manual");		
//        Car c=new Car(234,"MG Hector",5000000,e,g);
//        c.show_carDetails();
        

	}

}
