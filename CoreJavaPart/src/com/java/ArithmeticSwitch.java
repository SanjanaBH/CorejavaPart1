package com.java;
import java.util.Scanner;
public class ArithmeticSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 	:");
		int sum=sc.nextInt();
		int add,sub,div,mul;
		
		switch(sum) {
		case 1:
			add = a+b;
			System.out.println("Addition is:"+add);
			break;
		case 2:
			sub = a-b;
			System.out.println("Substraction is:"+sub);
			break;
		case 3:
			mul = a*b;
			System.out.println("Multiplication is:"+mul);
			break;
		case 4:
			div = a/b;
			System.out.println("Division is:"+div);
			break;
		default:
			System.out.println("Invalid Sum");
		}
	}

}
