package TNS_Java_Package;

import com.suharika.assignment.Employees.Developer;
import com.suharika.assignment.Employees.Manager;
import com.suharika.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1 = new Manager("krishna", 101, 80000, "HR");
        Developer d1 = new Developer("Ram", 102, 60000, "Java");
        EmployeeUtilities utils = new EmployeeUtilities();
        utils.displayEmployeeDetails(m1);
        utils.displayEmployeeDetails(d1);
	}
}
