package com.java;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		int n = s.nextInt(); 
		
		// TODO Auto-generated method stub
		int num[][]=new int[3][4];
		
		
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
