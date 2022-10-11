package com.topic7;

import java.util.Scanner;
import java.util.Arrays;

public class Array_Merge {
    public static int[] mergeArray(int a[], int b[])
    {
    	int c[]=new int[a.length+b.length];
    	int k=0;
    	for(int i=0;i<a.length;i++)
    	{
    		c[k]=a[i];
    		k++;
    	}
    	for(int i=0;i<b.length;i++)
    	{
    		c[k]=b[i];
    		k++;
    	}
    	return c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter int elements array 1.");
       int a[]=new int[5];
       for(int i=0;i<a.length;i++)
       {
    	   a[i]=sc.nextInt();
       }
       System.out.println("Enter int elements array 2");
       int b[]=new int[5];
       for(int i=0;i<b.length;i++)
       {
    	   b[i]=sc.nextInt();       }
       System.out.println(Arrays.toString(Array_Merge.mergeArray(a,b)));

	   }
       }
