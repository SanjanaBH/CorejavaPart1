package Main;

//import Main;

class Main
{
	int rollno=32;
	String name="Sanjana";
	int a=2,b=6;

	void display() 
	{
		System.out.println("Roll No:"+rollno);
	}
	
	int add(int a,int b) 
	{
		System.out.println(a+b);
		return a+b;
	}
	
	void add1(int a,int b) 
	{
		System.out.println("Add"+(a+b));
		
	}
	
	String displayMsg() {
		System.out.println("Hello");
		return "HEllo"; 
	}
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m1=new Main();
		m1.display();
		m1.add(5, 6);
		m1.displayMsg();
		m1.add1(5, 2);
		
	}

}


