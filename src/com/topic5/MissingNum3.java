package com.topic5;

import java.util.Scanner;

public class MissingNum3 {

	public static void main(String[] args) {
		
		// Series: 7,9,12,18,----, 890
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter numbers upto 5");
		int num=0;
		int add;
		int finsum=0;
		int sum=0;
		int totalsum=7;
		
		for(int i=1;i<=5;i++)
		{
			num=sc.nextInt();
			sum=sum+num;
			
		}
		System.out.println(sum);
		
		for(int i=1;i<=5;i++)
		{ 
			if(i%2!=0) {
			totalsum=totalsum*i+i*(i+1);
			
			
		}else {
			totalsum=totalsum*i-i*(i+1);
			
		}
			
		  finsum=finsum+totalsum;
		}
     	System.out.println(add=finsum+7);
		System.out.println(add-sum);
		}

}
