package Calc;


 class Calculator1{

	
	public int add(int a, int b) {
		return a+b;
	}

	public int subt(int a, int b) {
		int c;
		c = (int) (a - b);
		return c;
	}

	public int mult(int a, int b) {
		int c;
		c = (int) (a * b);
		return c;
	}

	public int div(int a, int b) {
		int c;
		c = (int) (a / b);
		return c;
	}

}

	 class ChildCalculator extends Calculator1 {
		public float AreaofSquare(int a, int b) {
			float Perimeter;
			Perimeter = (float) 4 * a;
			return Perimeter;
		}

		public float AreaofCircle(int radius) {
			float Perimeter;
			Perimeter = (int) (3.14 * radius * radius);
			return Perimeter;
		}

		public float AdditionandSubtraction(int a, int b) {
			float Perimeter;
			Perimeter = (float) (a + b) * (a - b);
			return Perimeter;

		}
		
	}
	

		 class ChildCalculator1 extends ChildCalculator {
			public float SquareofNo(int a) {
				float Square;
				Square = (float) (a * a);
				return Square;
			}

			public float CubeofNo(int b) {
				float cube;
				cube = (float) (b * b * b);
				return cube;

			}
			
		}

			public class Calculator{
				
			public static void main(String[] args) {
				Calculator1 object1 = new Calculator1();

				float addresult = object1.add(1500,2500);
				float subtresult = object1.subt(1500, 150);
				long  multresult = object1.mult(50,100);
				int divresult = object1.div(1500,500);
				
				System.out.println(addresult);
				System.out.println(subtresult);
				System.out.println(multresult);
				System.out.println(divresult);
				
				ChildCalculator1 object2 = new ChildCalculator1();
				float circlearea = object2.AreaofCircle(20);
				System.out.println(circlearea);
				
			}

}

