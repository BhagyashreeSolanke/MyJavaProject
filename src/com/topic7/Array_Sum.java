package com.topic7;

import java.util.Scanner;

public class Array_Sum {
	
	public static int sum(int[] ar) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int n=sc.nextInt();
		System.out.println("Enter an elements: ");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int result=Array_Sum.sum(a);
		System.out.println("Sum of elements are "+result);
	}

}
