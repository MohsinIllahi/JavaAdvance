
public class JoinMethodDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        myThread t = new myThread();
        t.start();
        // main thread will wait until the t Thread will complete its task then
        // main thred wil get chance of execution.
        // therad contains 3 overloaded methods for join() method and it is
        // important to handle the exception called InterruptedException because
        // it is checked exception.
        // Windows dont support yield and join as practically checked by me at
        // this time.
        t.join();
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
            try
            {
                Thread.sleep(20000);
            } catch (Exception e)
            {
                // TODO: handle exception
            }
        }

    }
}
