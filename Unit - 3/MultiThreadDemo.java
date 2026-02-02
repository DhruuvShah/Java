class WorkerThread extends Thread {
    String name;

    WorkerThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " is executing step " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadDemo {

    public static void main(String[] args) {
        WorkerThread t1 = new WorkerThread("Thread-1");
        WorkerThread t2 = new WorkerThread("Thread-2");

        t1.start();
        t2.start();
    }
}