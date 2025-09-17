package com.suharika.assignment.utilities;
import com.suharika.assignment.Employees.*;

public class EmployeeUtilities {
	public void displayEmployeeDetails(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());

        if (emp instanceof Manager) {
            System.out.println("Department: " + ((Manager) emp).getDepartment());
        } else if (emp instanceof Developer) {
            System.out.println("Programming Language: " + ((Developer) emp).getProgrammingLanguage());
        }
        System.out.println("--------------------------------");
    }
}
