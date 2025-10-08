package collections;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // Add elements
        set.add(30);
        set.add(10);
        set.add(50);
        set.add(20);
        set.add(10); // duplicate element (won’t be added)

        // Display the TreeSet
        System.out.println("TreeSet elements (sorted order): " + set);

        // Remove an element
        set.remove(20);
        System.out.println("After removing 20: " + set);

        // Check if an element exists
        System.out.println("Contains 30? " + set.contains(30));

        // Get the first and last elements
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // Size of the TreeSet
        System.out.println("Size of TreeSet: " + set.size());

        // Iterating through elements
        System.out.println("Iterating through TreeSet:");
        for (int num : set) {
            System.out.println(num);
        }
	}

}
