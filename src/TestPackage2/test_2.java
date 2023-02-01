package TestPackage2;
import java.util.Scanner;

import TestPackage1.test_1;

public class test_2 {
	
	public static void main(String[] args)
	{
		
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two nos to add ");
	int a=scan.nextInt();
	int b=scan.nextInt();
	
	test_1 t1 = new test_1();
	int addresult =t1.add(a,b);

	System.out.println("Addition of 2 no's a and b are "+addresult);
	
	
	System.out.println("Enter two nos to multiply ");
	int c=scan.nextInt();
	int d=scan.nextInt();
	
	int multresult =t1.mult(c,d);
	
	System.out.println("Multiplication of 2 no's c and d are "+multresult);
	
	System.out.println("enter a string to give output");
	
	String aStringValue = scan.next();
	
	System.out.println("given string = " + aStringValue);
	
	}

}
