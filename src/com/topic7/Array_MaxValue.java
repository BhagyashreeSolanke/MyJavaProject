package com.topic7;

import java.util.Scanner;

public class Array_MaxValue {
    public static int maxValue(int arr[])
    {
    	int max=Integer.MIN_VALUE;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(max<arr[i])
    		{
    			max=arr[i];
    		}
    	}
    	return max;
    }
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("Enter an elements: ");
        for(int i=0;i<a.length;i++)
        {
        	a[i]=sc.nextInt();
        }
        int result=Array_MaxValue.maxValue(a);
        System.out.println(result);
	}

}
