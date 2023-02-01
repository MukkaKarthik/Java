package FileHandling;

import java.io.FileWriter; //importing File writer class

public class WriteFile {

	public static void main(String[] args)
	{
		
		try{
			FileWriter object = new FileWriter("C:\\Users\\Mukka Karthik\\Documents\\FileHandler\\WritetoFile.txt");
		
		object.write("Java is a predominant language");
		object.write("");
		object.write("");
		object.write("");
		
		object.write("Practise makes man perfect");
		object.close();
		System.out.println("Succesfully wrote to file");
		System.out.println("");
		}
		
	catch(Exception e )
		{
		e.printStackTrace();
		}
	}
}
