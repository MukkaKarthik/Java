public class GenericFunction {

	//A generic method example
	static <T> void GenericDisplay(T element)
	{
		System.out.println(element.getClass().getName() + " = "+ element);
	}
	
	//Driver method
	public static void main(String[] args)
	{
		//Calling generic method with Integer argument
		GenericDisplay(3456);
		
		//Calling generic method with String argument 
		GenericDisplay("Edureka");
		
		//Calling method with double argument
		GenericDisplay(2.0);
	}
}
