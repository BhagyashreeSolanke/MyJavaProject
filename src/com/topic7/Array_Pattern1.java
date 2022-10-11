package com.topic7;

public class Array_Pattern1 {
	
	public static void p(char[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==0||j==0||i==a.length-1||j==a.length-1)
				{
					a[i][j]='*';
				} else {
					a[i][j]=' ';
				}
			}
		}
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}	
	public static void main(String[] arg)
	{
		char [][] r= new char[4][4];
		p(r);
	}

}
