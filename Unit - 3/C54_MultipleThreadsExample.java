class MyThread extends Thread {
	String threadName;

// Constructor  
	MyThread(String name) {
		threadName = name;
	}

	// Overriding run() method
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(threadName + " : " + i);
			try {
				Thread.sleep(5000); // Pause for 5 second
			}

			catch (InterruptedException e) {
				System.out.println(threadName + " interrupted.");
			}
		}
		System.out.println(threadName + " finished execution.");
	}
}

public class C54_MultipleThreadsExample {

	public static void main(String[] args) {

		// Creating two threads
		MyThread t1 = new MyThread("Thread-1");
		MyThread t2 = new MyThread("Thread-2");

		// Starting threads
		t1.start();
		t2.start();

		System.out.println("Main thread finished execution.");
	}
}