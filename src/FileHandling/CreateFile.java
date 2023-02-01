package FileHandling;

import java.io.File; // import the file class

public class CreateFile {

	public static void main(String[] args)
	{
	 	 File object = new File("C:\\Users\\Mukka Karthik\\Documents\\FileHandler\\FileInfo.txt"); 
	 if(object.exists())
	 {
		 System.out.println("File successfully created "+" "+object.getName());
		 System.out.println("File length is "+" "+ object.length());

	 }
	 else
	 {
		 System.out.println("File already exists");

	 }
	 
	 
	 // creating a new file 
	 
	 File object2 = new File("C:\\Users\\Mukka Karthik\\Documents\\FileHandler\\FileInfo2TestingPractise.txt"); 
	 if(object.exists())
	 {
		 System.out.println("File successfully created "+" "+object2.getName());
		 System.out.println("File length is "+" "+ object2.length());

	 }
	 else
	 {
		 System.out.println("File already exists");

	 }
	
	
	}
}
