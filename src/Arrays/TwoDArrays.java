package Arrays;

public class TwoDArrays {

	public static void main(String[] args)
	{
	/*	int[][] worldPopulation = {
 //states for country--> 0,   1,  2,  3,  4     	
						{123,542,842,547,2358}, //0 -->Country1 
						{124,567,234,957,5248}, //1 -->Country2
						{245,589,652,325,5698}, //2 -->Country3
	};
	System.out.println("The world population is "+worldPopulation + "length of population is "+worldPopulation.length);
	
System.out.println("The world population[0] is "+worldPopulation[0] + "length of population is "+worldPopulation[0].length);
System.out.println("The world population[1] is "+worldPopulation[1] + "length of population is "+worldPopulation[1].length);
System.out.println("The world population[2] is "+worldPopulation[2] + "length of population is "+worldPopulation[2].length);
	*/
		int[][] WorldPopulation = new int[3][5];
		
	for(int i=0;i<WorldPopulation.length;i++) //ith row
	{
		for(int j=0;j<WorldPopulation[i].length;j++)
		{
			System.out.print(WorldPopulation[i][j]+" ");
		}
		System.out.println(" ");
	}
	}

}
