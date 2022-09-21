package com.topic1;

import java.util.Scanner;

public class GreatestNumber3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your first number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter your second number : ");
		int b = sc.nextInt();
		
		System.out.println("Enter your third number : ");
		int c = sc.nextInt();
		
		int ans = (a>b && a>c)?a:(b>a && b>c)?b:c;
		
		System.out.println("Greatest number is "+ans);
		

	}

}
