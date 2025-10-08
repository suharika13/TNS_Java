package collections;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// Create a Stack
        Stack<Integer> stack = new Stack<>();

        // Push elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the stack
        System.out.println("Stack elements: " + stack);

        // Peek (see the top element)
        System.out.println("Top element (peek): " + stack.peek());

        // Pop elements (remove top element)
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

	}

}
