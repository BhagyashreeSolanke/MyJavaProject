package com.topic2;

import java.util.Scanner;

public class DuckNo {

	public static void main(String[] args) {
		// Write a code to check given number is duck number or not?
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		int rim=0;
		int count=0;
		while(num>0)
		{
			rim=num%10;
			if(rim==0) {
				count++;
			}
			num=num/10;
			}
		//System.out.println(rim);
		if(count==0) {
						System.out.println("Not Duck number");
					} else {
						System.out.println("Duck number");
					}


	}

}
