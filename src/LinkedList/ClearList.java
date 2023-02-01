package LinkedList;

import java.util.LinkedList;

public class ClearList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("Welcome");
		list.add("to");
		list.add("Edureka");

		System.out.println("Contents added to linkarray is " + list);

		list.clear();

		list.add("Tied");
		list.add("Up");
		list.add("to");
		list.add("Warangal");
		list.add("NIT");

		System.out.println("Contents present in linked list after deleting and adding is " + list);
		
		

	}
}
