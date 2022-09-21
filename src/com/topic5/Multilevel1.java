package com.topic5;
class Mobile
{
	String brandName;
}
class Apple extends Mobile
{
	String RAM;
}
class IPhonePro extends Apple
{
	String Camera="32pixel";
	void show()
	{
		brandName="x";
		RAM="128 GB";
		System.out.println(brandName+" "+RAM+" "+Camera);
	}
}
public class Multilevel1 {

	public static void main(String[] args) {
		IPhonePro p=new IPhonePro();
		p.show();
	}
}
