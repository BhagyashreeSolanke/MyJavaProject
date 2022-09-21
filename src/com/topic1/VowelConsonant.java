package com.topic1;

import java.util.Scanner;

public class VowelConsonant {
	
	public static void main(String [] args) {
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("Enter an alphabet :");
		 
		 char cr = sc.next().charAt(0);
		 
		 switch(cr)
		 {
		 case 'a':
		 case 'e':
		 case 'i':
		 case 'o':
		 case 'u': 
		 case 'A':
		 case 'E':
		 case 'I':
		 case 'O':
		 case 'U': System.out.println("Vowel");
		       break;
		 default : System.out.println("Consonant");
		       break;
		       
		 }
		 
		 
	}

}
