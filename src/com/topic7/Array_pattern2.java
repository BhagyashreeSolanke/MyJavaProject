package com.topic7;

public class Array_pattern2 {
	public static void p(char[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(j==a.length-1||j==0||a[i]==a[j])
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
	public static void main(String[] args)
	{
		char[][] r=new char[4][4];
		p(r);
	}

}
