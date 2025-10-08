package collections;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// Create a LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");
        set.add("Apple"); // duplicate element (won’t be added)

        // Display the set
        System.out.println("LinkedHashSet elements: " + set);

        // Remove an element
        set.remove("Banana");
        System.out.println("After removing Banana: " + set);

        // Check if an element exists
        System.out.println("Contains Mango? " + set.contains("Mango"));

        // Size of the set
        System.out.println("Size of LinkedHashSet: " + set.size());

        // Iterating through elements
        System.out.println("Iterating through LinkedHashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

	}

}
