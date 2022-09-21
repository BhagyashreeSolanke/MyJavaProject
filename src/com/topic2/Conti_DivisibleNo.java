package com.topic2;

public class Conti_DivisibleNo {
	public static void main(String[] args) {
		
		int i;
		for(i=1;i<=30;i++) {
			if(i%2==0 || i%3==0 || i%9==0) {
				continue;
			}
			  System.out.println(i);
		}
	}

}
