package com.topic2;

public class ForForIfElse_DispPrimeNoBtw {
	public static void main(String[] args) {
		int i, j;
		int count=0;
		
		for(i=1;i<=20;i++) {
			for(j=2;j<=(i-1);j++) {
				if(i%j==0) {
					count++;
				}
			}
			 if(count==0) {
				 System.out.println(i);
			 } else {
				 count=0;
			 }
		}
	}

}
