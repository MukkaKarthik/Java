import java.util.*;

public class SwitchCalculator {

	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter first and second no");
		
		double first = reader.nextDouble();
		double second = reader.nextDouble();
		
		System.out.println("Enter the operators among following to perform operation (+,-,*,/) ");
		
		char operator = reader.next().charAt(0);
		
		double result;
		
		switch(operator)
		{
		
		case '+':
			result=first+second;
			break;
		case '-':
			result=first-second;
			break;
			
		case '*':
			result=first*second;
			break;
		
		case '/':
			result=first/second;
			break;
		
		//operator doesn't match any constant
		default :
			System.out.printf("Invalid Operator");
			return;
			
		}
		
		System.out.println("Result of the operation is ");
		System.out.printf("%.1f %c %.1f = %.1f",first,operator,second,result);
		
		}
}
