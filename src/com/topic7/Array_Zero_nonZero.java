package com.topic7;

import java.util.Arrays;

public class Array_Zero_nonZero {

	public static void main(String[] args) {
		int[] a= {5,6,0,2,0,0,4};
        for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]!=0)
				{
					if(i!=j)
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			
		}
		System.out.print(Arrays.toString(a));

	}

}
