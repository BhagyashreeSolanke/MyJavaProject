package com.topic1;
import java.util.Scanner;
public class Cm2Km {
	public static void main(String[] args) {
		//1. Write a Java program to enter length in centimeter and
		//   convert it into meter and kilometer.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number = ");
		
		int cm = sc.nextInt();
		
		double km = cm/1000;
		
		System.out.println(+km+"km");
		
		
	}

}
