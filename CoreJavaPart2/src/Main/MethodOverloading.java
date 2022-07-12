package Main;

public class MethodOverloading {
	
	
	void sum(int a,int b) {
		System.out.println("Sum is: "+(a+b));
	}
	
	
	int sum(int a,int b,int c,int d) {
		System.out.println("Sum is: "+(a+b+c+d));
		return a+b;
	} 
//	int sum(int a,int b) {
//		System.out.println("Sum is: "+(a+b));
//		return a+b;
//	} 
	
	double sum(double a,double  b) {
		System.out.println("Sum is: "+(a+b));
		return a+b;
	} 
	
	void sum(int a,int b,int c) {
		System.out.println("Sum is: "+(a+b+c));
	}
	
	void sum(int c,float d) {
		System.out.println("Sum is: "+(c+d));
	}

	void sum(float c,float d) {
		System.out.println("Sum is: "+(c+d));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading m1=new MethodOverloading();
		
		
		m1.sum(5,6,2,1);
		m1.sum(2,4);
		m1.sum(20d,21d);
		m1.sum(4, 8,6);
		m1.sum(6,4.5f);
		m1.sum(6.2f,4.5f);
	}
	

}
