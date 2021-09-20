public class Thread1 extends Thread {
    public void run() {
        System.out.println(test.bbf.take() + " from thread " + getId());
    }
}