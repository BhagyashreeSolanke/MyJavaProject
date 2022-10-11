package com.topic7;

public class Array_Pattern3 {
	public static void p(char[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public static void main(String[] arg)
	{
		char[][] r=new char[4][4];
		p(r);
	}

}
