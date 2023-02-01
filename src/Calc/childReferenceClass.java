package Calc;


// Always parent class should have main method to preserve schematics and conventions

public class childReferenceClass {
	void display()
	{
		System.out.println("Displaying from Parent class");
	}
	
	public static void main(String[] args)
	{
		
		//displaying methods from parent class
		childReferenceClass a = new childReferenceClass();
		a.display();
		
	
		//displaying methods form child class
		childOnlyClass c = new childOnlyClass();
		c.display();
		c.method();
	}
	
}


class childOnlyClass extends childReferenceClass{
	
	void display()
	{
		super.display();
		System.out.println("Displaying from child class");
	}

	void method()
	{
		System.out.println("Displaying method from child class");
	}
	
	
	
}