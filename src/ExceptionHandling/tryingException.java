package ExceptionHandling;

import java.io.IOException;

public class tryingException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.println("throwing exception from try method");
			throw new Exception("an exception occurred from try method");
			
		}
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("continuing method execution");

	}

}
