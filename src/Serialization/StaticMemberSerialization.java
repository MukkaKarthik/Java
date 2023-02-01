package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;


class StaticVariable implements Serializable{
	static int i=100; //Declaring int value is 100
	
}


public class StaticMemberSerialization extends StaticVariable {


	public static void main(String[] args)
	{
		StaticVariable stob = new StaticVariable();
		System.out.println("at the time of serialization , the value of int i= "+i);
		try {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Mukka Karthik\\Documents\\FileHandler\\abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(stob);
		oos.close();
		fos.close();
		
		i=95; //changing the value to 95
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Mukka Karthik\\Documents\\FileHandler\\abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		stob=(StaticVariable)ois.readObject();
		ois.close();
		fis.close();
		System.out.println("The value of i after Serialization is i= "+ois.readObject());
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
