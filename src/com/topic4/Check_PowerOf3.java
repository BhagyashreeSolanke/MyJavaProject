package com.topic4;

import java.util.Scanner;

public class Check_PowerOf3 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		boolean is_PowerOfThree=true;
		
		if(num<=0)
		{
			is_PowerOfThree=false;
		}
		while(num%3==0)
		{
	      num/=3;
		}
		if(num==1)
			{
			System.out.println(is_PowerOfThree=true);
			}else {
				System.out.println(is_PowerOfThree=false);
			}
		
	}

}
