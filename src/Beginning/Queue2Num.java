package Beginning;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue2Num {
	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<>();

		// Adds elements {5, 6, 7, 8, 9} to queue
		for (int i = 5; i < 10; i++)
			q.add(i);

		// Display contents of the queue.
		System.out.println("Elements of queue : " + q);
		q.offer(20);
		System.out.println("offer method " + q);
		
		
		
		
		// To remove the head of queue.
		int removedele = q.remove();
		System.out.println("removed element: " + removedele);

		System.out.println(q);

		// To view the head of queue
		int head = q.peek();
		System.out.println("head of queue: " + head);

		System.out.println(q);

		q.poll();// removes first element
		System.out.println("after poll method: " + q);
		// methods of collection interface,
		// Like size and contains can be used with this
		// implementation.
		int size = q.size();
		System.out.println("Size of queue: " + size);
	}
}
