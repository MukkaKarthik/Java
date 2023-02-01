package ArrayList;

import java.util.ArrayList;

import java.util.*;


public class MethodsOfArrayList {

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
	
		al.add("Edureka");
		al.add("Online");
		al.add("Training");
		al.add("Platform");
		al.add(23);
		al.add(true);
		al.add(false);
	
	System.out.println("Size of array list is  "+ al.size());
	
	System.out.println("Contents of array list are "+ al);
	
	
	//Using remove method 
		al.remove(false);
		
		
		System.out.println("Size of array list after deleting last-1 Index is "+ al.size());
		
		System.out.println("Contents of array list are "+ al);
		
		
		al.remove("Platform");
		
		
		System.out.println("Size of array list after deleting 3rd Index is "+ al.size());
		
		System.out.println("Contents of array list are "+ al);

		al.remove("Edureka");
		System.out.println("Size of array list is  after deleting platform word "+ al.size());
		
		System.out.println("Contents of array list are "+ al);
	
		
		Object clonelist = al.clone();
		System.out.println("Elements of clonelist are ");
		
		System.out.println(clonelist);
		
				
		Object[] objectArray = al.toArray();
		System.out.println("Elements of object array are ");
	
		for(int i=0;i<objectArray.length;i++)
		{
			System.out.println(objectArray[i]);
		}
		
		((ArrayList) clonelist).clear();
		System.out.println("Elements after clearing array are "+clonelist);
	}
}
