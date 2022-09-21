package com.topic2;

import java.util.Scanner;

public class DisariumNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		int copy=num;
		int rim;
		int p=0;
		int sum=0;
		
		while(num>0) {
			p++;
			num=num/10;
					
		}
		copy=num;
		while(num>0) {
			rim=num%10;
			sum=sum+(int)Math.pow(rim, p);
			p--;
		}
		if(copy==sum) {
			System.out.println("Disarium Number");
		} else {
			System.out.println("Not Disarium Number");
		}
		
	}

}
