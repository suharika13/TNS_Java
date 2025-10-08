package collections;
import java.util.PriorityQueue;

public class PriorityQueueExp {

	public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        // Display the PriorityQueue
        System.out.println("PriorityQueue elements: " + pq);

        // Peek (check the head element)
        System.out.println("Head element (peek): " + pq.peek());

        // Remove elements
        System.out.println("Removed element: " + pq.poll());
        System.out.println("After removing head: " + pq);

        // Check size
        System.out.println("Size of PriorityQueue: " + pq.size());

        // Iterating through elements (order not guaranteed)
        System.out.println("Iterating through PriorityQueue:");
        for (int num : pq) {
            System.out.println(num);
        }

	}

}
