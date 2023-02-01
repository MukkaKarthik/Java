package LinkedList;

import java.util.LinkedList;

public class CloneList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("Welcome");
		list.add("To");
		list.add("Edureka");
		System.out.println("Contents of first linked list is " + list);

//		LinkedList<String> CloneList = new LinkedList<String>();
//		CloneList = (LinkedList<String>) list.clone();
		
		Object cloneStringlIst = list.clone();

		System.out.println("Contents of original linked list is " + list);
		System.out.println("Contents of duplicate linked list =  "   + cloneStringlIst);

	}

}
