package LinkedList;

import java.util.LinkedList;

public class SizeLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Bangalore");
		list.add("Hyderabad");
		list.add("Delhi");
		list.add("Dhanbad");

		System.out.println("Contents of linked list are " + list);
		System.out.println("Size of linked list is "+list.size());
}
}

