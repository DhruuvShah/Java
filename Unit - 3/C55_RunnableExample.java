class MyRunnable implements Runnable {

	// Step 2: Override run() method
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Runnable Thread is running: " + i);

			try {
				Thread.sleep(2000); // 2 second delay
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted.");
			}
		}

		System.out.println("Runnable Thread finished execution.");
	}
}

public class C55_RunnableExample {

	public static void main(String[] args) {

		// Step 3: Create Thread object and pass Runnable instance
		Thread t = new Thread(new MyRunnable());

		// Step 4: Start the thread
		t.start();

		System.out.println("Main thread continues...");
	}
}