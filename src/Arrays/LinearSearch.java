package Arrays;

public class LinearSearch {

	static int LinearSearching(int[] InputArray, int a)
	{
		System.out.println("Given element is "+a );
	int FoundValue =-1;

	for (int i=0;i<InputArray.length;i++)
		{
			if(InputArray[i]==a)
			{
				FoundValue=a;
				System.out.println("Element "+a+" found in ["+i+"]th array");
				return FoundValue;
				
			}


			else 
			{
				System.out.println("Element Not found in ["+i+"]th array");
			}
		}
		return -1;

	}
	
	
	public static void main(String[] args)
	{
		int[] array = {-3, 5, 0, -15 , 10};
		
		System.out.println("Result after element searching is ");
		LinearSearch.LinearSearching(array,0);
	}
}
