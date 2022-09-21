package com.topic2;

public class Break_Divisible3 {
	public static void main(String[] args) {
		int i;
		
		for(i=1;i<=20;i++) {
			if(i%3==0) {
				break;
			}
			System.out.println(i);
		}
	}

}
