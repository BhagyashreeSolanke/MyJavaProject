package com.topic7;

import java.util.Scanner;

public class Array_MaxColoum {
	
	public static void maxInColoum(int[][] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			int max=ar[0][i];
			for(int j=0;j<ar[i].length;j++)
			{
				if(max<ar[j][i])
				{
					max=ar[j][i];
					
				}
				System.out.print(ar[i][j]+" ");
			}
			System.out.print(" = "+max);
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[3][3];
		System.out.println("Enter an element: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		maxInColoum(a);
	}

}
