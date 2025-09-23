package exception;

public class throwKey {

    public static void main(String[] args) {
        int age = 4;
        if (age <= 18) {
            throw new ArithmeticException("NotEligible");
        } else {
            System.out.println("Eligible");
        }
    }
}

