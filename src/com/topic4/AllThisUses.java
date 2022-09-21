package com.topic4;

class Student
{
	int roln;
	String name;
	int phy;
	int chem;
	int maths;
	int per;
	
	Student(int roln,String name,int phy,int chem,int maths)
	{
		this.roln=roln;
		this.name=name;
		this.phy=phy;
		this.chem=chem;
		this.maths=maths;	
	}
	Student()
	{
		this(201,"Shree",98,88,89);
		show_percent();
		if(per>40)
		{
			System.out.println(name+" "+"is passed.");
			show_details();
			show_percent();
		}else {
			System.out.println(name+" "+"is failed.");
		}
	}
	void show_details()
	{
		System.out.println("Roll no: "+roln+"\nName: "+name+"\nPhysics: "+phy+"\nChemistry: "+chem+"\nMathematics: "+maths+"\nPercentage: "+per+"%");
	}
	void show_percent() {
		int total = phy+chem+maths;
		per = 100*total/300;
	}
}

public class AllThisUses {

	public static void main(String[] args) {
		Student s=new Student();
		
		

	}

}
