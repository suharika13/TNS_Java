package TNS_Java_Package;
import java.util.Scanner;

class Restaurant {
    // Constructor to take input
    Restaurant() {
    	String name;
        int persons4;
        long contactNo;
    }
    
    void displayBookingDetails(String name, int persons,long contactNo) {
        System.out.println("\nBooking Details:");
        System.out.println("Name: " + name);
        System.out.println("No. of Persons: " + persons);
        System.out.println("Contact Number: " + contactNo);
    }
}

class Starters extends Restaurant {
    int Soup = 150;
    int Salads = 100;
}

class MainCourses extends Restaurant {
    int naan = 50;
    int Biryani = 400;
}

class Desserts extends Restaurant {
    int Gulab_jamun = 70;
    int Brownie = 600;
}

public class hierarchicalInheritance {
    public static void main(String[] args) {
 
        Starters st = new Starters();
        st.displayBookingDetails("Suharika", 4, 92485425);
        System.out.println("Soup: " + st.Soup);
        System.out.println("Salads: " + st.Salads);

        MainCourses mc = new MainCourses(); 
        System.out.println("Naan: " + mc.naan);
        System.out.println("Biryani: " + mc.Biryani);

        Desserts de = new Desserts();
        System.out.println("Gulab_jamun: " + de.Gulab_jamun);
        System.out.println("Brownie: " + de.Brownie);

        int total = st.Soup + st.Salads + mc.naan + mc.Biryani + de.Gulab_jamun + de.Brownie;
        System.out.println("-------------------------------------");
        System.out.println("Total Bill: " + total);
    }
}

