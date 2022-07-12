package com.java;

public class AddArray {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int a[][]={{5,6},{2,4},{8,5}};    
		int b[][]={{2,5},{6,3},{4,5}};    
		    
		    
		int c[][]=new int[2][2];   
		    
		    
		for(int i=0;i<2;i++)
		{    
			for(int j=0;j<2;j++)
			{    
				c[i][j]=a[i][j]+b[i][j];   
				System.out.print(c[i][j]+" ");    
			}    
		System.out.println(); 
		}    
	}

}
