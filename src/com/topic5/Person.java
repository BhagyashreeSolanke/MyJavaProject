package com.topic5;

class Address{
	int pincode;
	String city;
	Address(int pincode, String city)
	{
		this.pincode=pincode;
		this.city=city;
	}
//	void show_Address()
//	{
//		System.out.println(pincode+" "+city);
//	}
	
	public String toString()
	{
		return pincode+" "+city;
	}
}

public class Person {
	int id;
	String name;
	Address adr;
	
	Person(int id, String name, Address adr)
	{
		this.id=id;
		this.name=name;
		this.adr=adr;
	}
//	void show_persondetails()
//	{
//		System.out.println(id+" "+name+" ");
//		adr.show_Address();
//	}

	public String toString()
	{
		return id+" "+name+" "+adr;
	}
	public static void main(String[] args) {
		
		Person p = new Person(23,"Shreenit",new Address(123,"Pune"));
		System.out.println(p);
//		Address a = new Address(123,"Pune");
//		Person p = new Person(23,"Shreenit",a);
//		p.show_persondetails();
	}
}
