package Restaurant;

 class ChineseRestaurant extends ParentRestaurant{

	 
	void display1()
	{
		System.out.println("Fried Rice available");
		System.out.println("Noodles available");
	
	}
	
	public static void main(String args[])
	{
		ChineseRestaurant c = new ChineseRestaurant();
		c.display1();
		
	}
}
