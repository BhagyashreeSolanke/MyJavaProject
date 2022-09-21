package com.topic2;

import java.util.Scanner;

public class SingleOrDouble {
	public static void main(String[] args) {
		//Write a code to check if number is single digit or double digit?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		if(num>=0 && num<=9) {
			System.out.println("Single Digit");
		} else if(num>=10 && num<=99){
			System.out.println("Double Digit");
			
		} else {
			System.out.println("Large Digit");
		}
		
	}

}
