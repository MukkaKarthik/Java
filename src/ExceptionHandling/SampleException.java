package ExceptionHandling;

import java.util.Scanner;

public class SampleException {

	static void validateInput(int a) throws InvalidInputException {
		if (a > 100) {
			throw new InvalidInputException("Exception");
		} else {
			System.out.println("Valid Input");
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter the value of no ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		try {
			validateInput(a);
		} catch (InvalidInputException e) {
			System.out.println("Caught exception , number is greater than 100");
		}

	}
}

class InvalidInputException extends Exception
{
	 InvalidInputException(String exceptionText){
	super(exceptionText);
} 
}
