package Main;

class Sums{
	
	
	int add(int a,int b) 
	{
		System.out.println("Addition is: "+(a+b));
		return a+b;
	}
	int sub(int a,int b) 
	{
		System.out.println("Substraction is: "+(a-b));
		return a-b;
	}
	int mul(int a,int b) 
	{
		System.out.println("Multiplication is: "+(a*b));
		return a*b;
	}
	int div(int a,int b) 
	{
		System.out.println("Division is: "+(a/b));
		return a/b;
	}
}



class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sums s1=new Sums();
		s1.add(12, 4);
		s1.sub(12, 4);
		s1.mul(12, 4);
		s1.div(12, 4);
	}

}
