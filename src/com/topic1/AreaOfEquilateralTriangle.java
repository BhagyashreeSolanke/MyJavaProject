package com.topic1;
import java.util.Scanner;

public class AreaOfEquilateralTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Side = ");
		int a = sc.nextInt();
		
		
		double area = (1.7*a*a)/4;
		
		System.out.println("Area of Equilateral Triangle = "+area);
		
	}

}
