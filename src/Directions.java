enum MapDirections
{
	North , West , East, South;
}


public class Directions {
	
	public static void main(String[] args)
	{
		MapDirections dir = MapDirections.North;
		if(dir == MapDirections.North)
			System.out.println("Direction is North");
	
		if(dir == MapDirections.South)
			System.out.println("Direction is South");
		
		if(dir == MapDirections.West)
			System.out.println("Direction is West");
		
		if(dir == MapDirections.East)
			System.out.println("Direction is East");
	
	
	}

}
