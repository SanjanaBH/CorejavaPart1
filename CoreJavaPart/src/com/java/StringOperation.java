package com.java;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		String s=new String("I like java");
		String s1=new String("   I like react");
		String s3="Sanjana";
		String s4="sanJana";
		String s5=new String("   I like react    ");
		
		
		
		
		System.out.println("String is :"+s1);
		System.out.println("Length is :"+s.length());
		System.out.println("Character is at:"+s.charAt(4));
		System.out.println("Lower case is :"+s.toLowerCase());
		System.out.println("Upper case is :"+s.toUpperCase());
		System.out.println("Equals is :"+s.equals(s1)); //true or false
		System.out.println("Concatenation :"+s.concat(s1));
		System.out.println("Equals is :"+s3.equalsIgnoreCase(s4));
		System.out.println("Replace :"+s.replace("like","love"));
		System.out.println("Index is :"+s.indexOf('I')); //it will space as a index...
		System.out.println("Index of :"+s.lastIndexOf('i'));
		System.out.println("Contain :"+s.contains(s4));
		System.out.println("SubString :"+s.substring(4,9));
		System.out.println("Length :"+s5.length());
		System.out.println("Trimm :"+s5.trim());
		String s6=s5.trim();
		System.out.println("Length :"+s6.length());
		System.out.println("Trimm :"+s5.trim());
		
		String str="I like java";
		String[] arrOfStr=str.split(" ",2);
		
		for(String a:arrOfStr) //for each loop
			System.out.println(a);
		
		
		
		
	}

}
