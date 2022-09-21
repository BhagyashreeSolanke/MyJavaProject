package com.topic5;

import java.util.Scanner;

public class MissingNum2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Series of numbers upto 6:");
		int num=0;
		int sum=0;
		int totalsum=0;
		
		for(int i=1;i<=6;i++)
		{
			 num=sc.nextInt();
			 sum=sum+num;			 
		}
		System.out.println(sum);
		
		for (int i=1; i<=7;i++)
		{
			totalsum=totalsum+(i*i);
		}
		System.out.println("Total sum: "+totalsum);
		System.out.println("Missing Number is : "+(totalsum-sum));

	}

}
