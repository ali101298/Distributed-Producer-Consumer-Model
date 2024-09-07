import java.util.ArrayList;
import java.util.List;

public class DistributedProducerConsumerModel {
    public static void main(String[] args) {
        int numProducers = 5;
        int numMessageQueues = 2;
        int numProcessors = 5;

        // Creating message queues
        List<MessageQueue> messageQueues = new ArrayList<>();
        for (int i = 0; i < numMessageQueues; i++) {
            messageQueues.add(new MessageQueue());
        }

        // Creating and starting producers
        for (int i = 0; i < numProducers; i++) {
            new Thread(new Producer(messageQueues.get(i % numMessageQueues), "Producer" + (i + 1))).start();
        }

        // Creating and starting processors
        for (int i = 0; i < numProcessors; i++) {
            new Thread(new Processor(messageQueues.get(i % numMessageQueues), "Processor" + (i + 1))).start();
        }
    }
}
