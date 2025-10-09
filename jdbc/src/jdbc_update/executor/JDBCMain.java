package jdbc_update.executor;

import jdbc_update.services.CurdOperations;

public class JDBCMain {

    public static void main(String[] args) {
        CurdOperations.updateCar(101, "Toyota Supra");
        CurdOperations.updateCar(102, "Ford Mustang");
        CurdOperations.updateCar(103, "Honda City");
    }

}
