package com.java;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your Choice");
			int sum=s.nextInt();
			
			System.out.println("Enter 1st number");
			int num1=s.nextInt();
			System.out.println("Enter 2nd number");
			int num2=s.nextInt();
			
			
			
			System.out.println("Addition");
			System.out.println("Substraction");
			System.out.println("Multiplication");
			System.out.println("Division");
			System.out.println("Modulus");
			
		}
			switch(sum)
			
			
			case1:
				int add=num1+num2;
			System.out.println("Addition is:"+add);
			
					
		}
		
	}

