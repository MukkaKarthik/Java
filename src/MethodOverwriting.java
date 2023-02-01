class Parent 
{
	static int b = 5;
	public static void display()
	{
		System.out.println("static int value in parent class =" +b);
	}
	
	public Parent(int a)
	{
		this.b=a;
		System.out.println("Int value changed via construtor in parent class . Value changed = "+a);
	}
}

class Child extends Parent
{
	public Child()
	{
		super(3);
	}
	public static void display()
	{
		System.out.println("static int value in child class =" +b);
	}
	
	void Parent(int a)
	{
		this.b=a;
		System.out.println("Show method in child class");
	}
	
}
public class MethodOverwriting {

	public static void main(String [] args)
	{
		Parent p = new Child();
		Child c = new Child();
		
		p.display();
		
		c.display();
			}
}
