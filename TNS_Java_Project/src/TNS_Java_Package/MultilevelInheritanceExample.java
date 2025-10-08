package TNS_Java_Package;

//Base class
class Student {
	String name;
	int rollNumber;
	void setStudentDetails(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	void displayStudentDetails() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
	}
}

//Derived class 1 (inherits from Student)
class Graduate extends Student {
	String degree;
	void setGraduateDetails(String degree) {
		this.degree = degree;
	}

	void displayGraduateDetails() {
		System.out.println("Degree: " + degree);
	}
}

//Derived class 2 (inherits from Graduate)
class Researcher extends Graduate {
	String researchTopic;
	void setResearcherDetails(String researchTopic) {
		this.researchTopic = researchTopic;
	}

	void displayResearcherDetails() {
		System.out.println("Research Topic: " + researchTopic);
	}
}

public class MultilevelInheritanceExample {

	public static void main(String[] args) {
		Researcher r = new Researcher();
        r.setStudentDetails("Harika", 101);
        r.setGraduateDetails("MSc Computer Science");
        r.setResearcherDetails("Artificial Intelligence");

        System.out.println("=== Researcher Details ===");
        r.displayStudentDetails();
        r.displayGraduateDetails();
        r.displayResearcherDetails();

	}

}
