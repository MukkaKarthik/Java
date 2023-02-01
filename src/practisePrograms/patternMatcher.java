package practisePrograms;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatcher {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string to match with regular expression or lambda expression");
		
		Scanner s = new Scanner(System.in);
		
		String a = s.nextLine(); // this will take a complete line but not single word 
		
		Pattern patternAfterCompilation = Pattern.compile(a);
		
		Matcher matchPattern = patternAfterCompilation.matcher("Welcome to some channel");
		
	
		//Using of loop will search for entire text 
		if(matchPattern.matches())
		{
			System.out.println("Pattern got matched using if loop" );
		}
		
		else {
			System.out.println("Pattern did not match using if loop");
		}
		
		
		// Using while loop can search for any part of the text 
		while(matchPattern.matches())
		{
			if(true)
			{
				System.out.println("pattern got matched using while loop");	
			}
			else
			{
				System.out.println("pattern did not match using while loop");
			}
			
		}
		
		

	}

}
