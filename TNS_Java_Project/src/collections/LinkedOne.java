package collections;
import java.util.LinkedList;

public class LinkedOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();

        // Adding elements of different types
        ll.add(111);
        ll.add("Hii");
        ll.add(20.07);

        // Display the LinkedList
        System.out.println(ll);

        // Remove element at index 1
        ll.remove(1);
        System.out.println(ll);

        // Add null values
        ll.add(null);
        ll.add(null);
        System.out.println(ll);

        // Access element at index 1
        System.out.println(ll.get(1));

	}

}
