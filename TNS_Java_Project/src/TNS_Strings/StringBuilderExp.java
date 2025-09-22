package TNS_Strings;

public class StringBuilderExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sd = new StringBuffer("radhe"); 
		StringBuffer sd1 = new StringBuffer("krishna"); 
		System.out.println("Addind string sb1 to the end of string sb: " + sd.append(" krishna"));
		System.out.println("Char at index 8: " + sd.charAt(8));
		System.out.println("Length of string: " + sd.length());
		System.out.println("String: " + sd);
		System.out.println("Substring of string: " + sd.substring(0, 5));
		System.out.println("Deleting string: " + sd1.delete(5,7));		
		System.out.println("Reverse of string: " + sd.reverse());
	}

}
