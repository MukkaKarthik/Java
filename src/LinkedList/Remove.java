package LinkedList;

import java.util.LinkedList;

public class Remove {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Bangalore");
		list.add("Hyderabad");
		list.add("Delhi");
		list.add("Dhanbad");

		System.out.println("Contents of linked list are " + list);

		System.out.println("Replacing 2nd object " + list.set(2, " USA"));
		System.out.println("Replacing 3rd object  " + list.set(3, "America"));
		System.out.println("Replacing 1st object " + list.set(0, "word replaced just now"));
		System.out.println("Contents after removal are " + list);
	}

}
