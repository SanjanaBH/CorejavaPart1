package com.java;

import java.util.Scanner;

public class PrimeNumber
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int a,b=2,flag=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		a=s.nextInt();
		
		for( ;b<a;b++) 
		{
			
			if(a%b==0)
			{
				flag=0;
				
			}
			if(flag==1) {
				System.out.println("The number is Prime Number");	
			
			}	
			else {
			    System.out.println("The number is not Prime Number");	
			}
	}
		}
}
