package Calc;

class CarnivorousAnimal 
{
	void move()
	{
		System.out.println("CarnivorousAnimal can move and walk like parent dog");
	}
	
}

public class Dog  extends CarnivorousAnimal{

	void move()
	{
		System.out.println("Dogs  can move like parent carnivorous animals");
	}

	public static void main(String[] args)
	{
		//calling parent methods 
		CarnivorousAnimal A= new CarnivorousAnimal();
		A.move();
		
		//calling child methods
		Dog D= new Dog();
		D.move();
		
		//creating dog object of type parent
		CarnivorousAnimal a1 = new Dog();
		a1.move();
		
		
		}
	
	
}

	

