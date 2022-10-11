package com.topic7;

// WAC to calculate the average of odd elements from the array?

import java.util.Scanner;

public class Array_AvgOdd {
	
	public static int averageOfOdd(int [] arr) {
		int average;
		int count=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0)
			{
				sum=sum+arr[i];
				count++;
			}
		}
		average=sum/count;
		return average;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
         int result=Array_AvgOdd.averageOfOdd(a);
         System.out.println(result);
	}

}
