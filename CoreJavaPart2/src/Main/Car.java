package Main;


class NewCars{
	String brand;
	int modelyear;
	
//	NewCars(String brand)
//	{
//		this.brand= brand;
//		
//	}
	NewCars(int modelyear){
		this.modelyear=modelyear;
	}
	
	void getBrand() {
		System.out.println("Car Brand is:"+brand);
	}
}
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		NewCars n1=new NewCars("Ford");
//		n1.getBrand();
		NewCars n2=new NewCars(2019);
		System.out.println("Car Brand is:"+n2);
		

	}

}
