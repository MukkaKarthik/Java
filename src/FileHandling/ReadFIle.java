package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFIle {

	public static void main(String[] args)
	{
		try{
			File object = new File("C:\\Users\\Mukka Karthik\\Documents\\FileHandler\\WritetoFile.txt");
		
		Scanner scan = new Scanner(object);
		while(scan.hasNextLine())
		{
			String data= scan.nextLine();
			System.out.println(data);
		}
		scan.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
}
