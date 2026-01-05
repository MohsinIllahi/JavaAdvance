package syncronization;

public class SyncronizationDemo
{
    public static void main(String[] args)
    {
        Display d = new Display();
        MyThreadCharacter tCharacter = new MyThreadCharacter(d);
        MyThreadNumber tNumber = new MyThreadNumber(d);
        tCharacter.start();
        tNumber.start();

    }
}

class Display
{
    public void displayNumber()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.print(i);
            try
            {
                Thread.sleep(2000);
            } catch (Exception e)
            {
                // TODO: handle exception
            }
        }
    }

    public void displayCharacter()
    {
        for (int i = 65; i <= 75; i++)
        {
            System.out.print((char) i);
            try
            {
                Thread.sleep(2000);
            } catch (Exception e)
            {
                // TODO: handle exception
            }
        }
    }
}

class MyThreadCharacter extends Thread
{
    Display d;

    MyThreadCharacter(Display d)
    {
        this.d = d;
    }

    public void run()
    {
        d.displayCharacter();
    }
}

class MyThreadNumber extends Thread
{
    Display d;

    MyThreadNumber(Display d)
    {
        this.d = d;
    }

    public void run()
    {
        d.displayNumber();
    }
}
