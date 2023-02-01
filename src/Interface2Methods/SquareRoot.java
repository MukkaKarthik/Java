package Interface2Methods;
import java.util.*;


public class SquareRoot implements Methods,Methods1{

	public void method1()
	{
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the number to find square and square root");
		long a = scan1.nextLong();
		
		double square = a*a;
		
		double squareroot = Math.sqrt(a);
		
		System.out.println("Square of the no is = "+square);
		System.out.println("Square root of no is = "+squareroot);
	}
	public void method2()
	{
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the no to find the cube of a no ");

		long cube = scan2.nextLong();
		
		double cubeformed= (cube*cube*cube);
		System.out.println("Cube of the no = "+cubeformed);
	}


	public static void main(String[] args)
	{
		SquareRoot object = new SquareRoot();
		object.method1();
		object.method2();
	}


}


