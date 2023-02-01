import java.util.Scanner;

public class FunctionOverloading {

	int add(int x,int y)
	{
		return x+y;
	}
	
	double add(double a,double b)
	{
		return a+b;
	}

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		FunctionOverloading f1 = new FunctionOverloading();
		
		System.out.println("Enter two integer no's");
		int x1=scan.nextInt();
		int y1 = scan.nextInt();
		int integerresult=f1.add(x1, y1);
		System.out.println("Result of two integers is "+integerresult);
		
		System.out.println("Enter two double no's");
		double a1=scan.nextDouble();
		double b1 = scan.nextDouble();
		double doubleresult=f1.add(x1, y1);
		System.out.println("Result of two integers is "+doubleresult);
	}
}
