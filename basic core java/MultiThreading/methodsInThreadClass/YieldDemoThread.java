package MultiThreading.methodsInThreadClass;

public class YieldDemoThread
{
    public static void main(String[] args)
    {
        myThread t = new myThread();
        t.start();
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Main Thread");
        }

    }
}

class myThread extends Thread
{
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Child Thread");
        }
        // causes to pause current thread to give chance to the next thread
        // waiting thread with same priority.
        Thread.yield();
    }
}
