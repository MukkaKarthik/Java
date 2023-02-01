import java.util.*;

public class PatternA {
	
	void display(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=n/2;j++)
			{
				//printing outer two columns
				if((j==0 || j==n/2) && i !=0 || 
						
						//printing first line of alphabet
						i==0  && j!=0 && j!=n/2 ||
						
						//print middle line
						i==n/2)
					System.out.print("*");
				
				else
					
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
	
	
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		PatternA a = new PatternA();
		a.display(7);
	}
}
