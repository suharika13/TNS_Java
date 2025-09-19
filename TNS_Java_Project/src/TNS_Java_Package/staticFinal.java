package TNS_Java_Package;

class Base {
	final int a = 30;
	static char ch = 'R';
	
}
public class staticFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Base();
		System.out.println("Final word: " + b.a);
		System.out.println("static word: " + Base.ch);
			
		
	}

}
