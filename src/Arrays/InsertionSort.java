package Arrays;

public class InsertionSort
{
	static void InsertionSorting(int[] InputArray)
	{
	int len =InputArray.length;
	for(int i=0;i<len;i++)
	{
		int key=InputArray[i];
		int j=i-1;
		
		//Moving elements of InputArray from 0 to i-1
		//Moving only those elements which are greater than key
		//WE are moving them to one position ahead of current position 
		
		while(j>=0 && InputArray[j]>key)
		{
			InputArray[j+1] = InputArray[j];
			j=j-1;
		}
		InputArray[j+1] = key;
}

}




public static void main(String[] args) {
	int[] array = { 3, 16, -2, -4, 0 };
	InsertionSorting(array);
	System.out.println("Elements after Insertion sorting is ");

	for (int elm : array) {
		System.out.print(elm + " ");
	}
}

}
