package threads;

class threadExecuted extends Thread {
	public void run() {
		for(int i = 1; i<=10; i++) {
			try {
				System.out.println("Hello");
				Thread.sleep(2000);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class UsingThreadClass {

	public static void main(String[] args) {
		threadExecuted t = new threadExecuted();
		t.start();

	}

}
