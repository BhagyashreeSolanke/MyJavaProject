package com.topic2;
import java.util.Scanner;

public class For_Table {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		
		int i;
		
		for (i=1;i<=10;i++) {
			int tab = num * i;
			System.out.println(tab);
		}
		
	}

}
