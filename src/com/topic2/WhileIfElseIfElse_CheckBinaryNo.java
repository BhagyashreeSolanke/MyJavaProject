package com.topic2;

import java.util.Scanner;

public class WhileIfElseIfElse_CheckBinaryNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		int num1=num;
		boolean isbinary = true;
		
		while (num1!=0) {
			int rim = num1%10;
			if(rim>1) {
				isbinary=false;
				break;
			} else {
			 num1=num1/10;
		}
		
	}
		if(isbinary) {
			System.out.println("Binary Number");
		} else {
			System.out.println("Decimal Number");
		}
	}

}
