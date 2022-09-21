package com.topic3;

public class Shopping {
	String atom_name;
	int quantity;
	int pricePerAtom;
	int total;
	void acceptDetails(String aname,int qua,int price)
	{
		atom_name=aname;
		quantity=qua;
		pricePerAtom=price;
	}
	void calculateBill()
	{
		if(quantity>0) {
			total=pricePerAtom*quantity;
		}else {
			System.out.println("Error");
		}
	}
	void displayShoppingDetails()
	{
		if(quantity>0)
			{
			System.out.println("Purchased Details : \n"+" Atom Name = "+atom_name+"\n Quantity of atom = "+quantity+"\n Price Per Atom = "+pricePerAtom+"\n Total Bill = "+total);
			}
	}
	public static void main(String[] args)
	{
		Shopping sp=new Shopping();
		sp.acceptDetails("Cadbury", 0, 10);
		sp.calculateBill();
		sp.displayShoppingDetails();
	}

}
