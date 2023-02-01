package Arrays;

public class AddtionArrays {
	
	public static void main(String[] args)
	{
		int[][] a = {  
				{1,1,1},
				{1,1,1},
				{1,1,1},
		};
	
		int[][] b = {  
				{1,1,1},
				{1,1,1},
				{1,1,1},
		};
	
		int[][] c= new int[3][3];
		
	System.out.println("==Printing Matrix A==");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println(" ");
	}
	
	System.out.println("==Printing Matrix B==");
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b[i].length;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println(" ");
	}
	
	System.out.println("==Printing Matrix C==");
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<c[i].length;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
		}
		System.out.println(" ");
	}
	
	}

}
