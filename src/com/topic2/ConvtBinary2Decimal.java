package com.topic2;

import java.util.Scanner;

public class ConvtBinary2Decimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Binary Number :");
		int num = sc.nextInt();
		
		int copyn=num;
		int r;
		int ans=0;
		int i=0;
		
		while(copyn>0) {
			r=copyn%10;
			ans=ans+r*(int) Math.pow(2,i++);
			copyn=copyn/10;
		   }
		     System.out.println(ans);
	}

}
