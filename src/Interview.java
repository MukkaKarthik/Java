
public class Interview {

	public static void main(String[] args)
	{
		String str = ("Hello");
		StringBuilder str1 = new StringBuilder("Hello");
		StringBuffer str2 = new StringBuffer("Hello");
		
		String newstr=str.concat("World"); //Immutable String
		str1.append("World"); //Mutable String
		str2.append("World"); //Mutable String 
		
		System.out.println(newstr); 
		System.out.println(str1);
		System.out.println(str2);
	}
}
