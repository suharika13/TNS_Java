package jdbc_insert.executor;

import jdbc_insert.services.CurdOperations;

public class JDBCMain {

	public static void main(String[] args) {
		CurdOperations.addCar(101, "Toyota");
		CurdOperations.addCar(102, "Ford");
		CurdOperations.addCar(103, "Honda");
	}

}