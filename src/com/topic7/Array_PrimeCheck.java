package com.topic7;

import java.util.Scanner;

public class Array_PrimeCheck {
	public static boolean checkPrime(int ar[])
	{
		boolean isPrime=true;
		for(int i=2;i<ar.length;i++)
		{
			int n=ar[i];
			if(n%i==0)
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter array size:");
       int n=sc.nextInt();
       int a[]=new int[n];
       System.out.println("Enter an elements: ");
       for(int i=0;i<a.length;i++)
       {
    	   a[i]=sc.nextInt();
       }
       int sum=0;
       for(int i=0;i<a.length;i++)
       {
    	   if(checkPrime(a[i]))
    	   {
    		   sum=sum+a[i];
    	   }
       }
       System.out.println(sum);
	}

}
