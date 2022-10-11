package com.topic7;

public class ColoumSum {
	public static void sumOfColoum(int[][] ar)
	{		
		for(int i=0;i<ar.length;i++)
		{
			int sum=0;
			for(int j=0;j<ar[i].length;j++)
			{			
				sum=sum+ar[j][i];
				System.out.print(ar[i][j]+" ");				
			}
			System.out.print(" = "+sum);
			System.out.println();			
		}		
	}
	public static void main(String[] args)
	{
		int[][] a= {{4,5,2},{1,2,3},{7,4,1}};
		sumOfColoum(a);
	}
}
