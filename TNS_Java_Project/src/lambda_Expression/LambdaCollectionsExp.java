package lambda_Expression;
import java.util.ArrayList;
import java.util.Collections;

public class LambdaCollectionsExp {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("HTML");
        list.add("C++");

        System.out.println("Original List: " + list);

        // ⿡ Using lambda to iterate (forEach)
        System.out.println("\nUsing forEach with lambda:");
        list.forEach(language -> System.out.println("Language: " + language));

        // ⿢ Using lambda to sort (by string length)
        Collections.sort(list, (a, b) -> a.length() - b.length());
        System.out.println("\nSorted by length: " + list);

        // ⿣ Using lambda to remove elements conditionally
        list.removeIf(language -> language.startsWith("C"));
        System.out.println("After removing languages starting with 'C': " + list);

	}

}
