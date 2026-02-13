import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;
    public SharedBuffer(int bufferSize) {
        sharedBuffer = new LinkedList<>(); // queue as linkedlist
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (sharedBuffer.size() == bufferSize) {
            System.out.println("Buffer Is full");
            wait();
        }
        sharedBuffer.add(value);
        System.out.println("Produced: " + value);
        notifyAll();
    }
    public synchronized int consume() throws InterruptedException {
        while (sharedBuffer.isEmpty()) {
            System.out.println("Buffer is empty waiting for producer");
            wait();
        }
        int value = sharedBuffer.poll();
        System.out.println("Consumed: " + value);
        notifyAll();
        return value;
    }

}
