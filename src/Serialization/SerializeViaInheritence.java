package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



 	class A implements Serializable {
		
		int i;


		 A(int iConstructor) {
			this.i = iConstructor;
		}
	}

	class B extends A {
		int j;

		public B(int iParentConstructor,int jChildConstructor) {
			super(iParentConstructor);
			this.j = jChildConstructor;
		}
	}

	public class SerializeViaInheritence {
		public static void main(String[] args) throws Exception
		{
			B b1= new B(10,20);
			System.out.println("i= "+b1.i);
			System.out.println("j= "+b1.j);
			FileOutputStream fos = new FileOutputStream("abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(b1);
			
			oos.close();
			fos.close();
			
			System.out.println("Object has been serialized ");
			
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			B b2 = (B) ois.readObject() ;
			System.out.println(b2);
			ois.close();
			fis.close();
			
			System.out.println("Object has been de-serialized");
			System.out.println("i= "+b2.i);
			System.out.println("j= "+b2.j);
		}
	}




