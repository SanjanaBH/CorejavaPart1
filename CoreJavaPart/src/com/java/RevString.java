package com.java;

public class RevString {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str="mom",reverseString=" ";
		int strLength=str.length();
		for(int i=(strLength-1);i>=0;i--)
		{
			reverseString=reverseString+str.charAt(i);
		}
		if(str.toLowerCase().equals(reverseString.toLowerCase()))
		{
	System.out.println("String is palindrome");
	}
	else {
		System.out.println("String is not palindrome");
	}
	

	}
}
