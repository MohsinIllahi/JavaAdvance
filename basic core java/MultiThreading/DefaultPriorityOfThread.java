package MultiThreading;

public class DefaultPriorityOfThread {
    public static void main(String[] args) {
        System.out.println("Main Thread's priority: " + Thread.currentThread().getPriority());
        myThread t = new myThread();
        t.start();

        /*
         * Thread Dumping/Stack Trace: is a snapshot
         * of the state of all threads running in a Java application at a specific point
         * in time.
         * It provides information about the threads' current state, including their
         * stack
         * traces, which show the method call sequence for each thread.
         * .getAllStackTraces()
         */
        System.out.println(t.getAllStackTraces());
        // setPriority: some OS like WindowsXP dont support this.
        t.setPriority(10);

    }
}

class myThread extends Thread {
    public void run() {
        System.out.println("Child thread's priority :" + Thread.currentThread().getPriority());
        threadInThread th = new threadInThread();
        th.start();
    }
}

class threadInThread extends myThread {

    public void run() {
        System.out.println("Thread priority inner thread :" + Thread.currentThread().getPriority());

    }
}
