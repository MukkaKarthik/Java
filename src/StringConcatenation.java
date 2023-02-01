
public class StringConcatenation {

	public static void main(String[] args)
	{
		String s1 = "Hello";
		String s2 = " World";
		String s3 = s1+s2;
		System.out.println(s3);
		
		int length = s3.length();
		
		System.out.println("Length of s3 string is "+length);
		
		if(s1.equals(s2))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");

		String s4 = s3.toLowerCase();
		System.out.println(s4);
		
		String s5=s3.toUpperCase();
		System.out.println(s5);
	}
}
