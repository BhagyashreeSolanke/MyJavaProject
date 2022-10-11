package com.topic7;

public class Array_SearchElemen {
	public static int[] sortArray(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j = i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					int temp=ar[i];
					ar[j]=temp;
				}
			}
		}
		return ar;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {4,7,2,9,1,3};
        System.out.println(Array_SearchElemen.sortArray(a));
	}
}
