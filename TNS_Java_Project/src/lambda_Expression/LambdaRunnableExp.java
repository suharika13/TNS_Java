package lambda_Expression;

public class LambdaRunnableExp {

	public static void main(String[] args) {
        // Lambda expression implementing Runnable interface
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Running in thread: " + Thread.currentThread().getName() + " → Count: " + i);
                try {
                    Thread.sleep(500); // pause for half a second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Creating and starting the thread
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        // Main thread message
        System.out.println("Main thread: " + Thread.currentThread().getName());
	}

}
