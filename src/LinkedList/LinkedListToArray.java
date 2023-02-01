package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListToArray {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Bangalore");
		list.add("Hyderabad");
		list.add("Delhi");
		list.add("Dhanbad");

		System.out.println("String Linked List is"+list);
		
		System.out.println("Size of the linked list is "+list.size());
		
		int sizeofList =list.size();
		
		//creating a new string array
		String[] arraylist = new String[sizeofList];
		
		// converting string array to array list 
		arraylist = list.toArray(arraylist);
		
		System.out.println(Arrays.toString(arraylist));
}
}
