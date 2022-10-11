package com.topic5;

class Furniture
{
	String brandName="Nilkamal";
	
  // Constructor:	
	Furniture(String type)
	{
		System.out.println(type);
	}
  // Method:
	void show()
	{
		System.out.println("Furniture");
	}
}
class Chair extends Furniture
{
	String brandName="Nilkamal Relaxing";
	
	Chair()
	{
		
		super("Wooden Furniure");
		System.out.println("Plastic Chair");
	}
	
	void show()
	{
		System.out.println("Chair");
		super.show();
	}
	
	
}
public class Super_4 {

	public static void main(String[] args) {
		Chair c = new Chair();
		c.show();
		

	}

}
