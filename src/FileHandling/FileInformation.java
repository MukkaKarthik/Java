package FileHandling;

import java.io.File;

public class FileInformation {

	public static void main(String[] args)
	{
		File object = new File("C:\\Users\\Mukka Karthik\\Documents\\FileHandler\\WritetoFile.txt");
		
			if(object.exists())
			{
				System.out.println("File successfully created"+" "+ object.getName());
				System.out.println("Absolute path is "+" "+ object.getAbsolutePath());
				System.out.println("File Writeable is "+" "+object.canWrite());
				System.out.println("File Readable is "+" "+ object.canRead());
				System.out.println("File length is "+ object.length());
			}
			else
			{
				System.out.println("File is not present");
			}
		
	}
}
