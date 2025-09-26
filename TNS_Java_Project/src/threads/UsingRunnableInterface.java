package threads;

class Runnableinf implements Runnable {
	public void run() {
		for(int i =1; i<=10; i++) {
			try {
				System.out.println(i);
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class UsingRunnableInterface {

	public static void main(String[] args) {
		Runnableinf r = new Runnableinf();
		Thread t1 = new Thread(r);
		t1.start();

	}

}
