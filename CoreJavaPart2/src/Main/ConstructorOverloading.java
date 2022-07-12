package Main;

public class ConstructorOverloading {

	
	String name;
	int rollno;
	String city;
	
	ConstructorOverloading(String n,int no){
		name=n;
		rollno=no;
	}
	ConstructorOverloading(String n,int no,String c){
		name=n;
		rollno=no;
		city=c;
	}
	
	void display() {
		System.out.println("Name is: "+name +" "+rollno + " "+city);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading c1=new ConstructorOverloading("Sanjana",12);
		c1.display();
		ConstructorOverloading c2=new ConstructorOverloading("Sanjana",12,"Mumbai");
		c2.display();
		

	}

}
