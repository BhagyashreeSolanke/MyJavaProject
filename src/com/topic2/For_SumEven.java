package com.topic2;

public class For_SumEven {
	public static void main(String [] args) {
		int i;
		int sum = 0;
		
		for(i=1;i<=20;i++) {
			if (i%2==0) {
			sum = sum+i;
			}
		}
		System.out.println("Sum of Even no. between 1 to 20 is "+sum);
	}

}
