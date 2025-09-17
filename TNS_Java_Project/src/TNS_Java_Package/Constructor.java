package TNS_Java_Package;

class expCon {
	expCon() {
		System.out.println("Default constructor");
	}
	expCon(int a) {
		System.out.println("Parameterised constructor");
		System.out.println("value: " + a);
	}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		expCon dc = new expCon();
		expCon pc = new expCon(10);
	}

}
