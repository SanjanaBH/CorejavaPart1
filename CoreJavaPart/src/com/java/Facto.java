package com.java;

public class Facto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		int i=1;
//		for(int i=30;i>=1;i--)
//		{
//			fact=fact*i;
//		}
		while(i<=30)
		{
			fact=fact*i;
			i++;
		}
		
		System.out.println("Factorial is:"+fact);
	}

}
