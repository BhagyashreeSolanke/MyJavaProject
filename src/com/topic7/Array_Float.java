package com.topic7;

import java.util.Arrays;
import java.util.Scanner;

// Create float type of array and display it with all possible ways.

public class Array_Float {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Array length");
     int n=sc.nextInt();
     float arr[]=new float[n];
     System.out.println("Enter an array element: ");
     
     for(int i=0;i<arr.length;i++) {
    	 arr[i]=sc.nextFloat();
    	 }
     System.out.println("____**____");
     for(int i=0;i<arr.length;i++) {
    	 System.out.println(arr[i]);
     }
     System.out.println("-----using Enhance for loop-----");
     for(float x:arr) {
    	 System.out.println(x);
     }
     System.out.println("_____*Display in horizontal way*_____");
     System.out.println(Arrays.toString(arr));
     

	}

}
