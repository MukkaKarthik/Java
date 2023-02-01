import java.util.Scanner;

public class SquareNumber {

	 int square(int x)
	{
		return x*x;
	}
	 
	 public static void main(String[] args)
	 {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the no to find square");
		 
		 int inputsquare=input.nextInt();
		 
		 SquareNumber sq = new SquareNumber();
		 int result=sq.square(inputsquare);
		 
		 System.out.println("Square of the no is "+result);
	 }
}
