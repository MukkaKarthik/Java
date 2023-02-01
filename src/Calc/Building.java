package Calc;

public class Building {
	
	int height;

	 Building() {
		height=10;
		System.out.println("Bricks height is " + height + " " + "feet tall");

	}

	 Building(int i) {
		System.out.println("Constructor method : Building height  is " + " " + i);
	}

	void info() {
		height=20;
		System.out.println("Building height is " + " " + height + " " + "feet tall");
	}

	void info(int i) {
		System.out.println("Building height is " + " " + i);
	}

	public static void main(String[] args) {
		Building object = new Building(15);
		object.info(15);
	}

}
