package jdbc_delete.executor;

import jdbc_delete.services.CurdOperations;

public class JDBCMain {

    public static void main(String[] args) {
        // Deleting car records by ID
        CurdOperations.deleteCar(101);
        CurdOperations.deleteCar(102);
        CurdOperations.deleteCar(103);
    }

}
