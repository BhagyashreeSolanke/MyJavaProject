package com.topic4;

public class Emp1 {
	int salary;
	public Emp1 getEmp(Emp1 e1) {
		e1.salary=10000;
		//return e1;
        //return this;	
        Emp1 x=new Emp1();
        x=e1;
        return x;
	}

	public static void main(String[] args) {
		Emp1 emp = new Emp1();
		Emp1 e = new Emp1();
		int sum=0;
		Emp1 e2=emp.getEmp(e);
		System.out.println(emp.salary);
		System.out.println(e.salary);
		System.out.println(e2.salary);
				
		}

}
