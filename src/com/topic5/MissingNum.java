package com.topic5;

import java.util.Scanner;

public class MissingNum {

	public static void main(String[] args) {
		
		System.out.println("Enter 6 numbers of single digit: ");
		Scanner sc=new Scanner(System.in);
		int num=0;
		int sum=0;
		int totalsum=0;
		
		for (int i=1; i<=6; i++)
		{
			num=sc.nextInt();
			sum=sum+num;
		}
		System.out.println(sum);
		
		for (int i=1; i<=7;i++)
		{
			totalsum=totalsum+i;
		}
		System.out.println("Total Sum: "+totalsum);
		System.out.println("Missing Number is : "+(totalsum-sum));

	}

}
