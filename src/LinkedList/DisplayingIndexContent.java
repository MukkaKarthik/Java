package LinkedList;

import java.util.LinkedList;

public class DisplayingIndexContent {

	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<String>();
		list.add("National");
		list.add("Institute");
		list.add("of");
		list.add("Technology");
		
		System.out.println("Contents of linked list are "+list);
		
		System.out.println("National word is present in linkedlist having index at "+list.indexOf("National"));
		System.out.println("Technology word is present in linkedlist having index at "+list.indexOf("Technology"));

	}
	
}

