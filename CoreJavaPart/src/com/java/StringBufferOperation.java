package com.java;


public class StringBufferOperation {

	public static void main(String[] args)
	{
		
		
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello StringBuffer");// 2 words tr charcters*2
		System.out.println("StringBuffer: "+sb.capacity());
//		System.out.println("StringBuffer: "+sb.append(true));
		System.out.println("StringBuffer: "+sb.append(" Here"));
		System.out.println("StringBuffer: "+sb.delete(1, 3));
		System.out.println("StringBuffer: "+sb.insert(1, "el"));
		System.out.println("StringBuffer: "+sb.reverse());
		
	}

}
