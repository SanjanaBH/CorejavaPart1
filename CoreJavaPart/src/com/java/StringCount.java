package com.java;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		s=sc.nextLine();
		
//		System.out.println("Count words:+s.");
		int count = 1;
		int counters=1;
		
		//count words
        for (int i = 0; i < s.length() - 1; i++)
        {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
            {
                counters++;
            }
        }
        System.out.println("Number of words in a string : " + counters);
        
        
        //count characters
        for (int i = 0; i < s.length() - 1; i++)
        {
            if ((s.charAt(i) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of characters in a string : " + count);
        
       //count space 
        
        System.out.println("Number of characters in a string : " +(counters-1));
    }
		
	}



