package com.topic7;

public class Array_MinRow {
	public static void minInRow(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int min=a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				
				if(min>a[i][j])
				{
					min=a[i][j];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.print(" = "+min);
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		int[][] r= {{1,2,3},{4,5,6},{7,8,9}};
		minInRow(r);
		
	}

}
