package syncronization;

public class DaemonThreadDemo
{
    public static void main(String[] args)
    {
        ChildThread t = new ChildThread();
        t.setDaemon(true);
        // there is no gurrantee of completion of daemon thread
        // it may only get triggered after last non daemon thread or not.
        t.start();
        System.out.println("End of main thread");
    }
}

class ChildThread extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 10; i++)
        {
            System.out.println("Child Thread");
            try
            {
                Thread.sleep(2000);
            } catch (InterruptedException e)
            {
                // TODO: handle exception
            }
        }
    }
}
