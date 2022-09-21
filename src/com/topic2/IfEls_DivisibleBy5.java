package com.topic2;

import java.util.Scanner;

public class IfEls_DivisibleBy5 {
	public static void main(String [] args) {
		//Write code to check number is divisible by 5 or not?
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number = ");
		
		int num = sc.nextInt();
		
		if (0==num % 5)
		{
		System.out.println("Number is divisible by 5.");
	}
		else {
			System.out.println("Number is not divisible by 5.");
		}
	}
}
	
