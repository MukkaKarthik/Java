package ExternalizableInterface;
import java.io.*;

class Demo{
	int a ;
	String name;
	
	Demo(int a, String name)
	{
		this.a=a;
		this.name=name;
	}
}


public class ExternalInterface {

	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		try
		{
			//Saving the file of an object
			Demo d = new Demo(20,"Karthik");
			String filename ="File.ser";
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
		}
		
		
		catch (FileNotFoundException f) {
			// TODO: handle exception
			System.out.println(f);
		}
		
		catch (IOException e) {
			// TODO: handle exception
		System.out.println(e);
		}
	}
	
}
