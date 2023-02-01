package practisePrograms;

import java.util.*;


public class stringConcatenation {

	public stringConcatenation() {
		// TODO Auto-generated constructor stub
	
		String a = "Welcome to Edureka";
		
String[] aCharArray = a.split("");

System.out.println(a);

for(String local : aCharArray)
{
	for(int j=local.length(); j>0;j--)
	{
		System.out.println(aCharArray[j]);
	}
}


	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stringConcatenation sc = new stringConcatenation();
		

	}

}
