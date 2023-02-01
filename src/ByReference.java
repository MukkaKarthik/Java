public class ByReference {

	int x =50;
	
	void modify(ByReference b)
	{
		b.x=2000;
	}
	
	
	public static void main(String[] args)
	{
		ByReference object = new ByReference();
		
		System.out.println("Value of x before modifying data is "+object.x);
		
		object.modify(object);
		
		System.out.println("Value of x after modifying data is "+object.x);
	}
}
