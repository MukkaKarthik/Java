package ExceptionHandling;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class ConvertDateFormat {

	static void ChangeFormat(String inputdate) {
		try {

			SimpleDateFormat sdt = new SimpleDateFormat("dd/mm/yyyy");
			Date date1 = sdt.parse(inputdate);
			SimpleDateFormat outputDate = new SimpleDateFormat("yyyy-mm-dd");
			String outputDate1 = outputDate.format(date1);
			System.out.println("After changing the date to yyyy-mm-dd " + outputDate1);
		} 
		catch (java.text.ParseException e) {
			System.out.println("Some error occurred during date conversion ");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the data to be converted in following format DD/MM//YYYY");
		String input = scan.next();
		ChangeFormat(input);
	}
}
