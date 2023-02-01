package Arrays;

public class SampleArray {
	
	public static void main(String[] args)
	{
		/*int StatePopulation1 = 484;
		int StatePopulation2 = 457;
		int StatePopulation3 = 446;
		int StatePopulation4 = 248;
		int StatePopulation5 = 595;
		
		System.out.println(StatePopulation1);
		System.out.println(StatePopulation2);
		System.out.println(StatePopulation3);
		System.out.println(StatePopulation4);
		System.out.println(StatePopulation5);
		
		
		int[] array = {234,474,974,856,975};
		
		int[] array = new int[5];
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println("StatePopulation["+i+"]= "+array[i]);
		}
		
		array[0] = 234;
		array[1] = 434;
		array[2] = 534;
		array[3] = 334;
		array[4] = 634;
		
					
		System.out.println("Reading elements after write operation is ");
		for(int i=0;i<array.length;i++)
		{
		System.out.println("array["+i+"]= "+array[i]);
		*/
		
		int[] CountryPopulation = {1223,243,542,54652};
		int count=0;
		
		for(int a : CountryPopulation)
		{
			System.out.println(a);
			count= count+a;
	}
		System.out.println("Total count = "+count);
}

}
