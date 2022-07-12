package Main;

public class MethodOverriding {

	
	void display(String name,String name1) {
		System.out.println("The child is called by "+name+" "+name1);
	}
	
	void display(String name2,String name3,String name4) {
		System.out.println("The parent is called by "+name2+ " "+name3+" "+name4);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding m1=new MethodOverriding();
		m1.display("Sanjana", "Hadawale");
		m1.display("Sanjana", "Bhausaheb", "Hadawale");
	}

}
