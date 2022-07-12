package com.java;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arm=0,rem,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no");
		int a=s.nextInt();
		b=a;
		for( ;a!=0; )
		{
			rem=a%10;
			a=a/10;
			arm=arm+rem*rem*rem;
		}
		if(b==arm) {
			System.out.println("The number is Armstrong");
		}
		else {
			System.out.println("The number is not an Armstrong");
		}
	}

}
