package com.java;

import java.util.Scanner;

public class OneDimensional {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		 
		System.out.println("Enter size of your array");
		int n = s.nextInt();
		
		
		// TODO Auto-generated method stub
		int num[]=new int[6];
		for(int i=0;i<num.length;i++) {
			num[i]= s.nextInt();
		}
		for(int i=0;i<num.length;i++) {
			System.out.println("The second element of array is:"+num[3]);
		}
	}

}
