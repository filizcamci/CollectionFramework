package Beginning;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class DequeExample {
	public static void main(String[] args){
        Deque deque = new LinkedList();
//        Deque deque = new ArrayDeque();
        // We can add elements to the queue in various ways
        deque.add("Tail"); // add to tail
        deque.addFirst("Head");
        deque.addLast("Tail");
        deque.push("Head"); //add to head
        deque.offer("Tail");
        deque.offerFirst("Head");
        deque.offerLast("Tail");
 
        System.out.println(deque + "\n");
// ===================================================================================
        // Iterate through the queue elements.
        System.out.println("Standard Iterator");
        Iterator iterator = deque.iterator();
        while (iterator.hasNext())
            System.out.println("\t" + iterator.next());
 
     // ===================================================================================
        // Reverse order iterator
        Iterator reverse = deque.descendingIterator();
        System.out.println("Reverse Iterator");
        while (reverse.hasNext())
            System.out.println("\t" + reverse.next());
     // ===================================================================================
        // Peek returns the head, without deleting
        // it from the deque
        System.out.println("Peek " + deque.peek());
        System.out.println("After peek: " + deque);
     // ===================================================================================
        // Pop returns the head, and removes it from
        // the deque
        System.out.println("Pop " + deque.pop());
        System.out.println("After pop: " + deque);
     // ===================================================================================
        // We can check if a specific element exists
        // in the deque
        System.out.println("Contains element 3: " +
                        deque.contains("Element 3 (Tail)"));
     // ===================================================================================
        // We can remove the first / last element.
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removing " +
                            "first and last: " + deque);
 
    }
}
