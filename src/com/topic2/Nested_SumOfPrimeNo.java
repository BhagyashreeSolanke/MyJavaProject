package com.topic2;

public class Nested_SumOfPrimeNo {
	public static void main(String[] args) {
		int i,j;
		int count = 0;
		int sum=0;
		for(i=2;i<=20;i++) {
			for(j=2;j<(i-1);j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				sum=sum+i;
			}else {
				count=0;
			}
		}
		System.out.println(sum);
		
	}

}
