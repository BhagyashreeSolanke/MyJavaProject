package com.topic2;

import java.util.Scanner;

public class Switch_GreatestNo2 {
	public static void main(String [] args) {
		//Find which is greatest  number in between 2 numbers  using switch.
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter two number : ");
		a = sc.nextInt();
		b = sc.nextInt();
		int i;
		if(a>b)
		{i=0;
			
		}
		else
			i=1;
		
		switch(i) {
		
		case 0: 
            System.out.println("maximum number " + a);
            break;
        case 1: 
            System.out.println("maximum number " + b);
            break;
        default:
            System.out.println("Both are equal");
            break;  
		
		}
		
	}

}
