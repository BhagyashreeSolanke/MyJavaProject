package com.topic2;

import java.util.Scanner;

public class For_CheckPrime {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int count=0;
        
        for(int i=2;i<=(num-1);i++) {
        	if(num%i==0) {
        		count++;
        	}
        }
         
        if(count>0) {
        	System.out.println("Not Prime");
        }
        else {
        	System.out.println("Prime");
        }
        
		
		
		
		
		
	}

}
