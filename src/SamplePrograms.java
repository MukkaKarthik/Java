import java.util.Scanner;

public class SamplePrograms {

	int div(int a, int b) throws Exception {
		int c = a / b;
		return c;
	}

	public static void main(String[] args) throws Exception {

		try {

			Scanner scan = new Scanner(System.in);

			System.out.println("Enter 2 numbers");
			int x = scan.nextInt();
			int y = scan.nextInt();

			SamplePrograms s = new SamplePrograms();
			int result = s.div(x, y);
			System.out.println("Division of numbers is possible and va lue is "+result);

		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Handled by system exception");
		}

	}
}
