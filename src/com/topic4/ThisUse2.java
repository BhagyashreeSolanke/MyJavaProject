package com.topic4;

class Customer
{
	int id;
	String name;
	String address;
	int item_price;
	int qty;
	int total_bill;
	
	public Customer(int id,String name,String address, int item_price,int qty)
	{
	this.id=id;
	this.name=name;
	this.address=address;
	this.item_price=item_price;
	this.qty=qty;		
	}
	
	public void calculate_Bill()
	{
		total_bill=qty*item_price;
	}
	void display()
	{
		if(qty>0) {
			this.calculate_Bill();
			System.out.println(id+" "+name+" "+address+" "+item_price+" "+qty+" "+total_bill+" ");
		}else {
			System.out.println("Quantity must be greater than zero.");
		}
	}
}

public class ThisUse2 {

	public static void main(String[] args) {
		Customer cust=new Customer(4587,"Shree","Pune",50,40);
		cust.display();

	}

}
