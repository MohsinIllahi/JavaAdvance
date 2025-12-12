
class Display
{
    // without syncronized we will get irregular output
    // with syncronized we will get output regular. one thread at time will have access of wish method  
    public synchronized void wish(String name)
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Good Morning:");

            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                // TODO: handle exception
            }
            System.out.println(name);
        }
    }
}

class MyThread extends Thread
{
    String name;
    Display d;

    MyThread(String name, Display d)
    {
        this.d = d;
        this.name = name;
    }

    public void run()
    {
        d.wish(name);
    }
}

public class SynchronizedDemo
{
    public static void main(String[] args)
    {
        Display d = new Display();
        MyThread t1 = new MyThread("Mohsin", d);
        MyThread t2 = new MyThread("Ahmed", d);
        MyThread t3 = new MyThread("Raees", d);

        t1.start();
        t2.start();
        t3.start();
    }
}
