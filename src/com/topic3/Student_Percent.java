package com.topic3;

public class Student_Percent {
	int id;
	String name;
	int phy,chem,maths;
	float percent;
	void acceptDetails(int i,String n,int p,int c,int m)
	{
		id=i;
		name=n;
		phy=p;
		chem=c;
		maths=m;
	}
	void calculatePercent() 
	{
		int total=phy+chem+maths;
		percent=((100*total)/300);
	}
    void display()
    {
    	System.out.println("ID = "+id+" name = "+name+" physics = "+phy+" Chemistry = "+chem+" Maths = "+maths+" Percentage = "+percent);
    }
    public static void main(String[] args)
    {
    	Student_Percent a=new Student_Percent();
    	a.acceptDetails(101, "Shreenit", 95, 85, 96);
    	a.display();
    	a.calculatePercent();
    	a.display();
    }
}
