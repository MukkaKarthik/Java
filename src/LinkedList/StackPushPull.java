package LinkedList;

import java.util.LinkedList;

public class StackPushPull {

	public static void main(String[] args) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(500);
		System.out.println("Contents of Stack are " + stack);
		
		stack.pop();
		System.out.println("Contents of Stack are " + stack);

	}

}
