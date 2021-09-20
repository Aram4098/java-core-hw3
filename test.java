import java.lang.*;
public class test {
    
    public static BoundedBlockingBuffer<String> bbf = new BoundedBlockingBuffer<String>();
    public static synchronized void main(String[] args) {

        Thread1 thread1 = new Thread1();
        thread1.start();
        System.out.println("Thread1 started");
        try {
            Thread.sleep(500);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        Thread2 thread2 = new Thread2();
        System.out.println("Thread2 started");
        thread2.start();
        try {
            Thread.sleep(500);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        Thread1 thread3 = new Thread1();
        thread3.start();
        System.out.println("Thread1 started again");
        try {
            Thread.sleep(500);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        Thread2 thread4 = new Thread2();
        thread4.start();
        System.out.println("Thread2 started again");
    }
}