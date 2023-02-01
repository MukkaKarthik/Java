package practisePrograms;

public class genericFunctions {
	
	public <T> T  basicGenericMethod(T inputElement) 
	{
		 return inputElement;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		genericFunctions g = new genericFunctions();
		
		//sending , calling and returning string values 
		System.out.println(g.basicGenericMethod("Hello world "));
		
		//sending , calling and returning integer  values 
				System.out.println(g.basicGenericMethod(23));
				
				
		

	}

}
