package Main;


class Parent{
	public String displaystring(){
		return "Parent is called";
	}
}	
	class child extends Parent
	{
		public String displaystring(){
			super.displaystring();
			return "Child is called";
		}
	}

public class NewOverriding {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.displaystring();
		child c=new child();
		System.out.println(c.displaystring());

	}

}

