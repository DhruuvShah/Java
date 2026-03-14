class PriorityThread extends Thread {
	String name;

	public PriorityThread(String name2) {
		name = name2;
	}

	public void run() {

		for (int i = 1; i <= 3; i++) {
			System.out.println(name + " - Priority: " + Thread.currentThread().getPriority() + " - Count: " + i);
		}
	}
}

public class C57_ThreadPriorityExample {

	public static void main(String[] args) {

		PriorityThread t1 = new PriorityThread("Low Priority Thread");
		PriorityThread t2 = new PriorityThread("Normal Priority Thread");
		PriorityThread t3 = new PriorityThread("High Priority Thread");

		// Setting priorities
		t1.setPriority(Thread.MIN_PRIORITY); // 1
		t2.setPriority(Thread.NORM_PRIORITY); // 5 (default)
		t3.setPriority(Thread.MAX_PRIORITY); // 10

		// Starting threads
		t1.start();
		t2.start();
		t3.start();
	}
}