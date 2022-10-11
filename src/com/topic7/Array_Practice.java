package com.topic7;

import java.util.Arrays;

public class Array_Practice {
	
	    public static void sum(int[] ar)
		{
		    for(int i=0;i<ar.length;i++)
			{
		    	int b[]=new int[2];
		    	//int m=0;
			   
				for(int j=i+1;j<ar.length;j++)
				{
					
					
						if(10==ar[i]+ar[j])
					    {
					       // System.out.println(ar[i]+" "+ar[j]);
							b[0]=ar[i];
							b[1]=ar[j];
							//m++;
						}
											
				}
				if(b[0]!=0 || b[1]!=0)
				{
				System.out.println(Arrays.toString(b));
				}
			}
		}
	    public static void main(String[] args)
	    {
	        int[] a={4,6,8,2,8,9,4,1,9,0};
			sum(a);
	    }
	

}
