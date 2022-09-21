package com.topic5;

class Pen
{
	private int price;
	private String colour;
	private String bName;
	
	public void setPrice(int price)
	{
	  this.price=price;	
	}
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	public void setBname(String bName)
	{
		this.bName=bName;
	}
	public int getPrice()
	{
		return price;
	}
	public String getColour()
	{
		return colour;
	}
	public String getBname()
	{
		return bName;
	}
}

public class Bag_gtrstr {
	
	private String brandName;
	private int bPrice;
	private Pen pn;
	
	public void setBrandName(String brandName)
	{
		this.brandName=brandName;
	}
	public void setBprice(int bPrice)
	{
		this.bPrice=bPrice;
	}
	public void setPn(Pen pn)
	{
		this.pn=pn;
	}
	public String getBrandName()
	{
		return brandName;
	}
	public int getBprice()
	{
		return bPrice;
	}
	public Pen getPn()
	{
		return pn;
	}
	
	public static void main(String [] args)
	{
		Bag_gtrstr b=new Bag_gtrstr();
		b.setBprice(1500);
		b.setBrandName("WildCraft");
		b.setPn(new Pen());
		
		Pen p=b.getPn();
		p.setBname("Renold");
		p.setColour("Blue");
		p.setPrice(5);
		
		System.out.println(b.getBprice()+" "+b.getBrandName()+" "+b.getPn().getBname()+" "+b.getPn().getColour()+" "+b.getPn().getPrice());
	}
}