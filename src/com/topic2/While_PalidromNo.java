package com.topic2;

import java.util.Scanner;

public class While_PalidromNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int revers=0;
		while(num>0)
		{
			int r = num%10;
			revers=revers*10+r;
			num=num/10;
			
		}
		 System.out.println(revers);
	}

}
