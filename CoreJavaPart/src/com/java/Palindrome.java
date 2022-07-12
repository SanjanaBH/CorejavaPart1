package com.java;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  int rem,sum=0,a;    
			  int n=454;//It is the number variable to be checked for palindrome  
			  a=n;    
			  while(n>0){    
			   rem=n%10;  //getting remainder  
			   sum=(sum*10)+rem;    
			   n=n/10;    
			  }    
			  if(a==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			}  
			}  
	
