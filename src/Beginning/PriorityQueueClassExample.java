package Beginning;
import java.util.Iterator;
import java.util.PriorityQueue;

//import org.apache.http.impl.io.SocketOutputBuffer;

public class PriorityQueueClassExample {
	public static void main(String[] args) {
		// declaring the PriorityQueue class
		PriorityQueue<String> pq = new PriorityQueue<String>();

		pq.add("d");
		pq.offer("b");
		pq.add("c");
		pq.add("a");
		System.out.println(pq);
		
		System.out.println("head " + pq.element());
		System.out.println("head " + pq.peek());
		System.out.println(" ================================================================");
		System.out.println("Traverse the queue elements ");

		Iterator itr = pq.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + ",");
		}
		System.out.println();
		System.out.println(" ================================================================");
		pq.remove();
		pq.poll();
		System.out.println("after removing two elements :");
		Iterator<String> itr2 = pq.iterator();
		while (itr2.hasNext()) {
			System.out.print(itr2.next() + ",");
		}
	}
}
