package Arrays;

public class BubbleSort {

	static void sorting(int[] ArrayinSorting)
	{
		for (int i=0;i<ArrayinSorting.length-1;i++)
		{
			for (int j=0;j<ArrayinSorting.length-i-1;j++)
			{
				if(ArrayinSorting[j]>ArrayinSorting[j+1])
				{
					int temp;
					temp=ArrayinSorting[j+1];
					ArrayinSorting[j+1]=ArrayinSorting[j];
					ArrayinSorting[j]=temp;
				}
			}
		}
	}



public static void main(String[] args)
	{
		int[] array = { 4, 1 , 10, -3 ,12};
		BubbleSort.sorting(array);
		
		System.out.println("After performing iteration ,we get array in ascending order as ");
		for (int elm : array)
		{
			System.out.print(elm+" ");
		}
	}
		
		
}