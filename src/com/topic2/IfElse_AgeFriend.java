package com.topic2;

import java.util.Scanner;

public class IfElse_AgeFriend {

	public static void main(String[] args) {
		/* Write a code to take your age and your friends age as an input from user and check if your age is 
		greater than friends age then display "Hii" if friend's age is greater than your age then display 
		"Hello" and if age is same the display "hi Hello"*/
		
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Your age : ");
       int a = sc.nextInt();
       
       System.out.println("Your friends age : ");
       int f = sc.nextInt();
       
       
       if(a>f)
       {
           System.out.println("Hii..");
         }
       else if(f>a)
       { 
    	   System.out.println("Hello..");
         } 
       else if (a == f)
       {
           System.out.println("Hii..Hello.."+(a==f));
       }
               
		
	}

}
