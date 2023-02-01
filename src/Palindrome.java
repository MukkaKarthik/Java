import java.util.*;

public class Palindrome {

	 static void PalindromePerform(String inputword)
	{
	
		 boolean result = true;
		 int length=inputword.length();
		 
		 for(int i=0;i<inputword.length()/2;i++)
		 {
			 if(inputword.charAt(i)!= inputword.charAt(length-i-1))
			 {
				 result = false;
				 break;
			 }
		 }
		 System.out.println(inputword + " is palindrome = "+result);
		
	}
	
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type the input string to check Palindrome");
		
		String palindromeword = reader.nextLine();

		Palindrome.PalindromePerform(palindromeword);
	}
}

