
public interface ShapeFigure {

	void PerimeterandCircumference();
	void Area();


class Square implements ShapeFigure {
	int length;
	double perimeter;
	double area;

	Square(int a) {
		this.length = a;
		System.out.println("Length of the square is " + " " + length);
	}

	double perimeter(int length) {
		this.perimeter = (4 * length);
		return perimeter;
	}

	double Area(int length) {
		this.area = (length * length);
		return area;
	}
	
	
	public void PerimeterandCircumference() {
		System.out.println("The perimeter of the square is " + " " + perimeter);
	}

	public void Area() {
		System.out.println("The area of the Circle is " + " " + area);
	}
}

class Circle implements ShapeFigure {

	int radius;
	double circumference;
	double area;

	Circle(int a) {
		this.radius = a;
		System.out.println("Radius of the circle is " + " " + radius);
	}

	double circumference (int length) {
		this.circumference = (2 * length * 3.14);
		return circumference;
	}

	double Area(int length) {
		this.area = (3.14 * length * length);
		return area;
	}

	public void PerimeterandCircumference() {
		System.out.println("The circumference of the cicle is " + " " + circumference);
	}

	public void Area() {
		System.out.println("The area of the Circle is " + " " + area);
	}
}



	public static void main()
	{
		Square object1 = new Square(10);
		object1.perimeter(10);
		object1.Area(10);
		object1.PerimeterandCircumference();
		object1.Area();
		
		Circle object2 = new Circle(20);
		object2.circumference(10);
		object2.Area(10);
		object2.PerimeterandCircumference();
		object2.Area();
		
	}

}

