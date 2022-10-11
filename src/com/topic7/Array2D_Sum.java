package com.topic7;

import java.util.Scanner;

public class Array2D_Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][]arr=new int[2][2];
		System.out.println("Enter an elements for first 2D array");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
        
		
		
		int[][]a=new int[2][2];
		System.out.println("Enter an elements for second 2D array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("**** Displaying First 2-D Array ****");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("#### Displaying Second 2-D Array ####");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----Sum of 2-D Array -----");
		
		int[][]sum=new int [2][2];
		for(int i=0;i<sum.length;i++)
		{
			for(int j=0;j<sum[i].length;j++)
			{
				sum[i][j]=arr[i][j]+a[i][j];
			}
		}
		
		for(int i=0;i<sum.length;i++)
		{
			for(int j=0;j<sum[i].length;j++)
			{
				System.out.print(sum[i][j]+" ");				
			}
			System.out.println();
		}
	}

}
