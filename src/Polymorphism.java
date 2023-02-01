class Shape
{
	void draw()
	{
		System.out.println("Shape is shape");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Shape is Rectangle");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Shape is Circle");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Shape is Square");
	}
}
public class Polymorphism {

	public static void main(String[] args)
	{
		Shape s;
		s= new Circle();
		s.draw();
		
		s= new Square();
		s.draw();
		
		s = new Rectangle();
		s.draw();
		
	}
}
