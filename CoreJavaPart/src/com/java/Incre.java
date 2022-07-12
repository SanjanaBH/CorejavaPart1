package com.java;

public class Incre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=20,b=6,res,sum;
		
		res=++a;
		sum=a++;
		
		System.out.println("Increment is:"+res);
		System.out.println("Increment is:"+sum);
		
		System.out.println("Decrement is:"+" " +b--);
		System.out.println("Decrement is:"+" " +--b);
	}

}
