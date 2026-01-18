package syncronization;

public class DeadlockSituationDemo extends Thread
{
    //both theads here require lock of objects to run last method 
    //but the loc is aquired by eachother at same time thats why these both threads will be waiting for each other forever.
    A a = new A();
    B b = new B();

    public void m1()
    {
        this.start();
        a.d1(b);
    }

    public void run()
    {
        b.b2(a);
    }

    public static void main(String[] args)
    {
        DeadlockSituationDemo t1 = new DeadlockSituationDemo();
        t1.m1();
    }
}

class A
{
    // call d1 by passing B object
    public synchronized void d1(B b)
    {
        System.out.println("d1 entering in sleep state");
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException e)
        {
            // TODO: handle exception
            e.getMessage();
        }
        System.out.println("Class A is trying to call last method of B");
        b.last();

    }

    // call last method
    public synchronized void last()
    {
        System.out.println("I am last method of A class");

    }
}

class B
{
    // call d1 by passing A object
    public synchronized void b2(A a)
    {
        System.out.println("d2 entering in sleep state");
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException e)
        {
            // TODO: handle exception
            e.getMessage();
        }
        System.out.println("Class B is trying to call last method of A");
        a.last();
    }

    // call last method
    public synchronized void last()
    {
        System.out.println("Last method of B class");
    }

}