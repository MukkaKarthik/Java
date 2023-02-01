package LinkedList;

import java.util.LinkedList;

public class AddingLastWord {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("BMW");
		list.add("Mercedes");
		list.add("Roaster");

		System.out.println("Contents of LinkedList are " + list);

		list.offerLast("Lamborgini");
		System.out.println("LinkedList conetents after adding are " + list);
	}
}
