package com.java;

import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rev=0,rem;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter No:");
		int a=s.nextInt();
		
		for(a=567;a!=0; )
		{
			rem=a%10;
			a=a/10;
			rev=rev*10+rem;
		}
		System.out.println("Reverse is:"+rev);
	}

}
