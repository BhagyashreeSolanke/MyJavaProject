package com.topic3;

public class Student_Shree {
	public static void main(String [] args)
	{
		Student s=new Student();
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.std);
		// System.out.println(s.bloodGrp);  ----Can't access bcoz its private variable of student class.
	}

}
