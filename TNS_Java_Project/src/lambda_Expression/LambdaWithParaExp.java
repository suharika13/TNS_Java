package lambda_Expression;

interface MessageFormatter {
    void format(String name, String city);
}

public class LambdaWithParaExp {

	public static void main(String[] args) {
		// Lambda expression with parameters (no operators used)
        MessageFormatter formatter = (name, city) -> {
            System.out.println("Hello, " + name + "! Welcome from " + city + ".");
        };

        // Calling the lambda
        formatter.format("suharika", "Hyderabad");
        formatter.format("Mahalaxmi", "hyderabad");


	}

}
