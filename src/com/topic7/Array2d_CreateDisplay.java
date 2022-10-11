package com.topic7;

import java.util.Scanner;

public class Array2d_CreateDisplay {

	public static void main(String[] args) {
		
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		int a[][] = new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("************");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------");
		
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		

	}

}
