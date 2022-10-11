package com.topic7;

import java.util.Scanner;

public class Array_MaxChar {
	public static char maxChar(char ch[])
	{
		char max=ch[0];
		for (int i=0;i<ch.length;i++)
		{
			if(max<ch[i]) 
			{
				max=ch[i];			
			}
		}
		return max;
	}

	public static void main(String[] args) {
		char ch[]=new char[5];
		System.out.println("Enter the char element:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
        char result=Array_MaxChar.maxChar(ch);
        System.out.println(result);
	}

}
