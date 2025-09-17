package TNS_Java_Package;

class Sample {
	int a = 10;
	public void show () {
		int a = 20;
		System.out.println("Local Variable: " + a);    // 20
		System.out.println("Instance Variable: " + this.a);    // 10 
	}
}
public class thisKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		s.show();
	}

}
