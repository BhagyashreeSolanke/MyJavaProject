package com.topic2;

import java.util.Scanner;

public class Switch_AreaCircumPeri {
	public static void main(String[] args) {
	/*WAP in java using switch case for following: Area of a circle, Area of a square,
		Area of a right angled triangle, Area of a rectangle, Circumference of a circle, Perimeter of a square
		Accept inputs like radius,side,etc through keyboard.*/
		
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Which operation wants to perform?.....\n 1. Area of circle. \n 2. Area of a square. \n 3. Area of right angled triangle. \n 4. Area of rectangle. \n 5. Circumference of circle. \n 6. Perimeter of a square.");
        int ope = sc.nextInt();
        
        double Pi= 3.14;
        
        switch (ope){
        
        case 1: System.out.println("Radius of circle = ");
                int r = sc.nextInt();
        	    
        	    System.out.println("Area of circle = "+(Pi*r*r));
        	 break;
        
        case 2: System.out.println("Side of square = ");
                int a = sc.nextInt();
        
                System.out.println("Area of Square = "+(a*a));
             break;
        
        case 3: System.out.println("Base = ");
                int b = sc.nextInt();
                System.out.println("Height = ");
                int h = sc.nextInt();
                System.out.println("Area of right angled triangle = "+((b*h)/2));
             break;
        
        case 4: System.out.println("Length of rectangle = ");
                int l = sc.nextInt();
        
                System.out.println("Bredth of rectangle = ");
                int c = sc.nextInt();
        
                System.out.println("Area of Rectangle = "+(l*c));
             break;
         
        case 5: System.out.println("Radius =");
                 int d = sc.nextInt();
                 System.out.println("Circumference of circle = "+(2*Pi*d));
             break;
         
         case 6: System.out.println("Side of square =");
                 int x = sc.nextInt();
                 System.out.println("Perimeter of Square = "+(4*x));
             break;
             
         default: System.out.println("No Operation Available");
             break;                
        
        }
	}

}
