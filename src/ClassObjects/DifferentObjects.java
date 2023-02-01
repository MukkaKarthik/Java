package ClassObjects;

abstract public class DifferentObjects {



	int length;
	double perimeter;
	double circumference;
	double area;
	
	abstract public void length(int a);
	
	abstract public void area(double b) ;

	abstract public void perimeter(double c);
	
	
	public static void main(String[] args)
	{
		
		DifferentObjects object1 = new square();
		object1.length(10);
		object1.area(10);
		object1.perimeter(10);
		
		DifferentObjects object2 = new Circle();
		object2.length(10);
		object2.area(10);
		object2.perimeter(10);
		
		
		
	}
	
	
}

 class square extends DifferentObjects{

	
	 public void length(int a )
	{
		this.length=a;
		System.out.println("Length of the square is "+" "+ length);
	}
	
	public void area(double  area1)
	{
		this.area=(area1*area1);
		System.out.println("Area of the Square is "+" "+ area);
	}

	public void perimeter(double  a)
	{
		this.perimeter=(4*a);
		System.out.println("Perimeter of the Square is "+" "+ perimeter);
	}
}

 class Circle extends DifferentObjects{
		

		public void length(int a)
		{
			this.length=a;
			System.out.println("Radius of the circle is "+" "+ length);
		}
		
		public void area(double area1)
		{
			this.area=(3.14*area1*area1);
			System.out.println("Area of the Circle is "+" "+ area);
		}

		public void perimeter(double a)
		{
			this.circumference=(2*a*3.14);
			System.out.println("Circumference of the Circle is "+" "+ perimeter);
		}


		}

