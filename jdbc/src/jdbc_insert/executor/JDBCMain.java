package jdbc_insert.executor;

import jdbc_insert.services.CurdOperations;

public class JDBCMain {

	public static void main(String[] args) {
		CurdOperations.addStudent(101, "Toyota");
		CurdOperations.addStudent(102, "Ford");
		CurdOperations.addStudent(103, "Honda");
	}

}