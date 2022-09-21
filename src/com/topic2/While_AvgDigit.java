package com.topic2;

import java.util.Scanner;

public class While_AvgDigit {
	//Write a code to find out an average of digit from the number?
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int sum=0;
		
		System.out.println("Enter Number :");
		int i = sc.nextInt();
		
		int count =0;
		
		while(i>0) {
			n=i%10;
			sum=sum+n;
			i=i/10;
			count++; //To count loop
		}
		  float avg = (sum/count);
		  System.out.println("Average = "+avg);
		
		
	}

}
