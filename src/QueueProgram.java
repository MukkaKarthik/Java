import java.util.*;

public class QueueProgram {

	public static void main(String[] args)
	{
		Queue<String> queue = new LinkedList<>();
		queue.add("one");
		queue.add("two");
		queue.add("Three");
		queue.add("four");
		System.out.println(queue);
		
		queue.remove("two");
		System.out.println("Queue Size = "+queue.size());
		
		System.out.println("Queue contains element two or no ? "+queue.contains("two"));
		
		//To empty the queue
		queue.clear();
		
	}
}
