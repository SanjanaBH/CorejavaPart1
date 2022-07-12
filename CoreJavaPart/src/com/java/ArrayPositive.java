package com.java;
import java.util.Scanner;
public class ArrayPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  i,countp=0,countn=0,countz=0;
	    Scanner s = new Scanner(System.in);
	    System.out.print(" Please Enter Number of elements in an array : ");
	    int n = s.nextInt();  
	    int  num[] = new int[7];
	    System.out.print("The array is:");
	    for (i = 0; i < 7; i++)
	    {
	      num[i] = s.nextInt();
	    }   
	    for(i = 0; i < 7; i++)
	    {
	      if(num[i] > 0)
	      {
	    	  
	    	  System.out.println(num[i]+" ");
	        countp++;
	      }
	      else if(num[i] < 0)	     
	      {
	    	  
	    	  System.out.println(num[i]+" ");
	        countn++;
	        
	      }
	      else
	      {
	    	  
	    	  System.out.println(num[i]+" ");  
	    	  countz++;
	    	  
	      }
     
    
	}
	    System.out.println("Positive Numbers are :"+countp);
	     System.out.println("Negative Number:"+countn++);
	     System.out.println("Number is zero:"+countz); 

}
}
