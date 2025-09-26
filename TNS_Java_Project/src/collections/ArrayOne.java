package collections;
import java.util.ArrayList;

public class ArrayOne {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(101);
		ar.add("Hello");
		ar.add(13.08);
		System.out.println(ar);
		ar.remove(1);
		System.out.println(ar);
		ar.add(null);
		ar.add(null);
		System.out.println(ar);
		System.out.println(ar.get(1));

	}

}
