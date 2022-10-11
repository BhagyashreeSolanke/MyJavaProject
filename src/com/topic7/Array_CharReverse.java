package com.topic7;
import java.util.Arrays;
import java.util.Scanner; 

//Write a program to display character array in reverse manner?
		
public class Array_CharReverse {
	
	private static void printReverse(char[] c) {
		for(int i=c.length-1;i>=0;i--) {
			System.out.println(c[i]);
		}
		
	}
    
	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter Array size:");
	 int n=sc.nextInt();
	 System.out.println("Enter array elements: ");
	 char a[]=new char[n];
	 for(int i=0;i<a.length;i++) {
		 a[i]=sc.next().charAt(0);
		
	 }
	 printReverse(a);
	 
	 }

	

}
