package Main;



class emp{
	int salary=75000;
	int bonus=15000;
	String name="sanjana";
	
	public String detail() {
		return "Data [Salary: " + salary + " bonus: " + bonus + " name: " + name +"]";
		
	}
}

class emp1 extends emp{
	public void display()
	{
		String name="city";
		
	}
}
public class NewEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp1 e1=new emp1();
		System.out.println("The details are: "+e1.detail());
	}

}
