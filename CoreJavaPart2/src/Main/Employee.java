package Main;

class SInheritance {
	int salary=75000;
}
	
	
	class Employee extends SInheritance
	{
		int bonus=15000;
	public static void main(String[] args)
	{
	
		Employee e=new Employee();
		System.out.println(e.salary);
		
		System.out.println(e.bonus);

	}

}
