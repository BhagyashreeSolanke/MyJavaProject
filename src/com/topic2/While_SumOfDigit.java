package com.topic2;

import java.util.Scanner;

public class While_SumOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int sum = 0;
		
		System.out.println("Enter Number :");
		int i = sc.nextInt();
		
		while(i>0){
			
			n=i%10;
			sum=sum+n;
			i=i/10;
			
		}
		System.out.println("Sum is "+sum);
		
	}

}
