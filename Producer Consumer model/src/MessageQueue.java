
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MessageQueue {
    private BlockingQueue<CreditCardTransaction> queue;

    public MessageQueue() {
        this.queue = new LinkedBlockingQueue<>();
    }

    public void enqueue(CreditCardTransaction transaction) {
        try {
            queue.put(transaction);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public CreditCardTransaction dequeue() {
        try {
            return queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}