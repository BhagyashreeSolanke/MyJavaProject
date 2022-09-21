package com.topic2;

import java.util.Scanner;

public class WhileIfIfElse_PrimeNo {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter Number :");
		int n = sc.nextInt();
		
		int i=2;
		
		boolean isprime = true;
		
		while(i<n) {
			if(n%i==0)
			{
				isprime=false;
				
				break;
			}
		    i++;
		}
		
		if(isprime==true) {
		System.out.println("Prime Number.");   		
		}
		else {
		System.out.println("Not Prime Number");
	}
		
		}
	}


