package syncronization;
public class SyncronizedBlockDemo
{
    public static void main(String[] args)
    {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Mohsin");
        MyThread t2 = new MyThread(d, "Bhutto");
        t1.start();
        t2.start();

    }
}

class Display
{
    public void wish(String name)
    { ;;;;;;
        synchronized (this)
        {
            for (int i = 0; i < 10; i++)
            {
                System.out.print("Good Morning: ");
                try
                {
                    Thread.sleep(2000);
                } catch (InterruptedException e)
                {
                    // TODO: handle exception
                }
                System.out.print(name);
            }
        }
        ;;;;;;;
    }
}

class MyThread extends Thread
{
    Display d;
    String name;

    MyThread(Display d, String name)
    {
        this.d = d;
        this.name = name;
    }

    public void run()
    {
        d.wish(name);
    }
}
