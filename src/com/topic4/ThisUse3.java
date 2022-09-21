package com.topic4;

class Order
{
	int ono;
	String city;
	int cust_id;
	int status;
	
	Order(int ono,String city,int cust_id,int status)
	{
		this.ono=ono;
		this.city=city;
		this.cust_id=cust_id;
		this.status=status;
	}
	Order()
	{
		this(1,"Pune",2338,10);
		if(status==0)
		{
			System.out.println("Your order is out for delivery.");
		}else {
			System.out.println("Order is delivered.");
			show_OrderDetails();
		}
	}
	void show_OrderDetails()
	{
		System.out.println(ono+" "+city+" "+cust_id+" "+status+" ");
	}
}

public class ThisUse3 {

	public static void main(String[] args) {
		Order o=new Order();
      


	}

}
