package com.topic7;

import java.util.Scanner;

//Write a code to count odd element from the array?
public class Array_CountOddNo {
	
	public static int odd(int[] arr)
	{
		int count=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2!=0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		System.out.println("Enter an Array elements: ");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int c=Array_CountOddNo.odd(a);
		System.out.println(c);
		

	}

}
