package PatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class MatchingPattern {

	public static void main(String[] args) {
		
//	System.out.println("MetaCharacters d (represents digits and should come once");
//	
//	System.out.println(Pattern.matches("d", "abc")); // false no digits
//	System.out.println(Pattern.matches("d", "1")); // true digit came once
//	System.out.println(Pattern.matches("d", "4443"));//false digits came multiple times 
//	System.out.println(Pattern.matches("d", "323abc"));// false digits and non - digits are included ,came more times
//	System.out.println(Pattern.matches("d", "m"));// false non-digit 
//	
	
//System.out.println("MetaCharacters D (represents non- digits and should come once");
//	
//	System.out.println(Pattern.matches("D", "abc")); // false non digits came more times
//	System.out.println(Pattern.matches("D", "1")); // false  digit came once
//	System.out.println(Pattern.matches("D", "4443"));//false digits came multiple times 
//	System.out.println(Pattern.matches("D", "323abc"));// false digits and non - digits are included ,came more times
//	System.out.println(Pattern.matches("D", "m"));// true  non-digit came once  
//	System.out.println(Pattern.matches("D", "abc"));// true  non-digit came more times  

System.out.println("MetaCharacters D* (represents non- digits and should come once");
	
	System.out.println(Pattern.matches("D*", "abc")); // true non digits came more times
	System.out.println(Pattern.matches("D*", "1")); // false  digit came once
	System.out.println(Pattern.matches("D*", "4443"));//false digits came multiple times 
	System.out.println(Pattern.matches("D*", "323abc"));// false digits and non - digits are included ,came more times
	System.out.println(Pattern.matches("D*", "m"));// true  non-digit came once  
	System.out.println(Pattern.matches("D*", "abc"));// true  non-digit came more times  
	
	}
}
