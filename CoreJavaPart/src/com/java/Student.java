package com.java;




class Main
{
	int rollno=32;
	String name="Sanjana";
	

	void display() 
	{
		System.out.println("Roll No:"+rollno);
	}
	
	int add(int a,int b) 
	{
		return a+b;
	}
	
	String displayMsg() {
		return "Hello"; 
	}
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m1=new Main();
		m1.display();
		m1.add(5, 6);
		m1.displayMsg();
		
	}

}

