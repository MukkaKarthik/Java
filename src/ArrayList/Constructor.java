package ArrayList;
import java.util.*;

public class Constructor {

	public static void main(String[] args)
	{
//		ArrayList<String> myarray = new ArrayList<String>();
//		int counter = 0;
//		for(String S: myarray)
//		{
//			counter++;
//		}
//		System.out.println("No args obtained : Can't obtain "+counter);

		
//		ArrayList<String> myarray1 = new ArrayList<String>(30);
//		counter = 0;
//		for (String s : myarray1)
//		{
//			counter++;
//		}
//		System.out.println("No args obtained with capacity 30 : Can't obtain "+counter);
//		System.out.println(" ");
//		
		String[] s1 = {"Karthik","Prateek","Daddy","Mummy"};
		System.out.println(s1); // this variable holds memory address as it an array pointing to a memory location

		
		// after we convert to list , then we can retrieve the values in console
		List<String> listStringArray = Arrays.asList(s1);
		System.out.println(listStringArray);
		
		
		ArrayList<String> myarray2 = new ArrayList<String>(10);
		System.out.println("myarray2 size = " +myarray2.size());
		
		
		myarray2.add("Sunny");
		System.out.println("myarray2 size = " +myarray2.size());
		System.out.println(myarray2);
		
		myarray2.remove("Sunny");
		System.out.println("myarray2 size = " +myarray2.size());
		System.out.println(myarray2);
		
		
		ArrayList<String> a = new ArrayList<String>(myarray2);
		a.add("first word");
		a.add("second word");
		a.add("third word");
		
		System.out.println(a);
		
		
		for(String s : listStringArray)
		{
			System.out.println("ArrayList myarray2 element = "+s);
		}
		
		
	}
	
}
