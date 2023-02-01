package TestPackage1;

public class test_1 {

	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int mult(int a,int b)
	{
		return a*b;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to TestPackage1.test_1");
		
		test_1 a = new test_1();
		System.out.println(a.add(20,30));
	
	}
}
