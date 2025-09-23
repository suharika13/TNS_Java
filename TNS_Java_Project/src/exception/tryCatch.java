package exception;

public class tryCatch {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch(Exception e) {
			System.out.println("Null values are not readable");
		}
	}

}
