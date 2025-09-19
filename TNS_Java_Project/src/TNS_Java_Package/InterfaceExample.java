package TNS_Java_Package;

interface ParentInterface {
    void parentMethod();
}

// Child interface extending ParentInterface
interface ChildInterface extends ParentInterface {
    void childMethod();
}

class MyClass implements ChildInterface {
    // Must provide implementation for both methods
    public void parentMethod() {
        System.out.println("This is the Parent Interface.");
    }

    public void childMethod() {
        System.out.println("This is the Child Interface.");
    }
}


public class InterfaceExample {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
	    obj.parentMethod(); // Calling parent method
	    obj.childMethod();  // Calling child method
	}

}
