package com.java;

import java.util.Scanner;

public class TwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		 
		System.out.println("Enter row");
		int row = s.nextInt();
		
		System.out.println("Enter col");
		int col = s.nextInt(); 
		
		// TODO Auto-generated method stub
		int num[][]=new int[row][col];
		System.out.println("The array is:");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				num[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i< row;i++) {
			for(int j=0;j < col;j++) {
				System.out.println("Row ["+i+"]:  Column ["+j+"] :"+num[i][j]);
			}
	
	}

	}
}
