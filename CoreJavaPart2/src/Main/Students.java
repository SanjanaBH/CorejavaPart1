package Main;


class myclass{
	int RollNo;
	String name,city;
	
	myclass(){
		 RollNo=12;
		 name="Sanjana";
		city="Mumbai";
	}
	
	myclass(int RollNo,String name,String city){
		this.name=name;
		this.RollNo=RollNo;
		this.city=city;
	}
	
	public void details() {
		System.out.println("The student data is: "+name  +" "+RollNo +" "+city);
		System.out.println("The student data is: "+"Name "+ name +"Roll No:  "+ RollNo +"city: "+ city);
	}
}
public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myclass m2=new myclass();
		m2.details();
		myclass m1=new myclass(12,"Sanjana","Mumbai");
		m1.details();
		
		
	}

}
