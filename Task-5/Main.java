public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod creditCard = new CreditCardPayment("1234567890123456", "Abdelrahman");
        PaymentMethod paypal = new PayPalPayment("abdelrahman@example.com");

        processor.executePayment(creditCard, 150.75);
        processor.executePayment(paypal, 89.99);
    }
}