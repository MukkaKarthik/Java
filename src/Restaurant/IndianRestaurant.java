package Restaurant;

 class IndianRestaurant extends ParentRestaurant{

	 public IndianRestaurant() {
		// TODO Auto-generated constructor stub
	super();
	System.out.println("exceuting child constructor");
	 }
	
	 public void display2()
	{
		System.out.println("Biryani Available");
		System.out.println("Meals Available");
	}

	
	 public static void main(String args[])
	 {
		 IndianRestaurant i = new IndianRestaurant();
			i.display2();	 
	 }

	 
	 
	

}
