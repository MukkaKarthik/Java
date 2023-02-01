import java.util.*;

class Test<T, U>
{
	T o1; // An object of Type T
	U o2; // An object of type U
	
	//constructor
	
	Test(T o1,U o2)
	{
		this.o1= o1;
		this.o2= o2;
	}
	
	public void print()
	{
		System.out.println(o1);
		System.out.println(o2);
	}
}
public class GenericClass {
	
	public static void main(String[] args)
	{
		Test<String , Integer> object = new Test<String ,Integer>("Edureka",10);
		object.print();
	}

}
