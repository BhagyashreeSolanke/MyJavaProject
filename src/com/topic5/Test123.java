package com.topic5;

import java.util.Scanner;

public class Test123 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int d;
		int first=0;
		
		int l=n%10;
		
		while(n>0)
		{
			d=n%10;
			if((n/10)==0)
			{
			  first=d;
			}
			n=n/10;
			
		}
		int sum=first+l;
		System.out.println(sum);
		

	}

}
