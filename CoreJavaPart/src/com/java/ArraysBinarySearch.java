package com.java;

import java.util.Arrays;

public class ArraysBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {23,45,4,85,78,69,42,3,9};
		String arr[]= {"Black","Pink","Red","Violet"};
		Arrays.sort(arr);
		System.out.println("Input Array:"+Arrays.toString(arr));
		int c=Arrays.binarySearch(arr, "Red");
		
		System.out.println("Element is found at"+c);
		
		Arrays.sort(num);
		
		System.out.println("Input Array:"+Arrays.toString(num));
		
		int key=85;
		
		
		System.out.println("Key is "+key+"found at="+Arrays.binarySearch(num, 9));

	}

}
