package com.topic7;

class Emp
{
	int eid;
	String ename;
	
	Emp(int eid, String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}
	public String toString()
	{
		return eid+" "+ename;
	}
}

public class Array_Deparment {
	
	int id;
	String name;
	Emp e;
	Array_Deparment(int id, String name,Emp e)
	{
		this.id=id;
		this.name=name;
		this.e=e;
	}
	public String toString()
	{
		return id+" "+name+" "+e;
	}

	public static void main(String[] args) {
		Array_Deparment d[]=new Array_Deparment[3];
		d[0]=new Array_Deparment(1,"HR",new Emp(101, "Amit"));
		d[1]=new Array_Deparment(2,"Sales",new Emp(102,"Shreya"));
		d[2]=new Array_Deparment(3,"Finance",new Emp(103,"Bhagyashree"));
		
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
	}

}
