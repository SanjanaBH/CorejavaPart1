package Main;


class abc{
	int a,b;
	void getdata() {
		a=10;
		b=2;
	}
	
}
class add extends abc{
	int sum;
	
	void add(){
		sum=a+b;
		System.out.println("Addition is:"+sum);
	}
}


class sub extends add{
	int sub;
	
	void substract(){
		sub=a-b;
		System.out.println("Substraction is:"+sub);
	}

	
}

public class MultiLevelExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub s=new sub();
		s.getdata();
		s.add();
		s.substract();

	}

}
