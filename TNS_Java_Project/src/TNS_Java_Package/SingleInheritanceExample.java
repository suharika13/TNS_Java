package TNS_Java_Package;

//Parent class
class Vehicle {
	String brand = "Toyota";
 	void startEngine() {
 		System.out.println("Engine started...");
 	}
}

//Child class (inherits from Vehicle)
class Truck extends Vehicle {
	String model = "Corolla";
	void displayDetails() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model); 
	}
}

public class SingleInheritanceExample {
	public static void main(String[] args) {
		Truck tr = new Truck();  // Create object of child class
        tr.startEngine();    // Access method from parent class
        tr.displayDetails(); // Access method from child class
    }
}
