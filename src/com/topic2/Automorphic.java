package com.topic2;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number");
    int c=0;
    int num = sc.nextInt();
    int sqr=num*num;
    int copy=num;
    while(num>0) {
    	c++;
    	copy=copy/10;
    }
    
    
	}

}
