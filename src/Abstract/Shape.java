package Abstract;

abstract class Shape {

	int length;
	double perimeter;
	double circumference;
	double area;
	
	abstract public void length(int a);
	
	abstract public void area(double b) ;

	abstract public void perimeter(double c);
	
	
	public static void main(String[] args)
	{
		
		Shape object1 = new square();
		object1.length(10);
		object1.area(10);
		object1.perimeter(10);
		

		
		
	}
	
	
}

 class square extends Shape{

	
	 public void length(int a )
	{
		length=a;
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


