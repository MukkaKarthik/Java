import java.util.Scanner;

interface a
{
	public int add(int a,int b);
	public int mult(int x,int y);
	
	int attribute=200;
}

interface b extends a
{
	int div(int a,int b);
}


public  class InterfaceClass implements b {

	@Override
	public int add(int a,int b) {
		return (a+b);
	}

	@Override
	public int mult(int x,int y) {
		return (x*y);
	}

	@Override
	public int div(int a, int b) {
		return (a/b);
	}

	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 no's to perform addition and multiplication");
		
		int c=scan.nextInt();
		int d=scan.nextInt();
		
		InterfaceClass I1 = new InterfaceClass();
		int add_result=I1.add(c, d);
		int mult_result=I1.mult(c, d);
		int div_result=I1.div(c,d);
		
		System.out.println("Result after adding C and d nos = "+add_result);
		System.out.println("Result after multiplying C and D nos = "+mult_result);
		System.out.println("Result after dividing C and D nos are = "+div_result);
		
		System.out.println("The value of attribute in interface = "+I1.attribute);

	}


}
