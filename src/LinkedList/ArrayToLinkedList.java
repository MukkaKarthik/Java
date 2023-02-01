package LinkedList;

import java.util.LinkedList;

public class ArrayToLinkedList {

	public static void main(String[] args) {
		String[] arraylist = { "Karthik", "Daddy", "Mummy", "Prateek" };
		LinkedList<String> StringLinkedList = new LinkedList<String>();
		
		int[] intArray = {23,34,5,43,567};
		
		

		System.out.println("Contents of string list are ");

		for (String s : arraylist) {
			System.out.println(s);
			StringLinkedList.add(s);
		}
		
		for(int numLocal : intArray)
		{
			System.out.println(numLocal);
		}
		System.out.println("last statement ");
		System.out.println(StringLinkedList);

	}
}
