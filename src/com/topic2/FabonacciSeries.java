package com.topic2;

public class FabonacciSeries {
	public static void main(String [] args) {
		
		//WAP to print Fibonacci series up to 20 terms.
		
	    int n1=0;
	    int n2=1;
	    int i;
		int n3;
		int count=10;
		
	    for (i=0;i<=count;++i) {
	    	System.out.print(n1+", ");	
	    	
	       n3=n2+n1;
		   n1=n2;
		   n2=n3;
		}
	}

}
