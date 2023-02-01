package LinkedList;

import java.util.*;

public class ApendLinkList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Welcome");
		list.add("to");
		list.add("Edureka");
		list.add("printing technology");
		System.out.println("Linked list before appending was " + list);

		list.add(1, "An");
		list.add(1, "online");
		list.add(2, "Technology");
		list.add(3, "Education");
		list.add(2, "providing");
		list.add(3, "center");

		System.out.println("Linked list after appending data is " + list);
		
		
	
	}

}
