package PatternMatcher;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TextFinder {

	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in))
		{
			while(true)
			{
				System.out.println("Enter regex pattern");
				String regex = sc.nextLine();
				Pattern pattern =  Pattern.compile(regex);
				Matcher matcher = pattern.matcher("Welcome to Youtube Channel");
				boolean found = false ;
			
				while(matcher.find())
				{
				System.out.println("found the text "+matcher.group()+" starting at index "+matcher.start()+
						" ending at index "+ matcher.end());
				found = true;
				}
				if(!found)
				{
					System.out.println("Text not found");
				}
			}
		}
	}
}
