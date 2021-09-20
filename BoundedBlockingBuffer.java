public class BoundedBlockingBuffer<T> {
    private T data;
    private static boolean isEmpty = true;
    
    public synchronized T take() {
            try {
                if(isEmpty) {
                    //System.out.println("data null waiting");
                    wait();
                }
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            notify();
            isEmpty = true;
            return data;
    }
    
    public synchronized void put(T data) {
            try {
                if(!isEmpty) {
                    wait();
                } else {
                    this.data = data;
                    //System.out.println("put in the data");
                }
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            isEmpty = false;
            //System.out.println("will notify now");
            notify();
    }
    
}