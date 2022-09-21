package com.topic2;

import java.util.Scanner;

public class WhileIfElse_SpyNo {
	// Write a code to check number is a spy number or not?
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m;
		int sum=0;
		int mul=1;
		
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		
		while(num>0) {
			m=num%10;
			mul=mul*m;
			sum=sum+m;
			num=num/10;
		}
		if (sum==mul) {
			System.out.println("Spy Number.");
		}
		else {
			System.out.println("Not Spy Number.");
		}
	}

}
