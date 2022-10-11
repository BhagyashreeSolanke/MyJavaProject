package com.topic7;

import java.util.Scanner;
import java.util.Arrays;

public class Array_Merge_duplicate {
	public static int[] merge(int[] a,int[] b)
	{
		int c[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(int j=0;j<b.length;j++)
		{
			c[k]=b[j];
			k++;
		}
		
		return c;
	}
	public static void main(String[] arg)
	{
		Scanner sc= new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter first 2D Array elements");
		for(int i=0;i<a.length;i++)
		{
			 a[i]=sc.nextInt();
		}
		int[] b=new int[5];
		System.out.println("Enter second 2D Array elements");
		for(int j=0;j<b.length;j++)
		{
			b[j]=sc.nextInt();
		}
		System.out.println(Arrays.toString(Array_Merge_duplicate.merge(a,b)));
		
	}

}
