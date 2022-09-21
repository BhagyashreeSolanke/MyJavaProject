package com.topic2;

import java.util.Scanner;

public class IfElse_DaysInMonth {

	public static void main(String[] args) {
		
		// Write a Java program print total number of days in a month 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a month : ");
		
		String mn = sc.next();
		
		if(mn.equals("February")){
			System.out.println("Days = 28 or 29");
		}
		else if(mn.equals("April") || mn.equals("June") || mn.equals("September") || mn.equals("November")) {
			System.out.println("Days = 30");
		}
		else  {			
			System.out.println("Days = 31");
		}
	}

}
