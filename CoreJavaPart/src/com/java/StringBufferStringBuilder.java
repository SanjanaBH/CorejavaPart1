package com.java;

public class StringBufferStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startingTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Hello There"); 
		for (int i = 0; i < 1000; i++) {

			sb.append("i am java");
		}
			System.out.println("Time consumed by StringBuffer: "+ (System.currentTimeMillis() - startingTime) +"milliseconds");

			startingTime = System.currentTimeMillis();
			StringBuilder sbi = new StringBuilder("new java");

			for (int j= 0; j< 1000; j++)
			{

			sbi.append("programs");
			}
			System.out.println("Time consumed by StringBuilder:"+(System.currentTimeMillis() - startingTime) + "milliseconds");

	}
	
		}
	

