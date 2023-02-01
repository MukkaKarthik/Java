package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;


class Parent implements Serializable{
	int i;
	
	public Parent(int i)
	{
		this.i=i;
	}
	
}

class child extends Parent 
{
	int j;
	
	public child(int i,int j)
	{
		super(i);
		this.j=j;
	}
	
	private void writeObject(ObjectOutputStream out) throws IOException
	{
		throw new NotSerializableException();
	}
	
	private void readObject(ObjectInputStream in) throws IOException
	{
		throw new NotSerializableException();
	}
	
}


	public class SerializiableThrowException{
		
		public static void main(String[] args) throws Exception 
		{
			child c = new child(10,20);
			System.out.println("i= "+c.i);
			System.out.println("i= "+c.j);
			
			FileOutputStream fos = new FileOutputStream("cde.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(c);
			oos.close();
			fos.close();
			System.out.println("Serialization has passed ");
			
			FileInputStream fis = new FileInputStream("cde.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			child c1 = (child)ois.readObject();
			ois.close();
			fis.close();
			
			System.out.println("De-Serialization passed");
			System.out.println("i= "+c1.i);
			System.out.println("j= "+ c1.j);
			
		}
		
	}
	
			
			
			
			
		
	












