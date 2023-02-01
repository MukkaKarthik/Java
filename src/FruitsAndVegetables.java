enum fruits
{
	Apple,Mango,Orange,Banana,Watermelon;
}

enum vegetables
{
	Carrot, Potato,Cucumber, Onion, Tomato
}



public class FruitsAndVegetables {

	public static void main(String[] args)
	{
		fruits[] objectfruits = fruits.values();
		vegetables[] objectveg = vegetables.values();
		
		for(fruits refobject : objectfruits)
		{
			System.out.println(refobject + " : "+ refobject.ordinal());
		}
		
		for(vegetables refobject1 : objectveg)
		{
			System.out.println(refobject1 + " : "+ refobject1.ordinal());

		}
		
		fruits f1,f2,f3;
		f1=fruits.Apple;
		f2=fruits.Banana;
		f3=fruits.Mango;
		if(f2.compareTo(f3)>0)
		{
			System.out.println(f2 +" comes after "+f3);
		}
		
		vegetables v1 = vegetables.Carrot;
		
		if(v1.equals(f1))
		{
			System.out.println("Incorrect");
		}
	}
}
