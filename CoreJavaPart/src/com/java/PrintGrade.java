package com.java;

public class PrintGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="sanjana";
		int science=80,English=80,Maths=70;
		
		int Marks =(science+English+Maths)/3;
		
		System.out.println("The average of Sanjana's Marks is:" 
		+Marks);
		
		if (Marks>=90 &Marks>90) {
			System.out.println("The Grade is A+");
		}
		
		else if(Marks< 5 && Marks>80) {
			System.out.println("The Grade is A");
		}
		else if(Marks<75 && Marks>70) {
			System.out.println("The Grade is B+");
		}
		else if(Marks<65 && Marks>60) {
			System.out.println("The Grade is B");
		}
		
		else if(Marks>55 && Marks>50) {
			System.out.println("The Grade is C+");
		}
		
		else if(Marks<45 && Marks>40) {
			System.out.println("The Grade is C");
		}
		else {
			System.out.println("Fail");
		}
		
	}

}
