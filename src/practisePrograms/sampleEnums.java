package practisePrograms;

public class sampleEnums {
	
	enum fruits 
	{
		Banana,Apple,Manago,Orange
	}
	
	enum vegetables
	{
		Carrot,Potato,Cucumber,Onion
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fruits[] fruitObject = fruits.values();
		vegetables[] vegetableObject = vegetables.values();
		
		
		//Looping over fruits objects 
		
		for(fruits fruitLocalObject : fruitObject)
		{
			System.out.println(fruitLocalObject + " =  " + fruitLocalObject.ordinal() );
		}
		
		for(vegetables vegLocalObject : vegetableObject)
		{
			System.out.println(vegLocalObject + "[" + vegLocalObject.ordinal() + "]");
		}
		
		System.out.println(fruits.Banana.ordinal());
		
		fruits compareBananaObject = fruits.Banana;
		
		if(compareBananaObject == fruits.Banana)
		{
			System.out.println("Both the strings are equal");
		}
		
		else {
			System.out.println("Strings are not equal");
		}

	}

}
