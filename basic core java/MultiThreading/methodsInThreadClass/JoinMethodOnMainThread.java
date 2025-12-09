package MultiThreading.methodsInThreadClass;

public class JoinMethodOnMainThread {
public static void main(String[] args) {
    myThread.mt= Thread.currentThread();
    myThread t = new myThread();
    t.start();
    for (int i = 0; i < 10; i++) {
        System.out.println("Main Thraed");
    }
}
}
class myThread extends Thread
{
    static Thread mt;
    
    public void run(){
    try{
        mt.join();

    
      for (int i = 0; i < 10; i++) {
        Thread.sleep(2000);
        System.out.println("Child Thraed");
    }
    }catch (InterruptedException e){

    }   
    }    
    }

