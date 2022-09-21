package com.topic3;

public class Student {
	
	public int id=123;
	protected String name="Shreenit";
	char std='I';
	private String bloodGrp="B+";
	
	public static void main(String [] args)
	{
		Student st = new Student();
		System.out.println("ID = "+st.id);
		System.out.println("Name = "+st.name);
		System.out.println("Standard = "+st.std);
		System.out.println("Blood Group = "+st.bloodGrp);
	}
	

}
