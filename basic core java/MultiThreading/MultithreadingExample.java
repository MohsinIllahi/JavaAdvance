package MultiThreading;
class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        MyThread th = new MyThread();
        th.start(); //---> here the thread will be created thread will in a runnable state after this start method
       //th.run();--> job of a thread will be performed here in the run method.
  for (int i = 0; i < 10; i++) {
            System.out.println("Parent Thread");
        }
    }
}
