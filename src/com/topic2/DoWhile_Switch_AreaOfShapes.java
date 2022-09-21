package com.topic2;

import java.util.Scanner;

public class DoWhile_Switch_AreaOfShapes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch;
		do {
			System.out.println("Area of :\n 1 Circle\n 2 Rectangle \n 3 Tringle \n 4 Square");
			
			int ope = sc.nextInt();

			switch(ope)
			{
			case 1: System.out.println("Radius of circle:");
			        int r = sc.nextInt();
			        double Pi = 3.14;
			
			        System.out.println("Area of Circle = "+(Pi*r*r));
			        break;
			
			case 2: System.out.println("Length of rectangle : ");
			        int l = sc.nextInt();
			        
			        System.out.println("Bredth of rectangle : ");
			        int b = sc.nextInt();
			        
			        System.out.println("Area of Rectangle = "+(l*b));
			        break;
			        
			case 3: System.out.println("Base of triangle :");
			        int be = sc.nextInt();
			        
			        System.out.println("Height of triangle :");
			        int h = sc.nextInt();
			        
			        System.out.println("Area of Triangle"+((be*h)/2));
			        break;
			        
			case 4: System.out.println("Side of square : ");
			        int a = sc.nextInt();
			        
			        System.out.println("Area of Square = "+(a*a));
			        break;
			default:System.out.println("Invalid choice!");
			        break;
			}
			System.out.println("Do you want to comtinue......?\n if yes press y.");
			ch=sc.next().charAt(0);
			
		}while(ch=='y'||ch=='Y');
	}

}
