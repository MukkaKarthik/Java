class ParentSalary
{
	int salary = 50000;
}

public class WildAnimals extends ParentSalary {

	int bonus = 40000;
	
	public static void main(String[] args)
	{
		ParentSalary object1 = new ParentSalary();
		WildAnimals object2 = new WildAnimals();
		
		System.out.println("Parent Salary is "+object1.salary);
		System.out.println("Bonus Salary is "+object2.bonus);
	}
}
