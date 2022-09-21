package com.topic2;

import java.util.Scanner;

public class Ternary_GreatestNumber3 {

	public static void main(String[] args) {
		// Write a code to check greatest number between three numbers using Ternary operator?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number1 = ");
		int Number1 = sc.nextInt();
		
		System.out.println("Number2 = ");
		int Number2 = sc.nextInt();
		
		System.out.println("Number3 = ");
		int Number3 = sc.nextInt();
		
		
		String Ans = Number1>Number2? "Greatest number is "+Number1:Number2>Number3?"Greatest number is "+Number2:"Greatest number is "+Number3;
		System.out.println(Ans);

	}

}
