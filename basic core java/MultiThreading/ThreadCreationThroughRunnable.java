package MultiThreading;

public class ThreadCreationThroughRunnable {
    public static void main(String[] args) throws InterruptedException{
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        // t.join();
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread"+i);
        }
    }

}

class MyRunnable implements Runnable
{
    public void run()
    {
for (int i = 0; i < 5; i++) {
            System.out.println("child thread"+i);
        }    }
}
