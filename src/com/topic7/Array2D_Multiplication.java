package com.topic7;

import java.util.Scanner;

public class Array2D_Multiplication {
	int mul;
	public static void mul(int a[][],int ar[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<mul[i].length;j++)
			{
				mul[i][j]=a[i][j]*ar[i][j];
			}
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int [][]a=new int[2][2];
		
		System.out.println("Enter an element for first 2D array: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		int[][]ar =new int[2][2];
		System.out.println("Enter an element for second 2D Array: ");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Displaying first 2D array");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Displaying second 2D array");
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		Array2D_Multiplication.mul(a,ar);

	}

}
