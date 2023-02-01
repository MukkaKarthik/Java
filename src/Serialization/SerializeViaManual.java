package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


	class superclass {
		int i;

		superclass(int i) {
			this.i = i;

		}
		
		superclass() {
			i = 50;
			System.out.println("Default subclass constructor called");
		}

	}

	class subclass extends superclass implements Serializable {
		int j;

		subclass(int i, int j) {
			super(i);
			this.j = j;
		}

		

	}


	public class SerializeViaManual {

		public static void main(String[] args) throws Exception
		{
			subclass s = new subclass(10,20);
			System.out.println("i= "+ s.i);
			System.out.println("j= "+s.j);
			FileOutputStream fos = new FileOutputStream("abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			System.out.println("Object has been serialized");
			oos.close();
			fos.close();
			
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			subclass s1 = (subclass) ois.readObject();
			ois.close();
			fis.close();
			
			System.out.println("Object has been de-serialized");
			System.out.println("i= "+s1.i);
			System.out.println("j= "+s1.j);
			
			
		}
	}