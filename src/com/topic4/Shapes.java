package com.topic4;

public class Shapes {
	public void area(int r)
	{
		System.out.println("Area of circle: "+(3.14*r*r)+"cm");
	}
	public int area(int x, int y)
	{
		return x*y;
	}
    public float area(float c, int b) 
    {
    	return (float) (0.5*c*b);
    }
	public static void main(String[] args) {
		Shapes a=new Shapes();
		a.area(2);
		System.out.println("Area of rectangle: "+a.area(5, 6)+"cm");
		System.out.println("Area of triangle: "+a.area(4.2f, 5));
	}

}
