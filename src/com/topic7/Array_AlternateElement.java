package com.topic7;

// Write a program to display alternate element from the array?

import java.util.Scanner; 

public class Array_AlternateElement {
	
	public static void display(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			if (arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int n=sc.nextInt();
		System.out.println("Enter Array elements: ");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		display(a);
	}

}
