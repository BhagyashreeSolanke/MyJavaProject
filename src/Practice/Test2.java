package Practice;
class Papa{
	
	void home()
	{
		System.out.println("Papa likes simple home.");
	}
}
class Child extends Papa{
	@Override
	void home()
	{
		
	    System.out.println("Child like duplex home");	
	}
	
}
class Test2 {

	public static void main(String[] args) 
	{
	   Child c=new Child();
	   c.home();

	}

}
