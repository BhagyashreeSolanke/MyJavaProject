package com.topic7;

import java.util.Arrays;

public class Array_ReverseInt {
	
	public static void reversArray(int a[])
	{
		int j=a.length-1;
		for(int i=0;i<a.length/2;i++)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int a[]= {5,6,2,3};
		System.out.println(Arrays.toString(a));
		System.out.println("---------------");
		reversArray(a);
		

	}

}
