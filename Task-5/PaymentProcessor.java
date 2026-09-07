public class PaymentProcessor {
    public void executePayment(PaymentMethod paymentMethod, double amount) {
        System.out.println("\n========== INITIATING TRANSACTION ==========");
        paymentMethod.processPayment(amount);
        System.out.println("Transaction completed successfully!");
        System.out.println("============================================");
    }
}