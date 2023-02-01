package ArrayList;
import java.util.*;

import javax.xml.crypto.Data;

public class CustomArray {

	int i,n=5;
	
	
		int[] roll;
		String[] name;
		int[] marks;
		long[] phone;
		
	
	
	
		CustomArray(int[] roll1,String[] name1,int[] marks1,long[] phone1)
		{
			this.roll=roll1;
			this.name=name1;
			this.marks=marks1;
			this.phone=phone1;
		}
		
		List<String> listStringa = Arrays.asList(name);
		
		
		void printVariables()
		{
			System.out.println(listStringa);
		}
	

	public static void main(String[] args) {

		int[] rollMainMethod = {1,2,3,4};
		String[] nameMainMethod = {"Karthik","Harsha","Vinodh","Mohinder","Tushar"};
		int[] marksMainMethod = {98,96,87,67,98};
		long[] phoneMainMethod = {63872478L,7324836257L,83298452L,34328794L};
		
		
 
	
		CustomArray c = new CustomArray(rollMainMethod,nameMainMethod,marksMainMethod,phoneMainMethod);
		c.printVariables();
				
		
		//ca.addValues(roll,name,marks,phone);
	}
		
//	public void addValues(int rollno[],String names[],int marks[],long phoneno[])
//	{
//		ArrayList<Data> list = null;
//		for(int i=0;i<n;i++)
//		{
//			list.add(new StudentData( rollno[i],  names[i],  marks[i],  phoneno[i]));
//		
//		}
//		
//		System.out.println(list);
//	}
	
	
	}
	
	