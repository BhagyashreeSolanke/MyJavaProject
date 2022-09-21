package com.topic5;

class Department1
{
	int did;
	String dname;
	
	Department1(int did, String dname)
	{
		this.did=did;
		this.dname=dname;
	}
	public String toString()
	{
		return did+" "+dname;
	}
}

public class Employee_Constructor {
	
	int id;
	String ename;
	int salary;
	Department1 dept;
	
	Employee_Constructor(int id, String ename,int salary, Department1 dept)
	{
		this.id=id;
		this.ename=ename;
		this.salary=salary;
		this.dept=dept;
	}
	public String toString()
	{
		return id+" "+ename+" "+salary+" "+dept;
	}
	
	public static void main (String [] args)
	{
		Employee_Constructor e=new Employee_Constructor(231,"Ruturaj",2300000,new Department1(561,"Manager"));
		System.out.println(e);
		
	}

}
