package com.topic7;

public class Array_MinColoum {
	public static void minInRow(int[][] r)
	{
		for(int i=0;i<r.length;i++)
		{
			int min=r[0][i];
			for(int j=0;j<r[i].length;j++)
			{
				if(min>r[i][j])
				{
					min=r[i][j];
				}
				System.out.print(r[i][j]+" ");
			}
			System.out.print(" = "+min);
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		int[][] a= {{1,2,3,},{4,5,6},{7,8,9}};
		minInRow(a);
	}

}
