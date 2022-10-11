package com.topic7;

import java.util.Scanner;

public class Array_Prime {
	public static int prime_Sum(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			int n=arr[i];
			boolean isprime=true;
			for(int j=2;j<n;j++)
			{
				if(n%j==0)
					isprime=false;
				break;				
			}
			if(isprime==true)
			{
			   	sum=sum+arr[i];
			}
		}		
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int result=Array_Prime.prime_Sum(a);
		System.out.println(result);
	}

}
