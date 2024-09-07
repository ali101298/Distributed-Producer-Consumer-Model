import java.util.Random;

public class Producer implements Runnable {
    private MessageQueue messageQueue;
    private String producerName;

    public Producer(MessageQueue messageQueue, String producerName) {
        this.messageQueue = messageQueue;
        this.producerName = producerName;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 100001; i++) {
            CreditCardTransaction transaction = new CreditCardTransaction();
            // Setting transaction details for random data
            transaction.setCardHolderName(producerName + " - Transaction " + i + ", Card Holder Name: First_Name Last_Name");
            transaction.setCardNumber("1234-5678-9012-3456");
            transaction.setExpirationDate("12/25");

            messageQueue.enqueue(transaction);

           
        }
    }
}