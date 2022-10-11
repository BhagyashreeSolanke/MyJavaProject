package com.topic6;
      
       // Overload the Final type of method.

public class Final_Overload {
	
	 final void calculate(int a)
	 {
		 System.out.println(a);
	 }
	 final void calculate(int a,int b)
	 {
		 System.out.println(a*b);
	 }
	 final float calculate(float a, float b)
	 {
		 return (a+b);
	 }
	 final void calculate(int a,float b)
	 {
		 System.out.println(a-b);
	 }

	public static void main(String[] args) {
		
		Final_Overload f=new Final_Overload();
		f.calculate(5);	
		f.calculate(15, 5.5f);
		f.calculate(5, 6);		
		System.out.println(f.calculate(15.2f, 56.5f));
	}

}
