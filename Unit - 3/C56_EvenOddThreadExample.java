class EvenThread extends Thread {

	public void run() {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println("Even Thread: " + i);
			}

			try {
				Thread.sleep(500); // 0.5 second delay
			} catch (InterruptedException e) {
				System.out.println("Even thread interrupted.");
			}
		}
	}
}

// Thread for printing odd numbers 
class OddThread extends Thread {

	public void run() {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.println("Odd Thread: " + i);
			}

			try {
				Thread.sleep(500); // 0.5 second delay
			} catch (InterruptedException e) {
				System.out.println("Odd thread interrupted.");
			}
		}
	}
}

public class C56_EvenOddThreadExample {

	public static void main(String[] args) {

		EvenThread t1 = new EvenThread();
		OddThread t2 = new OddThread();

		t1.start();
		t2.start();

		System.out.println("Both threads started...");
	}
}