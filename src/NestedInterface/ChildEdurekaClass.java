package NestedInterface;

public class ChildEdurekaClass implements EdurekaClass.EdurekaInterface{

	public void NestedMethod()
	{
		String input ="Edureka";
		
		//getBytes() method to convert string 
		//into bytes[]
		
		byte[] strAsByteArray = input.getBytes();
		
		byte[] result = new byte[strAsByteArray.length];
		
		//Store result in reverse order into the 
		//result byte
		
		for(int i=0;i<strAsByteArray.length;i++)
		{
			
result[i] = strAsByteArray[strAsByteArray.length-i-1];
			
			System.out.println(new String(result));
			
		}
		
			
	}
	
	public static void main(String[] args)
	{
		EdurekaClass.EdurekaInterface object = new ChildEdurekaClass();
		object.NestedMethod();
	}
}
