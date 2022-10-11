package com.topic7;

import java.util.Scanner;

public class Array_AlternateElemen {
	
	public static void alter(char[] arr) {
		int t=0;
		for(int i=0;i<arr.length;i++) {
			 t=(char) (arr[i]+2);
		System.out.print((char)t+" ");	
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		char a[]=new char[n];
		System.out.println("Enter array char element: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.next().charAt(0);
		}
		/*for(char c:a)
		{
			System.out.println(c);
		}*/
		alter(a);

	}

}
