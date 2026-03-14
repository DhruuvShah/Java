class HelloThread extends Thread {

	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello, World! (" + i + ")");

			try {
				Thread.sleep(5000); // 5000 milliseconds = 5 seconds
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted.");
			}
		}
	}
}

public class C52_HelloWorldThreadExample {

	public static void main(String[] args) {

		// Create thread object
		HelloThread t = new HelloThread();

		t.start();

		System.out.println("Thread started...");
	}
}