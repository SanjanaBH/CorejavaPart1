package com.java;

import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n= sc.nextInt();
		if(n%2==0) {
			System.out.println("The number is Even");
		}
		else {
			System.out.println("The number is Odd");
		}
		
	}

}
