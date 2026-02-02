class PriorityThread extends Thread {
    public void run() {
        System.out.println("Running Thread: " + Thread.currentThread().getName() +
                " | Priority: " + Thread.currentThread().getPriority());
    }
}

public class PriorityDemo {

    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        PriorityThread t3 = new PriorityThread();

        t1.setName("Low Priority Thread");
        t2.setName("Normal Priority Thread");
        t3.setName("Max Priority Thread");

        // Setting Priorities
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
        t3.start();
    }
}