import java.util.*;

public class Factorial {

	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the no to find factorial");
		double input = reader.nextDouble();
		
		double factorial = fact(input);
		System.out.println("Factorial of the no is "+factorial);
		
		
	}
	
	static double fact(double input1)
	{
		double output1;
		if(input1==1)
		{
			return 1;
		}
		//Recursion function calling itself
		output1 = fact(input1-1)*input1;
		return output1;
	}
}
