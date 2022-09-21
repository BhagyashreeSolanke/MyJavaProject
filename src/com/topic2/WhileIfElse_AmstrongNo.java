package com.topic2;

import java.util.Scanner;

public class WhileIfElse_AmstrongNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three digit number : ");
		int num = sc.nextInt();
		int m;
		int cube;
		int sum=0;
		int num1=num;
		
		while(num>0)
		{
			m=num%10;
			cube=m*m*m;
			sum=sum+cube;
			num=num/10;
			
		}
		if (num1==sum) {
			System.out.println("Amstrong Number");
		}
		else {
			System.out.println("Not Amstrong Number");
		}
	}

}
//153,371,370,407,0,1 are amstrong no.