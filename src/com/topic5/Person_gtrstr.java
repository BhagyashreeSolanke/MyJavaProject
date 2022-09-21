package com.topic5;

 class Address1 {
	 private int pincode;
	 private String city;
	 
	 public void setPincode(int pincode)
	 {
		 this.pincode=pincode;
     }
	 public void setCity(String city)
	 {
		 this.city=city;
	 }
	 public int getPincode()
	 {
		 return pincode;
	 }
	 public String getCity()
	 {
		 return city;
	 }
 }
public class Person_gtrstr {
	
	private int id;
	private String name;
	private Address1 adr;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setadr(Address1 adr)
	{
		this.adr=adr;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Address1 getadr()
	{
		return adr;
	}
	
	public static void main(String [] args)
	{
		Person_gtrstr p = new Person_gtrstr();
		p.setId(121);
		p.setname("Pruthviraj");
		p.setadr(new Address1());
		
		Address1 a=p.getadr();
		a.setCity("Pune");
		a.setPincode(412115);
		
		System.out.println(p.getId()+" "+p.getName()+" "+p.getadr().getCity()+" "+p.getadr().getPincode());
		
	}
	
}
