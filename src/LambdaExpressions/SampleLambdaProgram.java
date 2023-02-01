package LambdaExpressions;

@FunctionalInterface
interface Cab {
	// void BookCab(); //by default public abstract method
	// void BookCab(String Source, String Destination); // by default it will be
	// public
	double Fare(String Source, String Destination);
}
/*
 * class Uber implements Cab { public void BookCab() {
 * System.out.println("Uber Cab booked"); } }
 */

public class SampleLambdaProgram {

	public static void main(String[] args) {

		/*
		 * 1) Cab c = new Uber(); c.BookCab();
		 */

		/*
		 * 2) // Anonymous Cab Class implementation Cab cab = new Cab() {
		 * 
		 * @Override public void BookCab() { System.out.println("Uber Cab booked");
		 * 
		 * } }; cab.BookCab();
		 * 
		 */

		// Using a Lambda expression
		Cab cab = (source, Destination) -> {
			System.out.println("Uber Cab booked from " + source + " to " + Destination);
			return 876.897;

		};
		double Fare = cab.Fare("Bangalore", "Manali");
		System.out.println("Fare shall be " + Fare);
	}

}
