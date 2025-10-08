package lambda_Expression;

//Functional interface annotated with @FunctionalInterface
@FunctionalInterface
interface Greeting {
void sayHello(String name);
}

public class LambdaAnnotationsExp {

	public static void main(String[] args) {
		// Lambda expression implementing the functional interface
	     Greeting greet = name -> System.out.println("Hello, " + name + "! Welcome.");

	     // Call the lambda
	     greet.sayHello("suharika");
	     greet.sayHello("Mahalaxmi");

	}

}
