package com.topic2;

import java.util.Scanner;

public class SumOfFisrtNLastDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int count=0;
		int copy=num;
		int lastDigit=0;
		
		while(num>0) {
			count++;
			num=num/10;
		}
		System.out.println(count);
		num=copy;
		System.out.println(num);
		double first=num/Math.pow(10, count-1);
		System.out.println(first);
		num=copy;
		lastDigit=num%10;	
		System.out.println(lastDigit);
		
		
		System.out.println("Sum of first and last digit is "+(lastDigit+(int)first));

     

	}

}
