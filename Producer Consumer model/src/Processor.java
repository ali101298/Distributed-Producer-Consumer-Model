public class Processor implements Runnable {
    private MessageQueue messageQueue;
    private String processorName;

    public Processor(MessageQueue messageQueue, String processorName) {
        this.messageQueue = messageQueue;
        this.processorName = processorName;
    }

    @Override
    public void run() {
        while (true) {
            CreditCardTransaction transaction = messageQueue.dequeue();
            if (transaction != null) {
                // Processing the transaction
            	System.out.println(processorName + " - Processing transaction for " + transaction.getCardHolderName() +
                        ", Card Number: " + transaction.getCardNumber() +
                        ", Expiration Date: " + transaction.getExpirationDate());
            }
        }
    }               
}

