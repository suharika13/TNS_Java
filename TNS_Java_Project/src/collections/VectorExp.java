package collections;
import java.util.Vector;

public class VectorExp {

	public static void main(String[] args) {
        Vector v = new Vector();

        // Adding elements of different types
        v.add(1);
        v.add("Hema");
        v.add(11.02);

        // Display the Vector
        System.out.println(v);

        // Remove element at index 1
        v.remove(1);
        System.out.println(v);

        // Add null values
        v.add(null);
        v.add(null);
        System.out.println(v);

        // Access element at index 1
        System.out.println(v.get(1));

	}

}
