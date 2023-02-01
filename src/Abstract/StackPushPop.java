package Abstract;

import java.util.Stack;

public class StackPushPop {
	

		static final int MAX = 1000;
		int top;
		int a[] = new int[MAX]; // Max size of stack

		boolean IsEmpty() {
			return (top < 0);
		}

		public StackPushPop() {
			top = -1;
		}

		boolean push(int x) {
			if (top >= (MAX - 1)) {
				System.out.println("Stack overflow");
				return false;
			} else {
				a[++top] = x;
				System.out.println(x + " pushed into stack");
				return true;
			}
		}

		int pop() {
			if (top < 0) {
				System.out.println("Stack underflow ");
				return 0;
			} else {
				int x = a[top--];
				return x;
			}
		}

		int peek() {
			if (top < 0) {
				System.out.println("Stack underflow");
				return 0;
			} else {
				int x = a[top];
				return x;

			}
		}

		// Driver code
		public static void main(String args[])
		{
			StackPushPop s = new StackPushPop ();
			s.push(10);
			s.push(20);
			s.push(30);
			s.push(40);

			System.out.println(s.pop() + " Popped from Stack");
		}
	}



