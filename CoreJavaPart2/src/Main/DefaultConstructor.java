package Main;


class DefaultConstructor{
	int x;
	
DefaultConstructor(){
		x=10;
		System.out.println("X is"+x);
	}
	
	public static void main(String Args[]) {
		DefaultConstructor d1=new DefaultConstructor();
	}
}
