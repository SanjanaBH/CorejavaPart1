package oops.com;

public class EncapsulationOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicDemo p=new PublicDemo();
		p.setRollno(12);
		p.setName("Sanjana");
		p.setCity("Mumbai");
		
		System.out.println("Students rollno is:"+p.getRollno());
		System.out.println("Student name is: "+p.getName());
		System.out.println("student city name is:"+p.getCity());
	}

}
