package Main;

public class ParaConstructor {
	
	
int x;

ParaConstructor(int i){
	x=i;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParaConstructor p1=new ParaConstructor(5);
		ParaConstructor p2=new ParaConstructor(7);
		System.out.println("The value of x is: "+p1.x+" and "+p2.x);

	}

}
