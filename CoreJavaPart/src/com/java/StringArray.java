package com.java;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emptyStr=" ";
		String s="java";
		
		System.out.println("string"+emptyStr.isEmpty());
		System.out.println("string"+emptyStr.isBlank());
		System.out.println("string"+s.stripLeading());
		System.out.println("string"+s.stripLeading());
		
		char[] dest=new char[4];
		s.getChars(0, 4, dest, 0);
		System.out.println(Arrays.toString(dest));
		
		System.out.println("string"+s.toCharArray());
		

	}

}
