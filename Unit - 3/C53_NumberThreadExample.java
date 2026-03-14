class NumberThread extends Thread {

	// Overriding run() method
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Number: " + i);

			try {
				Thread.sleep(5000); // 5000 milliseconds = 5 seconds
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted.");
			}
		}
	}
}

public class C53_NumberThreadExample {

	public static void main(String[] args) {

		// Create thread object
		NumberThread t = new NumberThread();

		// Start thread
		t.start();

		System.out.println("Thread started...");
	}
}