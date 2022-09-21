package com.topic4;

import java.util.Scanner;

public class FindDgt1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int newNum=0;
		int forward=0;
		int copy=num;
		int count=0;
		
		while(num>0)
		{
			int r = num%10;
			if (r==1)
			{
				r=0;
			}
			newNum=(newNum*10)+r;
			num=num/10;									
		}		
		while(newNum>0)
		{
			int rim=newNum%10;
			forward=(forward*10)+rim;
			newNum=newNum/10;
		}		
		System.out.print(forward);
	}
  
}
