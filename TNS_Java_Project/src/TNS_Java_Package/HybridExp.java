package TNS_Java_Package;

class A {
	public void showA() {
		System.out.println("Root class");
	}
}
class B extends A {
	public void showB() {
		System.out.println(" Child class of A ");
	}
}

class B1 extends A {
	public void showB1() {
		System.out.println(" Child class of A");
	}
}

class C extends B1 {
	public void showC() {
		System.out.println(" Child class of B1");
	}
}

class D extends C {
	public void showD() {
		System.out.println(" Child class of C");
	}
}

public class HybridExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hybrid Example:");
		B b = new B();
		b.showA();
		b.showB();
		
		D d = new D();
		d.showB1();
		d.showC();
		d.showD();
		
	}

}
