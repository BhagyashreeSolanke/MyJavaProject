package com.topic5;


	class Department
	{
		private int did;
		private String dname;
		
		public void setDid(int did) 
		{
		   this.did=did;
		}
		public void setDname(String dname)
		{
			this.dname=dname;
		}
		public int getDid()
		{
			return did;
		}
		public String getDname()
		{
			return dname;
		}
		
	}
	
	public class Employee_getrsetr {
		private int id;
		private String ename;
		private int salary;
		private Department dept;
		
		public void setId(int id)
		{
			this.id=id;
		}
		public void setEname(String ename)
		{
			this.ename=ename;
		}
		public void setSalary(int salary)
		{
			this.salary=salary;
		}
		public void setDept(Department dept)
		{
			this.dept=dept;
		}
		public int getId()
		{
			return id;
		}
		public String getEname()
		{
			return ename;
		}
		public int getSalary()
		{
			return salary;
		}
		public Department getDept()
		{
			return dept;
		}
		
	public static void main(String[] args) {
         
		Employee_getrsetr e = new Employee_getrsetr();
		e.setId(101);
		e.setEname("Yash");
		e.setSalary(1200000);
		e.setDept(new Department());
		
		Department d = e.getDept();
		d.setDid(10);
		d.setDname("Sales");
		
		System.out.println(e.getId()+" "+e.getEname()+" "+e.getSalary()+" "+e.getDept().getDid()+" "+e.getDept().getDname());

	}

}
