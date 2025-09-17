package TNS_Java_Package;

class Parent {
	int a = 10;
}

class Child extends Parent {
	int a = 20;
	public void show() {
		int a = 30;
		int res = a + this.a + super.a; // a = 30, this.a = 20, super.a = 10
		System.out.println("Sum of all variables: " + res);
	}

}
public class superKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
		ch.show();
	}

}
