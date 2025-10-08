package collections;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {

        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate element, will not be added

        // Display the HashSet
        System.out.println("HashSet elements: " + set);

        // Check if an element exists
        System.out.println("Contains 'Banana'? " + set.contains("Banana"));

        // Remove an element
        set.remove("Cherry");
        System.out.println("After removing 'Cherry': " + set);

        // Check the size
        System.out.println("Size of HashSet: " + set.size());

        // Iterate through elements
        System.out.println("Iterating over elements:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
