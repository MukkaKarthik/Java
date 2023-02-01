public class ReverseString {

	public static void main(String[] args)
	{
		String str = "Welcome To Edureka";
		String[] strarray = str.split(" ");
		
		for(String temp : strarray)
		{
			System.out.print(temp+" ");
		}
		
		System.out.println(" ");
		for(int i=0;i<3;i++)
		{
			char[] s1 = strarray[i].toCharArray();
			for(int j=s1.length-1;j>=0;j--)
			{
				System.out.print(s1[j]);
			}
			System.out.print(" ");
		}
		
	}
}
