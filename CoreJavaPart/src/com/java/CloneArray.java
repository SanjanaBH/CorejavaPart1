package com.java;

import java.util.Arrays;

public class CloneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,6,8,4};
		
		int b[]=a.clone(); //objects
		
//		int b[]=Arrays.copyOf(a,4 );//using Arrays class
		
//		int b[]=Arrays.copyOfRange(a, 0, 3);
		
		
	
		
		for(int i=0;i<b.length;i++) 
		{
			b[i]=b[i]+1;
			
		}
		
		
		System.out.println("Contents of a[]");
		
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]+" ");
			
		}
		System.out.println("Contents of b[]");
		for(int i=0;i<b.length;i++) 
		{
			System.out.println(b[i]+" ");
			
		}
		
	}

}
