package com.topic2;
import java.util.Scanner;
public class Find_Prime {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		int i=0;
		while(num>0)
		{	
				int rem=num%10;
				if(rem==2||rem==3||rem==5||rem==7) {
					System.out.println(rem);
				}
				num=num/10;
			}
		}
	

}
