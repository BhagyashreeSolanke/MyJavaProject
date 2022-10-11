package com.topic7;

import java.util.Scanner;

public class Array_SearchElement {
	public static boolean checkElement(int[]a,int n)
	{
		boolean isPresent=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				isPresent=true;
				break;
			}
		}
		return isPresent;
	}
	

	public static void main(String[] args) {
		int a[]= {1,3,4,5,6,7,8,13};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an element for search: ");
		int num=sc.nextInt();
		
		boolean isPresent=Array_SearchElement.checkElement(a, num);
		if(isPresent)
		{
			System.out.println("Element is present.");
		} else {
			System.out.println("Element is not present.");
		}
		

	}

}
