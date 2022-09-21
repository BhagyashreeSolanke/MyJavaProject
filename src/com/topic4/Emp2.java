package com.topic4;

public class Emp2 {
	int salary=20000;
	public void getEmp(Emp2 e1) {
		System.out.println(e1.salary);
	}
	public void input()
	{
		/*Emp2 e=new Emp2();
		this.getEmp(e);*/
		
		//this.getEmp(new Emp2());
		
		this.getEmp(this);
	}
	

	public static void main(String[] args) {
      Emp2 emp=new Emp2();
      emp.input();
	}

}
