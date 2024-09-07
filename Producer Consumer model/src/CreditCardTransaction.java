public class CreditCardTransaction {
	
    private String cardHolderName;
    private String cardNumber;
    private String expirationDate;

    // Constructor
    public CreditCardTransaction() {
    }

    // Getter and Setter methods for cardHolderName
    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    // Getter and Setter methods for cardNumber
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Getter and Setter methods for expirationDate
    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    // toString method for better representation of the object
    @Override
    public String toString() {
        return "CreditCardTransaction [cardHolderName=" + cardHolderName + ", cardNumber=" + cardNumber
                + ", expirationDate=" + expirationDate + "]";
    }
}
