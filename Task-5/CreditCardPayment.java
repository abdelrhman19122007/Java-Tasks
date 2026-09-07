public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of $" + amount + " for " + cardHolderName + " (Card: ****" + cardNumber.substring(cardNumber.length() - 4) + ")");
    }
}