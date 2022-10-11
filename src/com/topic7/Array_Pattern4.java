package com.topic7;

public class Array_Pattern4 {
	public static void p(char[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		char[][] r=new char[5][5];
		p(r);
	}

}
