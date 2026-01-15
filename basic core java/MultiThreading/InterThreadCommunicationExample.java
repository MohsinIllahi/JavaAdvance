package MultiThreading;

public class InterThreadCommunicationExample {
    public static void main(String[] args) throws InterruptedException {
        ThreadB tB= new ThreadB();
        tB.start();
      synchronized(tB){
          System.out.println("Main Thread calling wait method");
        tB.wait();
        System.out.println("Main thread got notification");
        System.out.println(tB.total);
      }
    }

}
class ThreadB extends Thread{
    int total =0;
    public void run(){
        synchronized(this){
            System.out.println("Child thread started calculation");
            for (int i = 1; i <=100; i++) {
                total+=i;
            }
            this.notify();
                        System.out.println("Child thread sent notification to main thread");

        }
    }
}
