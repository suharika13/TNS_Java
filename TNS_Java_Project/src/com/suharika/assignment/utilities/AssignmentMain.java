import com.suharika.assignment.Employees.*;
import com.suharika.assignment.utilities.*;

/**
 * Main class to run the assignment
 */

public class AssignmentMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1 = new Manager("Alice", 101, 80000, "HR");
        Developer d1 = new Developer("Bob", 102, 60000, "Java");
        EmployeeUtilities utils = new EmployeeUtilities();
        utils.displayEmployeeDetails(m1);
        utils.displayEmployeeDetails(d1);
	}

}
